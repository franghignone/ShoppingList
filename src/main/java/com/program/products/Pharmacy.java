package com.program.products;

import org.apache.log4j.Logger;


public class Pharmacy extends com.program.files.Products {
	public static Logger log = Logger.getLogger(Pharmacy.class);
	public String pharmacyFirstOther = segmentsCSV.get(4).getOther();
	public String pharmacySecondOther = segmentsCSV.get(4).getSecondOther();
	

	public Pharmacy(String type, String product, String brand, String volume, Float price, Integer quantity,
			String expiration, String added, String recyclable, String firstOther, String secondOther,
			Float finalPrice) {
		super(type, product, brand, volume, price, quantity, expiration, added, recyclable, firstOther, secondOther,
				finalPrice);
		pharmacyFirstOther = pharmacyFirstOther + " " + firstOther;
		pharmacySecondOther = pharmacySecondOther + " " + secondOther;
		
	}

	@Override
	public String toString() {
		return "\nPharmacy [type=" + type + ", product=" + product
				+ ", brand=" + brand + ", volume=" + volume + ", price=" + price + ", quantity=" + quantity
				+ ", expiration=" + expiration + ", added=" + added + ", recyclable=" + recyclable 
				+ ", FirstOther=" + pharmacyFirstOther 
				+ ", SecondOther=" + pharmacySecondOther 
				+ ",finalPrice=" + finalPrice + "]";
	}
}
