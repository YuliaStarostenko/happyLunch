package com.example.happylunch.repository;


import com.example.happylunch.model.entity.RoleEntity;
import com.example.happylunch.model.enums.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByRole(RoleNameEnum roleNameEnum);
}
