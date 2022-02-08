package com.loiane.cursojava.aula54;

public class teste {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(01, 04, 2016, DiaSemana.SEXTA);
		
		System.out.println(data);
		
		
	}

}
