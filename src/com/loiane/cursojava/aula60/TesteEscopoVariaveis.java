package com.loiane.cursojava.aula60;

public class TesteEscopoVariaveis {

	public static void main(String[] args) {

		EscopoVariavel escopo = new EscopoVariavel();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calculaValor(20));
		System.out.println(escopo.getValor());
		System.out.println(escopo.teste());
		System.out.println(escopo.getValor());
		System.out.println("");
		escopo.outroTeste();
		System.out.println("");
		escopo.maisUmTeste();
		System.out.println("");
		escopo.maisUmOutroTeste(2);

	}

}
