package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		
		System.out.println(fila);
		System.out.println("Qual o tamanho da fila? " + fila.size());
		System.out.println("Qual o primeiro elemento da fila? " + fila.peek());
		System.out.println("Elemento a ser removido primeiro? " + fila.remove());
		System.out.println(fila);
	
		
	}

}
