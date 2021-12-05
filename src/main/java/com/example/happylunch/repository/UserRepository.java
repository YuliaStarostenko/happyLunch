package com.example.happylunch.repository;

import com.example.happylunch.model.entity.RoleEntity;
import com.example.happylunch.model.entity.UserEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByUsernameIgnoreCase(String username);
}
