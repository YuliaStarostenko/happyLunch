package com.example.happylunch.service;

import com.example.happylunch.model.binding.MenuAddBindingModel;
import com.example.happylunch.model.binding.RestaurantAddBindingModel;
import com.example.happylunch.model.entity.RestaurantEntity;
import com.example.happylunch.model.view.RestaurantFullViewModel;
import com.example.happylunch.model.view.RestaurantViewModel;
import org.springframework.http.ResponseEntity;

import java.security.Principal;
import java.util.List;

public interface RestaurantService {
    List<RestaurantViewModel> findAllRestaurants();

    RestaurantEntity findRestaurantById(Long id);

    RestaurantEntity findByRestaurantName(String name);

    RestaurantFullViewModel findRestaurantDetails(Long id);

    void like(Long id, Principal principal);

    void addRestaurant(RestaurantAddBindingModel restaurantAddBindingModel);

    void deleteRestaurant(Long id, String name);

    String findRestaurantWithMostLikes();

    RestaurantViewModel findTopRestaurant();
}
