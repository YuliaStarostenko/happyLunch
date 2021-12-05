package com.example.happylunch.init;

import com.example.happylunch.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsersInit implements CommandLineRunner {

    private final UserService userService;

    public UsersInit(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        userService.initializeUsersAndRoles();
    }
}
