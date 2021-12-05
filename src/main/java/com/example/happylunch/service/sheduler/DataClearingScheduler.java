package com.example.happylunch.service.sheduler;

import com.example.happylunch.service.MenuService;
import com.example.happylunch.service.RecipeService;
import com.example.happylunch.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class DataClearingScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataClearingScheduler.class);
    private final MenuService menuService;



    public DataClearingScheduler(MenuService menuService) {
        this.menuService = menuService;

    }

    @Scheduled(cron = "0 0 0 * * *")
    public void deleteMenus(){
        menuService.deleteMenusOfTheDay();
        LOGGER.info("Menus cleared!");
    }


}
