package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(10);
		
		lista.adiciona("Elemento 1");
		lista.adiciona("Elemento 2");
		lista.adiciona("Elemento 3");
		lista.adiciona("Elemento 4");
		lista.adiciona("Elemento 5");
		
		
		System.out.println("Exercicio 1 - implementando o método contem: ");
		System.out.println(lista.contem("Elemento 1"));
		System.out.println(lista.contem("Elemento 2"));
		System.out.println(lista.contem("elemento 1"));
		System.out.println(lista.contem("Elemento 6"));
		
		
		
		
	}

}
