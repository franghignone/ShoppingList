package com.program.files;

import org.apache.log4j.Logger;


public class Products extends com.program.main.ReadCSV implements Comparable<Products> {
	public static Logger log = Logger.getLogger(Products.class);
	protected String type;
	protected String product;
	protected String brand;
	protected String volume;
	protected Float price;
	protected Integer quantity;
	protected String expiration;
	protected String added;
	protected String recyclable;
	protected String firstOther;
	protected String secondOther;
	protected Float finalPrice;

	public Products(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super();
		this.type = type;
		this.product = product;
		this.brand = brand;
		this.volume = volume;
		this.price = price;
		this.quantity = quantity;
		this.expiration = expiration;
		this.added = added;
		this.recyclable = recyclable;
		this.firstOther = firstOther;
		this.secondOther = secondOther;
		this.finalPrice = finalPrice;
	}

	

	@Override
	public String toString() {
		return "\nProduct [type=" + type + ", product=" + product + ", brand=" + brand + ", volume=" + volume + ", price="
				+ price + ", quantity=" + quantity + ", expiration=" + expiration + ", added=" + added + ", recyclable="
				+ recyclable + ", firstOther=" + firstOther + ", secondOther=" + secondOther + ", finalPrice="
				+ finalPrice + "]";
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getRecyclable() {
		return recyclable;
	}

	public void setRecyclable(String recyclable) {
		this.recyclable = recyclable;
	}

	public String getFirstOther() {
		return firstOther;
	}

	public void setFirstOther(String firstOther) {
		this.firstOther = firstOther;
	}

	public String getSecondOther() {
		return secondOther;
	}

	public void setSecondOther(String secondOther) {
		this.secondOther = secondOther;
	}

	public Float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Float finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public int compareTo(Products o) {
		int output;
		if (o.getType().compareToIgnoreCase(this.type) == 0) {
			if (o.getProduct().compareToIgnoreCase(this.product) > 0) {
				output = -1;
			} else if (o.getProduct().compareToIgnoreCase(this.product) < 0) {
				output = 1;
			} else {
				output = 0;
			}
		} else if (o.getType().compareToIgnoreCase(this.type) > 0) {
			output = -1;
		} else {
			output = 1;
		}
		return output;
	}
	

}
