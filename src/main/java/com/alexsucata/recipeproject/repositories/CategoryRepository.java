package com.alexsucata.recipeproject.repositories;

import com.alexsucata.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
