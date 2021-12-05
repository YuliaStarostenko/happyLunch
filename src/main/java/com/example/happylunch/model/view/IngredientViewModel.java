package com.example.happylunch.model.view;

public class IngredientViewModel {

    private Long id;
    private String name;
    private Integer quantity;
    private String measure;
    private Long restaurantId;

    public IngredientViewModel() {
    }

    public Long getId() {
        return id;
    }

    public IngredientViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public IngredientViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public IngredientViewModel setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public IngredientViewModel setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
        return this;
    }

    public String getMeasure() {
        return measure;
    }

    public IngredientViewModel setMeasure(String measure) {
        this.measure = measure;
        return this;
    }
}
