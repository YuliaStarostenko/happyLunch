package com.example.happylunch.model.service;

import java.math.BigDecimal;

public class MenuAddServiceModel {

    private Long id;
    private String mealName;
    private Integer weight;
    private BigDecimal price;
    private String restaurantName;

    public MenuAddServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public MenuAddServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMealName() {
        return mealName;
    }

    public MenuAddServiceModel setMealName(String mealName) {
        this.mealName = mealName;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public MenuAddServiceModel setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public MenuAddServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public MenuAddServiceModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }
}
