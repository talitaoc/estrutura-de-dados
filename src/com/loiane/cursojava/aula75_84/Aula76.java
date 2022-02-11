package com.loiane.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso";
		String java = "Java";

		String cursoJava = curso + java;

		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado 2+2 = " + (2+2);
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2;
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1);
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. " + 
				"Praesent libero. Sed cursus ante dapibus diam. Sed nisi. "+
				"Nulla quis sem at nibh elementum imperdiet. " + 
				" Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed "+
				"augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. "+ 
				" Class aptent taciti sociosqu ad litora torquent per conubia nostra, "+
				"per inceptos himenaeos. Curabitur sodales ligula in libero. ";
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. ";
		concatenacao2 += "Praesent libero. Sed cursus ante dapibus diam. Sed nisi. ";
		concatenacao2 += "Nulla quis sem at nibh elementum imperdiet. ";
		concatenacao2 += " Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed ";
		concatenacao2 += "augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. ";
		concatenacao2 += " Class aptent taciti sociosqu ad litora torquent per conubia nostra, ";
		concatenacao2 += "per inceptos himenaeos. Curabitur sodales ligula in libero. ";
	
		System.out.println(concatenacao2);
		//string são imutáveis, ou seja, seu valor não muda
		//a cada concatenacao é criado uma string em um id novo, um endereço de memória novo, a String velha fica para o garbagecoletor
		//má pratica de concatenacao
		
		
		
		
	}

}
