package com.loiane.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		
		//juntar strings
		String alfabeto = String.join(", ", "A","B","C");//varargs
		System.out.println(alfabeto);
		
		System.out.println("");
		//separar strings
		//separar com delimitadores tipo ;
		String[] letras = alfabeto.split(", "); //expressão regular
		for(String letra: letras) {
			System.out.println(letra);
		}
		
		System.out.println("");
		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		
		System.out.println(pessoa.toString());
		
//		for(String info: infos) {
//			System.out.println(info);
//		}
		
		
		
		
	}

}
