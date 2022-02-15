package com.loiane.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96 {

	public static void main(String[] args) throws ParseException {

		Locale en = new Locale("en", "United Stated");
		NumberFormat nf = NumberFormat.getInstance(en);

		String num = nf.format(100.99);
		System.out.println(num);

		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num);
		
		//moeda
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		
		String valor = moeda.format(100.99);
		System.out.println(valor);

		Currency currency = moeda.getCurrency();
		System.out.println(currency);
		
		//porcentagem
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.98);
		System.out.println(porcentagem);
		
		porcent.setMaximumIntegerDigits(4);//máximo de casas inteiras vão ser 4
		porcent.setMinimumFractionDigits(3);
		
		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);
		
		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		
		//Arredondamento
		
		nf = NumberFormat.getInstance();
		nf.setRoundingMode(RoundingMode.UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
		Number num3 = nf.parse("100.00");
		System.out.println(num3.intValue());
		
		
		
		
		
	}

}
