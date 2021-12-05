package com.example.happylunch.service.impl;

import com.example.happylunch.model.entity.RoleEntity;
import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import com.example.happylunch.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HappyLunchUserServiceImplTest {
    private UserEntity testUser;
    private RoleEntity adminRole, restaurantRole, userRole;

    private HappyLunchUserServiceImpl serviceToTest;

    @Mock
    private UserRepository mockUserRepository;

    @BeforeEach
    void init() {

        //ARRANGE
        serviceToTest = new HappyLunchUserServiceImpl(mockUserRepository);

        adminRole = new RoleEntity();
        adminRole.setRole(RoleNameEnum.ADMIN);

        restaurantRole = new RoleEntity();
        restaurantRole.setRole(RoleNameEnum.RESTAURANT);

        userRole = new RoleEntity();
        userRole.setRole(RoleNameEnum.USER);

        testUser = new UserEntity();
        testUser.setUsername("elica");
        testUser.setEmail("elitca@abv.com");
        testUser.setPassword("12345");
        testUser.setRoles(Set.of(adminRole, userRole, restaurantRole));
    }

    @Test
    void testUserNotFound() {
        Assertions.assertThrows(
                UsernameNotFoundException.class,
                () -> serviceToTest.loadUserByUsername("somebody")
        );
    }

    @Test
    void testUserFound() {

        // Arrange
        Mockito.when(mockUserRepository.findByUsername(testUser.getUsername())).
                thenReturn(Optional.of(testUser));

        // Act
        var actual = serviceToTest.loadUserByUsername(testUser.getUsername());

        // Assert

        String expectedRoles = "ROLE_ADMIN, ROLE_RESTAURANT, ROLE_USER";
        String actualRoles = actual.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(
                Collectors.joining(", "));

        Assertions.assertEquals(actual.getUsername(), testUser.getUsername());
        Assertions.assertEquals(expectedRoles, actualRoles);
    }

}