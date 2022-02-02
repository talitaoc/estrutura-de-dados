package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int numero = 0; 
		int base;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número: ");
		numero = scan.nextInt();

		System.out.println("O número digitado em binário é: " + converterBinario(numero));

		
		
		System.out.println("Informe o número que deseja converter: ");
		numero = scan.nextInt();
		System.out.println("Insira a base: ");
		base = scan.nextInt();
		
		System.out.println("O número digitado na base " + base + "  é: " + converterBase(numero, base));
		
		

		scan.close();
	}

	public static String converterBinario(int numero) {

		Stack<Integer> stack = new Stack<Integer>();
		String binario = "";
		int resto;

		while(numero > 0) {
			resto = numero % 2;
			stack.push(resto);
			numero = numero / 2; //numero =/ 2;
		}

		while(!stack.isEmpty()) {
			binario += stack.pop();
		}

		return binario;
	}

	public static String converterBase(int numero, int base) {

		Stack<Integer> stack = new Stack<Integer>();
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while(numero > 0) {
			resto = numero % base;
			stack.push(resto);
			numero = numero / base; //numero =/ base;
		}

		while(!stack.isEmpty()) {
			numeroBase += bases.charAt(stack.pop());
		}

		return numeroBase;
	}

}
