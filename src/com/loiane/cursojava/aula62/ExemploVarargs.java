package com.loiane.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 2));

		System.out.println(soma(1, 2, 3));

		int[] vetor = {1,2,3,4,5};

		System.out.println(soma(vetor));
		
		System.out.println(soma(1,2,3,4,5));


	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {

		int total = 0;

		for(int i = 0; i < vetor.length; i++) {
			total = total + vetor[i];
		}
		return total;
	}

	static int soma(Integer... vetor) { //varargs vetor indefinido, quando n�o sabemos quantos par�metros v�o ser passados

		int total = 0;

		for(int i = 0; i < vetor.length; i++) {
			total = total + vetor[i];
		}
		return total;
	}

}
