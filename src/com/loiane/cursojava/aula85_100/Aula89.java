package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		Calendar data = new GregorianCalendar(1988,2,8,21,15,25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		String d = sdf.format(hoje);
		System.out.println(d);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//String para data
		String minhaData = "20/02/2000";
		
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
