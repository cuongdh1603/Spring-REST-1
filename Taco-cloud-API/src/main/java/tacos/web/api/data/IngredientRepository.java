package tacos.web.api.data;

import org.springframework.data.repository.CrudRepository;

import tacos.web.api.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{

}
