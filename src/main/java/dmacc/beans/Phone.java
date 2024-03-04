package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
@Entity
public class Phone {
	@Id
	@GeneratedValue
	private Long id;
    private String brand;
    private String model;
    private int releaseYear;
    private double price;
	
	public Phone() {
		super();
	}

	public Phone(String brand, String model, int releaseYear, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.releaseYear = releaseYear;
		this.price = price;
	}
	
	//Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", releaseYear=" + releaseYear + ", price="
				+ price + "]";
	}
}
