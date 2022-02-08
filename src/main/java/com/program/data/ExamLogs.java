package com.program.data;

import java.time.LocalDateTime;
import org.apache.log4j.Logger;

//public abstract interface Logger{
//	                                           // se puede usar?
//}



public class ExamLogs {
	public static Logger log = Logger.getLogger(ExamLogs.class);
	LocalDateTime dateTime = LocalDateTime.now();
	public String dateTime() {
		
		
		return null;
		
	}
	public static void main(String[] args) {
		log.info(" ");
	}
}
