package com.example.happylunch.repository;

import com.example.happylunch.model.entity.MenuEntity;
import com.example.happylunch.model.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
    List<MenuEntity> findByRestaurant(RestaurantEntity restaurant);

    void deleteAllByRestaurant(RestaurantEntity restaurant);


    Optional<MenuEntity> findByMealName(String mealName);
}
