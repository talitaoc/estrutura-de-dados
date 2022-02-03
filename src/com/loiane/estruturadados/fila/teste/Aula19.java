package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println("A fila está vazia? " + fila.estaVazia());
		System.out.println("Qual tamanho da fila? " + fila.tamanho());
	}

}
