package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio05 {

	public static void main(String[] args) {

		String expressao;

		//		Scanner scan = new Scanner(System.in);
		//		
		//		System.out.println("Insira uma expressão matemática: ");
		//		expressao = scan.nextLine();

		//		expressao = "A+B+(C+D)";
		//		
		//		System.out.println("\nA expressão " + expressao + " está balanceada? \n" + verificaSimbolos(expressao));

		imprimeResultado("A+B+(C+D");
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");

		//		scan.close();

	}
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
		System.out.println(expressao + " está balanceado? " + verificaSimbolos(expressao));
		System.out.println("");
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolos(String expressao) {

		Pilha<Character> pilha = new Pilha<Character>();
		char auxiliar;
		char topo;

		for (int i = 0; i < expressao.length(); i++) {
			auxiliar = expressao.charAt(i);
			;

			if(ABRE.indexOf(auxiliar) > -1) { //quer dizer que existe o char  
				
				pilha.empilhar(auxiliar);

			}else if(FECHA.indexOf(auxiliar) > -1) {

				if(pilha.estaVazia()){
					
					return false; 
				}else {
					topo = pilha.desempilhar();
					
				}
				if(ABRE.indexOf(topo) != FECHA.indexOf(auxiliar)) {
					
					return false;
				}
			}
		}
		
		return pilha.estaVazia(); 
	}


	public static boolean verificaSimbolosBalanceados(String expressao){

		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()){
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1){
				pilha.empilhar(simbolo);

			} else if (FECHA.indexOf(simbolo) > -1){

				if (pilha.estaVazia()){
					return false;
				} else {
					topo = pilha.desempilhar();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
						return false;
					}
				}
			}

			index++;
		}

		return pilha.estaVazia(); //o original em aula retorna true e o dá certo com os exemplos da professora.
	}

}
