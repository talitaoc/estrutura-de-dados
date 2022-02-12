package com.loiane.cursojava.aula75_84;

public class Aula83 {

	public static void main(String[] args) {

		//concatena��o de string no java

		String[] letras = {"B","C","D","E","F"};

		String alfabeto = "";

		for(String letra: letras) {
			alfabeto +=letra;
		}

		System.out.println(alfabeto);

		//buffer de strings
		//buffer � thread save = n�o d� problema em threads
		StringBuffer sb = new StringBuffer();
		for(String letra: letras) {
			sb.append(letra);
		}

		alfabeto = sb.toString();

		alfabeto = new String(sb);
		System.out.println(alfabeto);

		System.out.println(sb.reverse());
		//Builder n�o � thread save
		StringBuilder sb_ = new StringBuilder();
		for(String letra: letras) {
			sb_.append(letra);
		}

		
		//Digamos que tenha um array de strings, como faz a concatena��o?
		//concatenando com StringBuffer ou StringBuilder, um � thread save e outro n�o �

	}

}
