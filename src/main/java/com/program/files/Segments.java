package com.program.files;

import org.apache.log4j.Logger;

public class Segments extends com.program.main.ReadCSV {
	public static Logger log = Logger.getLogger(Segments.class);
	public String type;
	public String other;
	public String secondOther;

	public Segments(String type, String other, String secondOther) {
		super();
		this.type = type;
		this.other = other;
		this.secondOther = secondOther;
	}

	@Override
	public String toString() {
		return "\nSegments [type=" + type + ", other=" + other + ", secondOther=" + secondOther + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getSecondOther() {
		return secondOther;
	}

	public void setSecondOther(String secondOther) {
		this.secondOther = secondOther;
	}

	public static void main(String[] args) {

	}

}
