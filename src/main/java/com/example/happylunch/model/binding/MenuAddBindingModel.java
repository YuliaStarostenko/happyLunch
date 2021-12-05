package com.example.happylunch.model.binding;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class MenuAddBindingModel {


    private Long id;
    private String mealName;
    private Integer weight;
    private BigDecimal price;
    private String restaurantName;

    public MenuAddBindingModel() {
    }

    public Long getId() {
        return id;
    }

    public MenuAddBindingModel setId(Long id) {
        this.id = id;
        return this;
    }

    @NotBlank
    public String getMealName() {
        return mealName;
    }

    public MenuAddBindingModel setMealName(String mealName) {
        this.mealName = mealName;
        return this;
    }


    public Integer getWeight() {
        return weight;
    }

    public MenuAddBindingModel setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @NotNull
    @Positive
    public BigDecimal getPrice() {
        return price;
    }

    public MenuAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }


    @NotBlank
    public String getRestaurantName() {
        return restaurantName;
    }

    public MenuAddBindingModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }
}
