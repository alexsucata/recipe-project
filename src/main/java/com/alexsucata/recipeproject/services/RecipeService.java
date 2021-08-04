package com.alexsucata.recipeproject.services;

import com.alexsucata.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
