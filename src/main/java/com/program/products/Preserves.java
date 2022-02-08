package com.program.products;

import org.apache.log4j.Logger;


public class Preserves extends com.program.files.Products {
	public static Logger log = Logger.getLogger(Preserves.class);
	public String preservesFirstOther = segmentsCSV.get(2).getOther();
	public String preservesSecondOther = segmentsCSV.get(2).getSecondOther();

	public Preserves(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		preservesFirstOther = preservesFirstOther + " " + firstOther;
		preservesSecondOther = preservesSecondOther + " " + secondOther;
		
	}

	@Override
	public String toString() {
		return "\nPreserves [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + preservesFirstOther 
				+ ", SecondOther=" + preservesSecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
