package com.loiane.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		
		String teste = "Isso é um teste";
		
		System.out.println(teste);
		
		//substring é um pedaço da string, é apenas informativo, não está cortando a string
		
		System.out.println(teste.substring(10)); 
		System.out.println(teste.substring(10,15));
		//indice é inclusivo, o final não é inclusivo, pega o 14
		
		String ola = "olá";
		String mundo = "mundo";
		
		String olaMundo = ola.concat(mundo);//ola+mundo
		System.out.println(olaMundo);
		
		
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');//qual caracter que quer substituir e o segundo coloca o correto
		System.out.println(semEspacos);
		
		
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());//remove todos os espaços antes e depois, faz um replanceAll
		
		
		//web services
		//XML 
		
		
		
		
		
		
		
	}

}
