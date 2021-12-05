package com.example.happylunch.service.impl;

import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HappyLunchUserServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public HappyLunchUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity =
                userRepository.findByUsername(username).
                        orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " not found!"));

        return mapToUserDetails(userEntity);
    }

    private static UserDetails mapToUserDetails(UserEntity userEntity) {

        // GrantedAuthority is the representation of a user role in the
        // spring world. SimpleGrantedAuthority is an implementation of GrantedAuthority
        // which spring provides for our convenience.
        // Our representation of role is UserRoleEntity
        List<GrantedAuthority> auhtorities =
                userEntity.
                        getRoles().
                        stream().
                        map(r -> new SimpleGrantedAuthority("ROLE_" + r.getRole().name())).
                        collect(Collectors.toList());

        // User is the spring implementation of UserDetails interface.
        return new HappyLunchUser(
                userEntity.getUsername(),
                userEntity.getPassword(),
                auhtorities
        );
    }
}
