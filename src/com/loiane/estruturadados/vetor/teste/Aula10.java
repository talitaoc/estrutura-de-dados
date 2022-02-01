package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObject;

public class Aula10 {

	public static void main(String[] args) {

		VetorObject vetor = new VetorObject(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "9876-5432", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "9999-9999", "contato3@email.com");
		Contato c4 = new Contato("Contato 4", "8888-8888", "contato4@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho é igual a: " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
		
		

	}

}
