package com.example.happylunch.model.view;

import com.example.happylunch.model.entity.RestaurantEntity;

import java.util.Set;

public class RecipeViewModel {

    private Long id;
    private String name;
    private Set<IngredientViewModel> ingredients;
    private String description;
    private String restaurantName;

    public RecipeViewModel() {
    }

    public Long getId() {
        return id;
    }

    public RecipeViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RecipeViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public Set<IngredientViewModel> getIngredients() {
        return ingredients;
    }

    public RecipeViewModel setIngredients(Set<IngredientViewModel> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RecipeViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public RecipeViewModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }
}
