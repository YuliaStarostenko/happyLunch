package com.example.happylunch.service.impl;

import com.example.happylunch.model.entity.RecipeEntity;
import com.example.happylunch.model.view.RecipeViewModel;
import com.example.happylunch.repository.RecipeRepository;
import com.example.happylunch.service.IngredientService;
import com.example.happylunch.service.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final IngredientService ingredientService;
    private final RecipeRepository recipeRepository;
    private final ModelMapper modelMapper;

    public RecipeServiceImpl(IngredientService ingredientService, RecipeRepository recipeRepository, ModelMapper modelMapper) {
        this.ingredientService = ingredientService;
        this.recipeRepository = recipeRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public RecipeViewModel findRecipeOfTheDay() {
        var allRecipes = recipeRepository.findAll();
        var theRecipe = allRecipes
                .stream()
                .findFirst().orElseThrow();

        RecipeViewModel recipeViewModel = modelMapper.map(theRecipe, RecipeViewModel.class);

        recipeViewModel.setIngredients(ingredientService.findAllIngredientsForTheRecipe(theRecipe));
        recipeViewModel.setRestaurantName(theRecipe.getRestaurant().getName());

        return recipeViewModel;
    }
}
