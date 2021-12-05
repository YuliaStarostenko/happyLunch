package com.example.happylunch.service.impl;

import com.example.happylunch.model.entity.RoleEntity;
import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import com.example.happylunch.model.service.UserRegisterServiceModel;
import com.example.happylunch.repository.RoleRepository;
import com.example.happylunch.repository.UserRepository;
import com.example.happylunch.service.UserService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final HappyLunchUserServiceImpl happyLunchUserService;

    public UserServiceImpl(PasswordEncoder passwordEncoder,
                           UserRepository userRepository,
                           RoleRepository roleRepository, HappyLunchUserServiceImpl happyLunchUserService) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.happyLunchUserService = happyLunchUserService;
    }


    @Override
    public void registerAndLoginUser(UserRegisterServiceModel userRegisterServiceModel) {

        //RoleEntity userRole = roleRepository.findByRole(RoleNameEnum.USER);

        RoleEntity userRole = roleRepository.findByRole(userRegisterServiceModel.getRole());

        UserEntity newUser = new UserEntity();

        newUser.setUsername(userRegisterServiceModel.getUsername());
        newUser.setFullName(userRegisterServiceModel.getFullName());
        newUser.setPassword(passwordEncoder.encode(userRegisterServiceModel.getPassword()));
        newUser.setEmail(userRegisterServiceModel.getEmail());
        newUser.setPhoneNumber(userRegisterServiceModel.getPhoneNumber());
        newUser.setRoles(Set.of(userRole));

        userRepository.save(newUser);

        UserDetails principal = happyLunchUserService.loadUserByUsername(newUser.getUsername());
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                principal,
                newUser.getPassword(),
                principal.getAuthorities()
        );

        SecurityContextHolder.
                getContext().
                setAuthentication(authentication);
    }

    public boolean isUserNameFree(String username) {
        return userRepository.findByUsernameIgnoreCase(username).isEmpty();
    }

    @Override
    public void initializeUsersAndRoles() {
        initializeRoles();
        initializeUsers();
    }

    private void initializeUsers() {

        if (userRepository.count() == 0){
            RoleEntity adminRole = roleRepository.findByRole(RoleNameEnum.ADMIN);
            RoleEntity restaurantRole = roleRepository.findByRole(RoleNameEnum.RESTAURANT);
            RoleEntity userRole = roleRepository.findByRole(RoleNameEnum.USER);

            UserEntity admin = new UserEntity();

            admin.setUsername("admin");
            admin.setEmail("admin@abv.bg");
            admin.setFullName("Mega Admin");
            admin.setPhoneNumber("0889526985");
            admin.setPassword(passwordEncoder.encode("12345"));

            admin.setRoles(Set.of(adminRole, restaurantRole, userRole));
            userRepository.save(admin);

            UserEntity butlers = new UserEntity();

            butlers.setUsername("butlers");
            butlers.setEmail("butlers@abv.bg");
            butlers.setFullName("Petja Petrova");
            butlers.setPhoneNumber("0889526926");
            butlers.setPassword(passwordEncoder.encode("12345"));

            butlers.setRoles(Set.of(restaurantRole, userRole));
            userRepository.save(butlers);

            UserEntity daniel = new UserEntity();

            daniel.setUsername("daniel");
            daniel.setEmail("daniel@abv.bg");
            daniel.setFullName("Daniel Danielov");
            daniel.setPhoneNumber("0999526928");
            daniel.setPassword(passwordEncoder.encode("12345"));

            daniel.setRoles(Set.of(userRole));
            userRepository.save(daniel);

        }

    }

    private void initializeRoles() {
        if (roleRepository.count() == 0){
            RoleEntity adminRole = new RoleEntity();
            adminRole.setRole(RoleNameEnum.ADMIN);

            RoleEntity restaurantRole = new RoleEntity();
            restaurantRole.setRole(RoleNameEnum.RESTAURANT);

            RoleEntity userRole = new RoleEntity();
            userRole.setRole(RoleNameEnum.USER);

            roleRepository.saveAll(List.of(adminRole, restaurantRole, userRole));
        }
    }
}

