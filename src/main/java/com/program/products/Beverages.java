package com.program.products;

import org.apache.log4j.Logger;


public class Beverages extends com.program.files.Products {
	public static Logger log = Logger.getLogger(Beverages.class);
	public String beveragesFirstOther = segmentsCSV.get(0).getOther();
	public String beveragesSecondOther = segmentsCSV.get(0).getSecondOther();
	
	public Beverages(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		beveragesFirstOther =  beveragesFirstOther + " " + firstOther;
		beveragesSecondOther = beveragesSecondOther + " " + secondOther;
	}
		@Override
		public String toString() {
			return "\nBeverages [type=" + type + ", product=" + product
					+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
					+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
					+ ", FirstOther=" + beveragesFirstOther + ", SecondOther=" + beveragesSecondOther + ",finalPrice=" + finalPrice + "]";
		}
}
	
