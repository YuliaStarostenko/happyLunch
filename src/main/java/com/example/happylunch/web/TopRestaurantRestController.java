package com.example.happylunch.web;

import com.example.happylunch.model.view.RestaurantViewModel;
import com.example.happylunch.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopRestaurantRestController {

    private final RestaurantService restaurantService;

    public TopRestaurantRestController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurants/top")
    public ResponseEntity<RestaurantViewModel> getTopRestaurant(){

        return ResponseEntity.ok(restaurantService.findTopRestaurant());
    }

}
