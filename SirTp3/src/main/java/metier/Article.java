package metier;

import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Article {

	// --- Déclaration des propriétées ---
	@Id
	private String id;
	private String name;
	private int stars;
	private List<Person> buyers = new ArrayList<Person>();

	/**
	 * Constructeur.
	 */
	public Article() {
	}
	
	public void addBuyer(Person person) {
		this.buyers.add(person);
	}

	// --- Getters ---
	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getStars() {
		return this.stars;
	}

	public List<Person> getBuyers() {
		return this.buyers;
	}

	// --- Setters ---

	public void setId(String value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void setStars(int value) {
		this.stars = value;
	}

	public void setBuyers(List<Person> value) {
		this.buyers = value;
	}
}
