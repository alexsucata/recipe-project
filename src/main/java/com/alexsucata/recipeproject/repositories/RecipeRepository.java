package com.alexsucata.recipeproject.repositories;

import com.alexsucata.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
