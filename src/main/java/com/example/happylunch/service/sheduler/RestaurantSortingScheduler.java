package com.example.happylunch.service.sheduler;

import com.example.happylunch.service.MenuService;
import com.example.happylunch.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RestaurantSortingScheduler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestaurantSortingScheduler.class);

    private final RestaurantService restaurantService;


    public RestaurantSortingScheduler(RestaurantService restaurantService) {

        this.restaurantService = restaurantService;
    }


    @Scheduled(fixedRate = 3600000)
    public void sortRestaurantWithMostLikes() {
        String restaurantName = restaurantService.findRestaurantWithMostLikes();
        LOGGER.info("The restaurant with most likes is " + restaurantName);

    }
}
