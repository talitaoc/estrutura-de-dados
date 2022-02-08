package com.loiane.cursojava.aula66;

import com.loiane.cursojava.aula61.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime(); //singleton
		
		System.out.println((runtime.totalMemory()-runtime.freeMemory()/MB));
		
	}

	public static void main(String[] args) {

		Contato[] contatos = new Contato[1000000];
		Contato contato;
		
		for(int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "1234-123"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados.");
		
		obterMemoriaUsada();
		
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		contatos = null;
		
		System.out.println("Contatos removidos da memória.");
		
		obterMemoriaUsada();
	}

}
