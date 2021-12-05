package com.example.happylunch.web;

import com.example.happylunch.model.view.RecipeViewModel;
import com.example.happylunch.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class RecipeController {

    private final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/details")
    public String showRecipe ( Model model){
        model.addAttribute("recipe", this.recipeService.findRecipeOfTheDay());

        return "recipe";
    }
}
