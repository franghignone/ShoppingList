package com.program.products;

import org.apache.log4j.Logger;

public class BeveragesWithAlcohol extends com.program.files.Products {
	public static Logger log = Logger.getLogger(BeveragesWithAlcohol.class);
	public String beveragesWithAlcoholFirstOther = segmentsCSV.get(1).getOther();;
	public String beveragesWithAlcoholSecondOther = segmentsCSV.get(1).getSecondOther();
	
	public BeveragesWithAlcohol(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		beveragesWithAlcoholFirstOther = beveragesWithAlcoholFirstOther + " " + firstOther;
		beveragesWithAlcoholSecondOther = beveragesWithAlcoholSecondOther + " " + secondOther;
		
	}


	@Override
	public String toString() {
		return "\nBeveragesWithAlcohol [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + beveragesWithAlcoholFirstOther 
				+ ", SecondOther=" + beveragesWithAlcoholSecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
