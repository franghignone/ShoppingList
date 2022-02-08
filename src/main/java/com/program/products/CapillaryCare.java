package com.program.products;

import org.apache.log4j.Logger;

public class CapillaryCare extends com.program.files.Products {
	public static Logger log = Logger.getLogger(CapillaryCare.class);
	public String capillaryCareFirstOther = segmentsCSV.get(3).getOther();
	public String capillaryCareSecondOther = segmentsCSV.get(3).getSecondOther();
	

	public CapillaryCare(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		capillaryCareFirstOther = capillaryCareFirstOther + " " + firstOther;
		capillaryCareSecondOther = capillaryCareSecondOther + " " + secondOther;
	}

	@Override
	public String toString() {
		return "\nCapillaryCare [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + capillaryCareFirstOther 
				+ ", SecondOther=" + capillaryCareSecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
