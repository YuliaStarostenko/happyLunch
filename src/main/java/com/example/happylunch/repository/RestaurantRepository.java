package com.example.happylunch.repository;

import com.example.happylunch.model.entity.RestaurantEntity;
import com.example.happylunch.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
    RestaurantEntity findByName(String name);

    RestaurantEntity findByUsersLiked(UserEntity usersLiked);
}
