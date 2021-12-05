package com.example.happylunch.service.impl;

import com.example.happylunch.model.entity.RecipeEntity;
import com.example.happylunch.model.view.IngredientViewModel;
import com.example.happylunch.repository.IngredientRepository;
import com.example.happylunch.service.IngredientService;
import com.example.happylunch.service.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;
    private final ModelMapper modelMapper;


    public IngredientServiceImpl(IngredientRepository ingredientRepository, ModelMapper modelMapper) {
        this.ingredientRepository = ingredientRepository;
        this.modelMapper = modelMapper;

    }


    @Override
    public Set<IngredientViewModel> findAllIngredientsForTheRecipe(RecipeEntity recipe) {

        return ingredientRepository
                .findByRecipe(recipe)
                .stream()
                .map(ingredientEntity -> modelMapper.map(ingredientEntity, IngredientViewModel.class))
                .collect(Collectors.toSet());
    }
}
