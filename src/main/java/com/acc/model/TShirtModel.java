package com.acc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tshirts")
public class TShirtModel {
	@Id
	private String id;
	private String name;
	@NotEmpty(message="color can't be null")
	private String color;
	@NotEmpty(message="gender can't be null")
	private String gender;
	@NotEmpty(message="size can't be null")
	private String size;
	private double price;
	private double rating;
	private String availability;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	

}
