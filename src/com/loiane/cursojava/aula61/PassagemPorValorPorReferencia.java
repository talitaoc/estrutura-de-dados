package com.loiane.cursojava.aula61;

public class PassagemPorValorPorReferencia {

	public static void main(String[] args) {

		Contato contato = new Contato("Talita", "1234-5678", "talita@email.com");
		int valor = 10;
		
		System.out.println("Valores originais: ");
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValor(valor, contato);
		System.out.println("\nExemplo 1 ");
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemReferencia(valor, contato);
		System.out.println("\nExemplo 2 ");
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	private static void testePassagemValor(int valor, Contato contato) {
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("André", "3214-5698", "andre@email.com");
	}
	
	private static void testePassagemReferencia(int valor, Contato contato) {
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("André " + novoValor);
	}

}
