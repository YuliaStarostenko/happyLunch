package com.example.happylunch.repository;

import com.example.happylunch.model.entity.IngredientEntity;
import com.example.happylunch.model.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IngredientRepository extends JpaRepository<IngredientEntity, Long> {
    Set<IngredientEntity> findByRecipe(RecipeEntity recipe);
}
