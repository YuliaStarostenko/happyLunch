package com.example.happylunch.model.service;

import com.example.happylunch.model.enums.AreaNameEnum;

public class RestaurantAddServiceModel {
    private Long id;
    private String name;
    private String address;
    private AreaNameEnum area;
    private String phoneNumber;
    private String pictures;
    private String description;

    public RestaurantAddServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public RestaurantAddServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantAddServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantAddServiceModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public AreaNameEnum getArea() {
        return area;
    }

    public RestaurantAddServiceModel setArea(AreaNameEnum area) {
        this.area = area;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RestaurantAddServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPictures() {
        return pictures;
    }

    public RestaurantAddServiceModel setPictures(String pictures) {
        this.pictures = pictures;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantAddServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
