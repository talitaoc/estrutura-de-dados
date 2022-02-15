package com.loiane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87 {

	public static void main(String[] args) {
		//Calendar hoje = new Calendar();
		
		Calendar hoje = Calendar.getInstance(); //singleton, java EE(java web)
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println("");
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia,(mes+1),ano,hora,minutos,segundos);
		
		
		hoje.add(Calendar.DAY_OF_MONTH, 1);//tirando dias ou colocando data
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		
		
		
	}

}
