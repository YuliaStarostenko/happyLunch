package com.example.happylunch.web;

import com.example.happylunch.model.entity.MenuEntity;
import com.example.happylunch.model.entity.RestaurantEntity;
import com.example.happylunch.model.enums.AreaNameEnum;
import com.example.happylunch.repository.MenuRepository;
import com.example.happylunch.repository.RestaurantRepository;
import org.hibernate.ObjectNotFoundException;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser(username="admin",roles={"USER", "RESTAURANT", "ADMIN"})
class RestaurantControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private RestaurantRepository restaurantRepository;


    private RestaurantEntity testRestaurant;


    @BeforeEach
    void setUp() {

            testRestaurant = new RestaurantEntity();
            testRestaurant.setName("TestRestaurant");
            testRestaurant.setAddress("TestAddress, Burgas");
            testRestaurant.setPhoneNumber("0778589635");
            testRestaurant.setDescription("We are cool restaurant");
            testRestaurant.setArea(AreaNameEnum.AKATSIITE);
            testRestaurant.setLikes(1L);

            restaurantRepository.save(testRestaurant);

    }


    @AfterEach
    void tearDown() {
        restaurantRepository.deleteAll();
    }

    @Test
    void testOpenAllRestaurants() throws Exception {
        mockMvc.
                perform(get("/restaurants/all"))
                .andExpect(status().isOk())
                .andExpect(view().name("restaurants"));
    }

    @Test
    void testOpenRestaurantDetails() throws Exception {
        long id = testRestaurant.getId();
        mockMvc.
                perform(get("/restaurants/details/" + id))
                .andExpect(status().isOk())
                .andExpect(view().name("details"));
    }

    @Test
    void testOpenAddRestaurantForm() throws Exception {
        mockMvc.
                perform(get("/restaurants/add"))
                .andExpect(status().isOk())
                .andExpect(view().name("restaurant-add"));
    }

    @Test
    void testAddRestaurant() throws Exception {
        mockMvc.perform(post("/restaurants/add").
                        param("id", String.valueOf(26L)).
                        param("name", "MyNew").
                        param("address", "Home in Krastavicata near the beach").
                        param("phoneNumber", "0998596396").
                        param("description", "MMM").
                        param("area", String.valueOf(AreaNameEnum.LAZUR)).
                        param("likes", String.valueOf(5L)).
                        with(csrf()).
                        contentType(MediaType.APPLICATION_FORM_URLENCODED)
                ).
                andExpect(status().is3xxRedirection());

        Assertions.assertEquals(2, restaurantRepository.count());

       RestaurantEntity addedRestaurant = restaurantRepository.findByName("MyNew");

        Assertions.assertEquals("MyNew", addedRestaurant.getName());
        Assertions.assertEquals("Home in Krastavicata near the beach", addedRestaurant.getAddress());
        Assertions.assertEquals("0998596396", addedRestaurant.getPhoneNumber());
        Assertions.assertEquals("MMM", addedRestaurant.getDescription());


    }

    @Test
    void testDeleteRestaurant() throws Exception {

        long id = testRestaurant.getId();
        mockMvc.
                perform(delete("/restaurants/" + id)
                        .with(csrf()))
                .andExpect(status().is3xxRedirection());

        Assertions.assertEquals(0, restaurantRepository.count());

    }




}