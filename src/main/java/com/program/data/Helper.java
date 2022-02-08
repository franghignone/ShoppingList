package com.program.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.log4j.Logger;

import com.program.files.Products;
import com.program.main.*;

public class Helper extends Principal{
	public static Logger log = Logger.getLogger(Helper.class);
	
	public static ArrayList<Products> sortByName(ArrayList<Products> products) {
		log.info("SORTING PRODUCT LIST BY NAME ");
		System.out.println("\n####### PRECIOS ORDENADOS POR NOMBRE\n");
		Collections.sort(products, new Comparator<Products>() {
			
			@Override
			public int compare(Products arg0, Products arg1) {
				log.info("COMPAREING BY NAME \n" + arg0.getProduct() + " and " + arg1.getProduct());
				return Integer.valueOf(arg0.getProduct().compareTo(arg1.getProduct()));
			}
		});
		log.debug("LIST SORTED BY NAME OF PRODUCT\n" + products.toString());
		return products;
	}
	public static ArrayList<Products> sortByDate(ArrayList<Products> products) { 
		log.info("SORTING PRODUCT LIST BY DATE ");
		System.out.println("\n####### PRECIOS ORDENADOS POR FECHA DE AGREGADO\n");
		Collections.sort(products, new Comparator<Products>() {
			
			@Override
			public int compare(Products arg0, Products arg1) {
				log.debug("COMPAREING BY DATE \n" + arg0.getAdded().toString() + " and " + arg1.getAdded().toString());
				String[] date1 = arg0.getAdded().toString().split("/");
				String[] date2 = arg1.getAdded().toString().split("/");
				
				return LocalDate.of(Integer.valueOf(date1[2]), Month.of(Integer.valueOf(date1[1])), Integer.valueOf(date1[0]))
								.compareTo(LocalDate.of(Integer.valueOf(date2[2]), Month.of(Integer.valueOf(date2[1])),Integer.valueOf(date2[0])));
			}
		});
		log.debug("LIST SORTED BY NAME OF PRODUCT\n" + products.toString());
		return products;
	}

	public static ArrayList<Products> sortByTypeAndName(ArrayList<Products> products) {
		log.info("SORTING PRODUCT LIST BY TYPE AND NAME ");
		System.out.println("\n####### PRECIOS ORDENADOS POR TIPO Y LUEGO NOMBRE\n");
		Collections.sort(products);
		log.debug("LIST SORTED BY TYPE AND NAME\n" + products.toString());
		return products;
	}
}
