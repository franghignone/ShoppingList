package com.program.data;

import org.apache.log4j.Logger;

public class DiscountList extends com.program.main.ReadCSV {
	public static Logger log = Logger.getLogger(DiscountList.class);

	public static String[] discListProdStock600 = {discountsCSV.get(4).getDiscount(), discountsCSV.get(4).getAddition()};
	public static String[] discListProdConTomate = {discountsCSV.get(0).getDiscount(), discountsCSV.get(0).getAddition()};
	public static String[] discListProdArcor = {discountsCSV.get(1).getDiscount(), discountsCSV.get(1).getAddition()};
	public static String[] discListProdReciclables = {discountsCSV.get(7).getDiscount(), discountsCSV.get(7).getAddition()};
	public static String[] discListProdVenc2022 = {discountsCSV.get(3).getDiscount(), discountsCSV.get(3).getAddition()};
	public static String[] discListSweets = {discountsCSV.get(2).getDiscount(), discountsCSV.get(2).getAddition()};
	public static String[] discListProdStock200 = {discountsCSV.get(5).getDiscount(), discountsCSV.get(5).getAddition()};
	public static String[] discListProd750cc = {discountsCSV.get(6).getDiscount(), discountsCSV.get(6).getAddition()};

	public enum discountList {
		STOCKPLUS600(StringToInt(discListProdStock600[0]), StringToInt(discListProdStock600[1])),
		WITHTOMATO(StringToInt(discListProdConTomate[0]), StringToInt(discListProdConTomate[1])),
		ARCORBRAND(StringToInt(discListProdArcor[0]), StringToInt(discListProdArcor[1])),
		RECYCLABLES(StringToInt(discListProdReciclables[0]), StringToInt(discListProdReciclables[1])),
		EXPIRE2022(StringToInt(discListProdVenc2022[0]), StringToInt(discListProdVenc2022[1])),
		SWEETS(StringToInt(discListSweets[0]), StringToInt(discListSweets[1])),
		STOCKMINUS200(StringToInt(discListProdStock200[0]), StringToInt(discListProdStock200[1])),
		PROD750CC(StringToInt(discListProd750cc[0]), StringToInt(discListProd750cc[1]));

		public int discount;
		public final int addition;
		discountList(int discount, int addition) {
			this.discount = discount;
			this.addition = addition;
		}
	}

	public static Integer StringToInt(String input) {
		Integer output = null;
		try {
			output = Integer.valueOf(input.toString().replace("%", ""));
		} catch (NumberFormatException e) {
			output = 0;
		}
		return output;
		
	}
}
