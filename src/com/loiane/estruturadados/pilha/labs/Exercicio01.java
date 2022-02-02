package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println("\nInforme o n�mero: ");
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("\nEmpilhando o n�mero: " + num);
				pilha.empilhar(num);
			}else {
				Integer desempilhado = pilha.desempilhar();
				if(desempilhado == null) {
				System.out.println("\nA pilha est� vazia.");
				}else {
				System.out.println("\nN�mero �mpar, desempilhando �ltimo elemento da pilha: " + desempilhado);
				}
			}	
		}
		System.out.println("\n\nTodos os n�meros foram lidos. Desempilhando pilha");
		
		while(!pilha.estaVazia()) {
			System.out.println("\nDesmpilhando: " + pilha.desempilhar());
		}
		
		System.out.println("Todos os n�meros foram desempilhados.");
		
	}

}
