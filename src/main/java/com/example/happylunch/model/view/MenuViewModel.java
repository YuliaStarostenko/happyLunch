package com.example.happylunch.model.view;

import com.example.happylunch.model.entity.RestaurantEntity;

import java.math.BigDecimal;

public class MenuViewModel {

    private Long id;
    private String mealName;
    private Integer weight;
    private BigDecimal price;
    private String restaurant;

    public MenuViewModel() {
    }

    public Long getId() {
        return id;
    }

    public MenuViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMealName() {
        return mealName;
    }

    public MenuViewModel setMealName(String mealName) {
        this.mealName = mealName;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public MenuViewModel setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public MenuViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public MenuViewModel setRestaurant(String restaurant) {
        this.restaurant = restaurant;
        return this;
    }
}
