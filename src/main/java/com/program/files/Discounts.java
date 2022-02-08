package com.program.files;

import org.apache.log4j.Logger;

public class Discounts extends com.program.main.ReadCSV {
	public static Logger log = Logger.getLogger(Discounts.class);
	public String product;
	public String discount;
	public String addition;

	public Discounts(String product, String discount, String addition) {
		super();
		this.product = product;
		this.discount = discount;
		this.addition = addition;
		
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getAddition() {
		return addition;
	}

	public void setAddition(String addition) {
		this.addition = addition;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "\nDiscounts [product=" + product + ", discount=" + discount + ", addition=" + addition + "]";
	}

}
