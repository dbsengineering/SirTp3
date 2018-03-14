package metier;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Address {

	@Id
	private double id;
	private String street;
	private String country;
	private String city;
	private String postCode;

	/**
	 * Constructeur
	 */
	public Address() {
	}

	// --- Setters ---

	public void setStreet(String value) {
		this.street = value;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public void setPostCode(String value) {
		this.postCode = value;
	}

	public void setCountry(String value) {
		this.country = value;
	}

	// --- Getters ---

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public String getCountry() {
		return this.country;
	}
}
