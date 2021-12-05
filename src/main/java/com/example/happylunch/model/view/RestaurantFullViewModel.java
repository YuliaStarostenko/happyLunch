package com.example.happylunch.model.view;

import com.example.happylunch.model.entity.PictureEntity;
import com.example.happylunch.model.entity.RecipeEntity;
import com.example.happylunch.model.enums.AreaNameEnum;

import java.util.List;
import java.util.Set;

public class RestaurantFullViewModel {

    private Long id;
    private String name;
    private String address;
    private AreaNameEnum area;
    private String phoneNumber;
    private String picture;
    private Long likes;
    private String description;

    public RestaurantFullViewModel() {
    }

    public Long getId() {
        return id;
    }

    public RestaurantFullViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantFullViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantFullViewModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public AreaNameEnum getArea() {
        return area;
    }

    public RestaurantFullViewModel setArea(AreaNameEnum area) {
        this.area = area;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RestaurantFullViewModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public RestaurantFullViewModel setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public Long getLikes() {
        return likes;
    }

    public RestaurantFullViewModel setLikes(Long likes) {
        this.likes = likes;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantFullViewModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
