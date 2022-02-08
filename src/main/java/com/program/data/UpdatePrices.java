package com.program.data;

import java.util.ArrayList;
import org.apache.log4j.Logger;

import com.program.files.Products;
import com.program.main.ReadCSV;

public class UpdatePrices extends DiscountList {
	public static Logger log = Logger.getLogger(UpdatePrices.class);
	public static ArrayList<Products> updatedPriceList;
	private ArrayList<Products> csv;
	private ArrayList<Products> stockPlus600;
	private ArrayList<Products> withTomato;
	private ArrayList<Products> arcorBrand;
	private ArrayList<Products> recyclables;
	private ArrayList<Products> expire2022;
	private ArrayList<Products> candy;
	private ArrayList<Products> stockMinus200;
	private ArrayList<Products> prod750cc;
	private ArrayList<Products> noCategory;

	public UpdatePrices() {
		log.debug("###################### PRECIOS ACTUALIZADOS");
		System.out.println("###################### PRECIOS ACTUALIZADOS");
		csv = ReadCSV.productsCSV;
		stockPlus600 = new ArrayList<Products>();
		withTomato = new ArrayList<Products>();
		arcorBrand = new ArrayList<Products>();
		recyclables = new ArrayList<Products>();
		expire2022 = new ArrayList<Products>();
		candy = new ArrayList<Products>();
		stockMinus200 = new ArrayList<Products>();
		prod750cc = new ArrayList<Products>();
		noCategory = new ArrayList<Products>();
		updatedPriceList = new ArrayList<Products>();
		
		for (Products dato : csv) {
			log.debug("WE GET THE PRODUCT \n" + dato);
			if (Integer.valueOf(dato.getQuantity()) > 600) {
				stockPlus600.add(dato);
				log.info("ADDED TO STOCK 600 U ");
			} else if ((dato.getProduct()).contains("Tomate")) {
				withTomato.add(dato);
				log.info("ADDED TO PROD WITH TOMATO");
			} else if (dato.getBrand().contains("Arcor")) {
				arcorBrand.add(dato);
				log.info("ADDED TO ARCOR");
			} else if (dato.getRecyclable().equals("Si")) {
				recyclables.add(dato);
				log.info("ADDED TO RECYCLABLES");
			} else if (dato.getExpiration().contains("22")) {
				expire2022.add(dato);
				log.info("ADDED TO EXPIRE 2022");
			} else {
				dato.setFinalPrice(dato.getPrice());
				noCategory.add(dato);
				log.info("ADDED TO NO CATEGORY");
			}
			if (dato.getType().contains("Golosinas")) {
				candy.add(dato);
				log.info("ADDED TO CANDY");
			}
			if ((dato.getQuantity()) < 200) {
				stockMinus200.add(dato);
				log.info("ADDED TO STOCK MINUS 200");
			}

			if (dato.getVolume().contains("cc")) {
				if (Integer.parseInt(dato.getVolume().replace(" cc", "")) < 750) {
					prod750cc.add(dato);
					log.info("ADDED TO PROD 750CC");
				}
			}
		}
		updatedPriceList.addAll(discountedPrice(stockPlus600, DiscountList.discountList.STOCKPLUS600.discount));
		log.debug("ADDING PRODUCTS STOCK PLUS 600 WITH DISCOUNT OF " + DiscountList.discountList.WITHTOMATO.discount + "%:\n" + stockPlus600);
		updatedPriceList.addAll(discountedPrice(withTomato, DiscountList.discountList.WITHTOMATO.discount));
		log.debug("ADDING PRODUCTS WITH TOMATO WITH DISCOUNT OF " + DiscountList.discountList.WITHTOMATO.discount + "%:\n" + withTomato);
		updatedPriceList.addAll(discountedPrice(arcorBrand, DiscountList.discountList.ARCORBRAND.discount));
		log.debug("ADDING PRODUCTS ARCOR WITH WITH DISCOUNT OF " + DiscountList.discountList.WITHTOMATO.discount + "%:\n" + arcorBrand);
		updatedPriceList.addAll(discountedPrice(recyclables, DiscountList.discountList.RECYCLABLES.discount));
		log.debug("ADDING RECYCLABLE PRODUCTS WITH DISCOUNT OF " + DiscountList.discountList.WITHTOMATO.discount + "%:\n" + recyclables);
		updatedPriceList.addAll(discountedPrice(expire2022, DiscountList.discountList.EXPIRE2022.discount));
		log.debug("ADDING PRODUCTS EXPIRING 2022 WITH DISCOUNT OF " + DiscountList.discountList.WITHTOMATO.discount + "%:\n" + expire2022);
		updatedPriceList.addAll(noCategory);
		log.debug("ADDING PRODUCTS WITH NO CATEGORY WHITOUT CHANGING IT'S FINAL PRICES\n" + noCategory);

		additionedPrice(updatedPriceList, candy, DiscountList.discountList.SWEETS.addition);
		log.debug("ADDING PRICE RECHARGE OF " + DiscountList.discountList.SWEETS.addition + "%:\n" + candy);
		additionedPrice(updatedPriceList, stockMinus200, DiscountList.discountList.STOCKMINUS200.addition);
		log.debug("ADDING PRICE RECHARGE OF " + DiscountList.discountList.STOCKMINUS200.addition + "%:\n" + stockMinus200);
		additionedPrice(updatedPriceList, prod750cc, DiscountList.discountList.PROD750CC.addition);
		log.debug("ADDING PRICE RECHARGE OF " + DiscountList.discountList.PROD750CC.addition + "%:\n" + prod750cc);
		
		updatedPriceList.stream().forEach(System.out::print);
	}

	public ArrayList<Products> discountedPrice(ArrayList<Products> products, int discount) {
		for (Products dato : products) {
			log.debug("READING " + dato);
			if (discount >= 0) {
				log.info("HAS DISCOUNT");
				dato.setFinalPrice(dato.getPrice() - (dato.getPrice() * (discount / 100)));
				log.debug("ADDING DISCOUNT OF " + discount + "% AND SETTING TO FINAL PRICE");
			}else {
				log.info("DOESN'T HAVE DISCOUNT");
			}
		}
		return products;
	}

	public ArrayList<Products> additionedPrice(ArrayList<Products> products, ArrayList<Products> selectedProducts,int addition) {

		products.stream().forEach(p -> {
			log.debug("READING \n" + p.toString());
			for (Products product : selectedProducts) {
				log.debug("READING \n" + product);
				if (p == product) {
					log.info("HAS ADDITION");
					p.setFinalPrice(p.getPrice() + (p.getPrice() * (addition / 100)));
					log.debug("ADDITION OF " + addition + "% ON IT'S FINAL PRICE");
				}else {
					log.info("DOESN'T HAVE ADDITION");
				}
			}
		});
		return products;
	}

}