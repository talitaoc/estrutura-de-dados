package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		
		System.out.println(pilha);
		
		System.out.println(pilha.topo());
	}

}
