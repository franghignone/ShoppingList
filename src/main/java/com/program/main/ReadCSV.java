package com.program.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

import com.program.files.Discounts;
import com.program.files.Products;
import com.program.files.Segments;
import com.program.products.*;


public class ReadCSV extends Principal{
	public static Logger log = Logger.getLogger(ReadCSV.class);
	protected static ArrayList<Products> productsCSV;
	protected static ArrayList<Discounts> discountsCSV;
	protected static ArrayList<Segments> segmentsCSV;
	BufferedReader buf = null;
	String lecture;
	Products product;
	Object[] fields;
	int count;
	Object[] finalFields;
	public void readProductos(String filePath) {
		log.info("####### PRODUCTS.CSV");
		System.out.println("####### PRODUCTS.CSV");
		productsCSV = new ArrayList<Products>();
		try {
			count = -1;
			log.debug("TRYING TO READ THE FILE " + filePath);
			buf = new BufferedReader(new FileReader(filePath));
			log.info("FILE READ");
			finalFields = new String[12];
			buf.readLine();
			while((lecture = buf.readLine()) != null){
				log.debug("WE GET THE LINE " + lecture);
				fields = lecture.split(";");
				log.debug("WE GET THE FIELDS " + fields);
				for (int i = 0; i < fields.length; i++) {
					finalFields[i] = fields[i].toString();
					count++;
				}

				if (fields.length < 12) {
					for (int i = 0; i < (12 - count); i++) {
						count++;
						finalFields[count] = "0";
					}
				}
				log.debug("WE MODIFY AND STORE THE FIELDS " + finalFields);
				switch(String.valueOf(fields[0])) {
				case "Bebida":
					productsCSV.add(new Beverages(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("BEVERAGE CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Bebida Alcoholica":
					productsCSV.add(new BeveragesWithAlcohol(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("BEVERAGE WITH ALCOHOL CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Conservas":
					productsCSV.add(new Preserves(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("PRESERVES CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Cuidado Capilar":
					productsCSV.add(new CapillaryCare(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("CAPILLIARY CARE CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Farmacia":
					productsCSV.add(new Pharmacy(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("PHARMACY CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Frutas y Verduras":
					productsCSV.add(new FruitsVegetables(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("FRUITS AND VEGETABLES CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
					
				case "Golosinas":
					productsCSV.add(new Sweets(
							finalFields[0].toString(), finalFields[1].toString(), finalFields[2].toString(), finalFields[3].toString(),
							Float.valueOf(String.valueOf(finalFields[4])), Integer.parseInt(String.valueOf(finalFields[5])), finalFields[6].toString(),
							finalFields[7].toString(), finalFields[8].toString(), finalFields[9].toString(), finalFields[10].toString(),
							Float.valueOf(finalFields[11].toString())));
					log.debug("SWEETS CREATED WITH THE FIELDS " + finalFields[0].toString() + ", " + finalFields[1].toString() + ", "
							+ finalFields[2].toString() + ", " + finalFields[3].toString() + ", " + Float.valueOf(String.valueOf(finalFields[4])) + ", "
							+ Integer.parseInt(String.valueOf(finalFields[5])) + ", " + finalFields[6].toString() + ", " + finalFields[7].toString() + ", "
							+ finalFields[8].toString() + ", " + finalFields[9].toString() + ", " + finalFields[10].toString() + ", "
							+ Float.valueOf(finalFields[11].toString()));
					break;
				}
			}
			log.debug("FINAL PRODUCT LIST\n" + productsCSV.toString());
			System.out.println(productsCSV.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			log.error("FILE COULDN'T BE REACHED\n" + e.getMessage());
		} catch (IOException exc) {
			exc.printStackTrace();
			log.error("THERE WAS AN ERROR\n" + exc.getMessage());
		} finally {
			try {
				log.info("TRYING TO CLOSE THE BUFFERED READER");
				buf.close();
			} catch (IOException ex) {
				ex.printStackTrace();
				log.error("THERE WAS AN ERROR CLOSING THE BUFFERED READER\n" + ex.getMessage());
			}
		}
	}
	public void readCSVDiscounts(String filePath) {
		log.info("####### DISCOUNTS.CSV");
		System.out.println("####### DISCOUNTS.CSV");
		discountsCSV = new ArrayList<Discounts>();
		String lecture;
		String[] fields;
		try {
			log.debug("TRYING TO READ THE FILE " + filePath);
			buf = new BufferedReader(new FileReader(filePath));
			log.debug("FILE READ");
			lecture = buf.readLine();
			log.debug("WE GET THE LINE : " + lecture);
			while ((lecture = buf.readLine()) != null) {
				fields = lecture.split(";");
				log.debug("WE GET THE FIELDS  : " + fields[0] + ", " + fields[1] + ", " + fields[2]);
				discountsCSV.add(new Discounts(fields[0], fields[1], fields[2]));
				log.debug("A NEW DISCOUNT IS ADDED");
			}
			log.debug("FINAL DISCOUNT LIST \n" + discountsCSV.toString());
			System.out.println(discountsCSV.toString());
		} catch (FileNotFoundException e) {
			log.error("FILE COULDN'T BE REACHED\n" + e.getMessage());
		} catch (IOException ex) {
			log.error("THERE WAS AN ERROR\n" + ex.getMessage());
		}
	}
	public void readCSVSegments(String filePath) {
		log.info("####### SEGMENTS.CSV");
		System.out.println("####### SEGMENTS.CSV");
		segmentsCSV = new ArrayList<Segments>();
		String lecture;
		String[] fields;
		try {
			log.debug("TRYING TO READ THE FILE " + filePath);
			buf = new BufferedReader(new FileReader(filePath));
			log.info("FILE READ");
			lecture = buf.readLine();
			log.debug("WE GET THE LINE : " + lecture);
			while ((lecture = buf.readLine()) != null) {
				fields = lecture.split(";");
				log.debug("WE GET THE FIELDS  : " + fields[0] + ", " + fields[1] + ", " + fields[2]);
				segmentsCSV.add(new Segments(fields[0], fields[1], fields[2]));
				log.debug("A NEW SEGMENT IS ADDED");
			}
			log.debug("FINAL SEGMENT LIST \n" + segmentsCSV.toString());
			System.out.println(segmentsCSV.toString());
		} catch (FileNotFoundException e) {
			log.error("FILE COULDN'T BE REACHED\n" + e.getMessage());
		} catch (IOException ex) {
			log.error("THERE WAS AN ERROR\n" + ex.getMessage());
		}
	}

}
