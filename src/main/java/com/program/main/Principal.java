package com.program.main;

import org.apache.log4j.Logger;

import com.program.data.*;

public class Principal {
	public static Logger log = Logger.getLogger(Principal.class);
	static UpdatePrices updatePrices;
	static ReadCSV readCSV;
	public static void main(String[] args) {
		readCSV = new ReadCSV();
		
		
		readCSV.readCSVDiscounts("files/descuentos.csv");
		readCSV.readCSVSegments("files/segmentos.csv");
		readCSV.readProductos("files/productos.csv");
		
		
		updatePrices = new UpdatePrices();
		
		
		System.out.println(Helper.sortByName(UpdatePrices.updatedPriceList));
		System.out.println(Helper.sortByTypeAndName(UpdatePrices.updatedPriceList));
		System.out.println(Helper.sortByDate(UpdatePrices.updatedPriceList));
	}

}