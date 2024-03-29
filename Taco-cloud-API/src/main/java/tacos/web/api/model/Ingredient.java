package tacos.web.api.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {
	@Id
	private final Integer id;
	private final String name;
	@Enumerated(EnumType.STRING)
	private final Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}
