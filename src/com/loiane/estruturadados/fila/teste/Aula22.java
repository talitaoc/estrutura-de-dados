package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<Integer>();

		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		fila.enfileirar(5);

		System.out.println(fila);
		System.out.println("A fila está vazia? " + fila.estaVazia());
		System.out.println("Qual tamanho da fila? " + fila.tamanho());
		System.out.println("Qual primeiro a sair da fila? " + fila.primeiroFila());
		System.out.println(fila.toString());

		System.out.println("O elemento a sair da fila: " + fila.desenfileirar());
		System.out.println(fila.toString());

		System.out.println("Qual o próximo da fila? " + fila.primeiroFila());

		System.out.println("O elemento a sair da fila: " + fila.desenfileirar());
		System.out.println(fila.toString());

		System.out.println("Qual o próximo da fila? " + fila.primeiroFila());

		System.out.println("O elemento a sair da fila: " + fila.desenfileirar());
		System.out.println(fila.toString());

		System.out.println("Qual o próximo da fila? " + fila.primeiroFila());

		System.out.println("O elemento a sair da fila: " + fila.desenfileirar());
		System.out.println(fila.toString());
		
		System.out.println("Qual o próximo da fila? " + fila.primeiroFila());

		System.out.println("O elemento a sair da fila: " + fila.desenfileirar());
		System.out.println(fila.toString());
	}

}
