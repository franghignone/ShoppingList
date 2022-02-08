package com.program.products;

import org.apache.log4j.Logger;

import com.program.files.Products;


public class Sweets extends Products {
	public static Logger log = Logger.getLogger(Sweets.class);
	public String candyFirstOther = segmentsCSV.get(6).getOther();
	public String candySecondOther = segmentsCSV.get(6).getSecondOther();
	

	public Sweets(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		candyFirstOther = candyFirstOther + " " + firstOther;
		candySecondOther = candySecondOther + " " + secondOther;
		
	}

	@Override
	public String toString() {
		return "\nSweets [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + candyFirstOther 
				+ ", SecondOther=" + candySecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
