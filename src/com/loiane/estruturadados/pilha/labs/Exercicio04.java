package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Insira uma palavra ");
		String palavra = scan.nextLine();
		
		System.out.println(palavra + " é um palindromo? \n\n");
		
		
		if(palindromo(palavra)) {
			System.out.println("Sua palavra é um palíndromo!");
		}else {
			System.out.println("Sua palavra não é um palíndomo.");
		}
	}
	
	public static boolean palindromo(String palavra) {
		
		Pilha<Character> pilha = new Pilha<Character>();
		
		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilhar(palavra.charAt(i));
		}
		String palavraInversa = "";
		
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilhar();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		return false;
	}

}
