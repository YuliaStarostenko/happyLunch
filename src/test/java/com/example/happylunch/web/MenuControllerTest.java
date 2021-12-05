package com.example.happylunch.web;

import com.example.happylunch.model.entity.MenuEntity;
import com.example.happylunch.repository.MenuRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Optional;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser(username="admin",roles={"USER", "RESTAURANT", "ADMIN"})
class MenuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MenuRepository menuRepository;

    @AfterEach
    void tearDown() {
        menuRepository.deleteAll();
    }

    @Test
    void testOpenAddMenuForm() throws Exception {
        mockMvc.
                perform(get("/menus/add"))
                .andExpect(status().isOk())
                .andExpect(view().name("menu-add"));
    }


    @Test
    void testAddMenu() throws Exception {
        mockMvc.perform(post("/menus/add").
                        param("mealName", "Chili con carne").
                        param("weight", String.valueOf(350)).
                        param("price", String.valueOf(BigDecimal.valueOf(8.00))).
                        param("restaurantName","Cardamon").
                        with(csrf()).
                        contentType(MediaType.APPLICATION_FORM_URLENCODED)
                ).
                andExpect(status().is3xxRedirection());

        Assertions.assertEquals(1, menuRepository.count());

        Optional<MenuEntity> newlyCreatedMenuOpt = menuRepository.findByMealName("Chili con carne");

        Assertions.assertTrue(newlyCreatedMenuOpt.isPresent());

        MenuEntity newlyCreatedMenu = newlyCreatedMenuOpt.get();

        Assertions.assertEquals("Chili con carne", newlyCreatedMenu.getMealName());
        Assertions.assertEquals(350, newlyCreatedMenu.getWeight());


    }

    @Test
    void testOpenChilrenMenu() throws Exception {
        mockMvc.
                perform(get("/menu/children"))
                .andExpect(status().isOk())
                .andExpect(view().name("children"));
    }


}