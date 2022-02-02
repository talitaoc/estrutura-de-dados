package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {


		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		
		System.out.println(pilha);
		System.out.println("Tamanho da pilha é: "+ pilha.tamanho());
		System.out.println("");
		
		System.out.println("Desempilhando:  " + pilha.desempilhar());
		System.out.println(pilha);
		
		
	}

}
