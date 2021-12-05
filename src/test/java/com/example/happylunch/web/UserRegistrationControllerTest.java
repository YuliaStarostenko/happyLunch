package com.example.happylunch.web;

import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import com.example.happylunch.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class UserRegistrationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    void testOpenRegisterForm() throws Exception {
        mockMvc.
                perform(get("/users/register"))
                .andExpect(status().isOk())
                .andExpect(view().name("register"));
    }


    @Test
    void testRegisterUser() throws Exception {
        mockMvc.perform(post("/users/register").
                        param("username", "simeon").
                        param("fullName","Simeon Simeonov").
                        param("email", "simeon@abv.bg").
                        param("phoneNumber","0889582698").
                        param("role","USER").
                        param("password","12345").
                        param("confirmPassword","12345").
                        with(csrf()).
                        contentType(MediaType.APPLICATION_FORM_URLENCODED)
                ).
                andExpect(status().is3xxRedirection());

        Assertions.assertEquals(4, userRepository.count());

        Optional<UserEntity> newlyCreatedUserOpt = userRepository.findByUsername("simeon");

        Assertions.assertTrue(newlyCreatedUserOpt.isPresent());

        UserEntity newlyCreatedUser = newlyCreatedUserOpt.get();

        Assertions.assertEquals("Simeon Simeonov", newlyCreatedUser.getFullName());
        Assertions.assertEquals("simeon@abv.bg", newlyCreatedUser.getEmail());
        Assertions.assertEquals("0889582698", newlyCreatedUser.getPhoneNumber());

    }

}