package com.example.happylunch.model.view;

public class RestaurantViewModel {

    private Long id;
    private String name;
    private String pictureUrl;

    public RestaurantViewModel() {
    }

    public Long getId() {
        return id;
    }

    public RestaurantViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public RestaurantViewModel setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
}
