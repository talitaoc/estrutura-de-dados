package com.loiane.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {

		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('x')); //retorna -1 quando não existe
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		System.out.println(banana.indexOf(ana));//começa no indice 1 por isso retorna 1
		
		
		System.out.println("Ultima vez que o a aparece na String: index " +banana.lastIndexOf('a'));

		System.out.println("Se contem a palavra: " + banana.contains(ana));
		System.out.println(banana.contains("ceu"));
	
	}

}
