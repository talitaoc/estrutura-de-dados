package com.loiane.cursojava.aula59;

//import static java.lang.Math.pow;
import static java.lang.Math.*; //adiciona todos os métodos da classe

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;
		
		//são estaticos, não precisa instanciar para utilizar
		
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		System.out.println(pow(a, b)); //com a classe importada apesar de não precisar
	}

}
