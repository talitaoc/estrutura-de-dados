package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {


		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <=10; i++) {

			System.out.println("\nInforme o n�mero: ");
			int num = scan.nextInt();

			if(num == 0) {

				Integer desempilhado = pilhaPar.desempilhar();

				if(desempilhado == null) {
					System.out.println("A pilha par est� vazia.");
				}else {
					System.out.println("Desempilhando da pilha par" + desempilhado);
					pilhaPar.empilhar(desempilhado);
				}
				desempilhado = pilhaPar.desempilhar();

				if(desempilhado == null) {
					System.out.println("A pilha �mpar est� vazia.");
				}else {
					System.out.println("Desempilhando da pilha �mpar" + desempilhado);
					pilhaImpar.empilhar(desempilhado);
				}

				if(num % 2 == 0) {
					System.out.println("\nEmpilhando o n�mero na pilha par: " + num);
					pilhaPar.empilhar(num);
				}else {
					System.out.println("\nEmpilhando o n�mero na pilha �mpar: " + num);
					pilhaImpar.empilhar(num);
				}
			}
		}
		
		System.out.println("Desempilhando elementos da pilha par");
		while(!pilhaPar.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilhar());  
		}
		
		System.out.println("Desempilhando elementos da pilha �mpar");
		while(!pilhaImpar.estaVazia()) {
			System.out.println("Desempilhando da pilha �mpar: " + pilhaImpar.desempilhar());  
		}
	}	
}



