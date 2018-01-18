package metier;

import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Person {

	// --- Déclaration des propriétées ---
	@Id
	private String id;
	private String name;
	private List<Address> address = new ArrayList<Address>();

	/**
	 * Constructeur
	 */
	public Person() {
	}

	/**
	 * Procédure d'ajout d'adresse
	 * 
	 * @param address
	 */
	public void addAddress(Address address) {
		this.address.add(address);
	}

	// --- Getters ---

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public List<Address> getAddress() {
		return this.address;
	}

	// --- Setters ---
	public void setId(String value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void setAddress(List<Address> value) {
		this.address = value;
	}

}
