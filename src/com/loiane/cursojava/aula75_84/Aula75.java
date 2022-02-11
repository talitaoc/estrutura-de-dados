package com.loiane.cursojava.aula75_84;

public class Aula75 {

	public static void main(String[] args) {

		String vazia = new String();
		System.out.println(vazia);
		
		String java = new String("JAVA");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		
		char[] charsJava = {'J','A','V','A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		
		char[] abcdef = {'A','B','C','D','E','F'};
		String abc = new String(abcdef,1,3);
		System.out.println(abc);
			
		byte[] ascii = {65,66,67,68,69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii,1,3);
		System.out.println(bcd);
		
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		System.out.println(java3);
		System.out.println(java4);//endere�o de memoria � o mesmo java3 e java4
		
		//Endere�o de memoria � o mesmo para atribui��es simples, pois existe um sistema de pool no qual recebe esse tipo de atribui��o.
		//portanto quando temos 2 atribui��es exatamente iguais (letras todas iguais, maiusculo, minusculo) o java tem um sistema que pesquisa 
		//o pool e se achar exatamente igual ele n�o cria nova variavel, o endere�o de memoria � o mesmo
		
		//quando damos new String sempre � criado um id diferente mesmo quando o valor da String � o mesmo.
		
		
		}
	}


