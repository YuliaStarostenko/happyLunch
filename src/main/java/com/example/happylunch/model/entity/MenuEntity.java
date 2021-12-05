package com.example.happylunch.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "menus")
public class MenuEntity extends BaseEntity {

    private String mealName;
    private Integer weight;
    private BigDecimal price;
    private RestaurantEntity restaurant;

    public MenuEntity() {
    }

    @Column(nullable = false)
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Column(nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @ManyToOne
    public RestaurantEntity getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantEntity restaurant) {
        this.restaurant = restaurant;
    }
}
