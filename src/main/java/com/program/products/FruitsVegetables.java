package com.program.products;

import org.apache.log4j.Logger;

import com.program.files.Products;

public class FruitsVegetables extends Products {
	public static Logger log = Logger.getLogger(FruitsVegetables.class);
	public String fruitsVegetablesFirstOther = segmentsCSV.get(5).getOther();
	public String fruitsVegetablesSecondOther = segmentsCSV.get(5).getSecondOther();
	
	public FruitsVegetables(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		fruitsVegetablesFirstOther = fruitsVegetablesFirstOther + " " + firstOther;
		fruitsVegetablesSecondOther = fruitsVegetablesSecondOther + " " + secondOther;
		
	}

	@Override
	public String toString() {
		return "\nFruitsVegetables [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + fruitsVegetablesFirstOther 
				+ ", SecondOther=" + fruitsVegetablesSecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
