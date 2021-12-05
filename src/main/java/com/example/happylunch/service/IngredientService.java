package com.example.happylunch.service;

import com.example.happylunch.model.entity.RecipeEntity;
import com.example.happylunch.model.view.IngredientViewModel;

import java.util.Set;

public interface IngredientService {
    Set<IngredientViewModel> findAllIngredientsForTheRecipe(RecipeEntity id);
}
