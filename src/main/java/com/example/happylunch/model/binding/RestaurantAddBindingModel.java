package com.example.happylunch.model.binding;

import com.example.happylunch.model.enums.AreaNameEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;

public class RestaurantAddBindingModel {


    private Long id;
    private String name;
    private String address;
    private AreaNameEnum area;
    private String phoneNumber;
    private String pictures;
    private String description;

    public RestaurantAddBindingModel() {
    }


    public Long getId() {
        return id;
    }

    public RestaurantAddBindingModel setId(Long id) {
        this.id = id;
        return this;
    }

    @NotBlank
    public String getName() {
        return name;
    }

    public RestaurantAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank
    @Size(min = 10)
    public String getAddress() {
        return address;
    }

    public RestaurantAddBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public AreaNameEnum getArea() {
        return area;
    }

    public RestaurantAddBindingModel setArea(AreaNameEnum area) {
        this.area = area;
        return this;
    }

    @NotBlank
    @Pattern(regexp="^\\d{10}$")
    @Size(min = 10, max = 10)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RestaurantAddBindingModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPictures() {
        return pictures;
    }

    public RestaurantAddBindingModel setPictures(String pictures) {
        this.pictures = pictures;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
