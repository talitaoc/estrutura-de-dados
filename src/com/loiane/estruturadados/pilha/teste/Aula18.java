package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {


		@SuppressWarnings("unused")
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		System.out.println("");
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
		System.out.println("");
		System.out.println(stack.isEmpty());
		System.out.println("");
		System.out.println(stack.peek());
		System.out.println("");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());

	}

}
