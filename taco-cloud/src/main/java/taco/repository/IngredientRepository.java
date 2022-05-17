package taco.repository;

import taco.model.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll(); 
	Ingredient findById(String id); 
	Ingredient save(Ingredient ingredient);
}
