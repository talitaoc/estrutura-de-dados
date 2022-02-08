package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", "Ol�, mundo!");

		System.out.println();

		System.out.printf("%s", "Ol�, mundo!");

		System.out.println();

		System.out.printf("%S", "Ol�, mundo!");

		System.out.println();

		System.out.printf("%c", 'c');

		System.out.printf("%n");

		int valor = 123456789;
		System.out.printf("%d", valor);

		System.out.println();

		double pontoFlutuante = 3.1234567;	
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		String olaMundo = "Ol� Mundo";
		System.out.printf("%20s",olaMundo);

		System.out.println();

		System.out.printf("%-20s",olaMundo);

		System.out.println();

		System.out.printf("%+d", valor);

		System.out.println();

		System.out.printf("%015d", valor);

		System.out.println();

		System.out.printf("%,d", valor);

		System.out.println();

		int valor2 = -123456789;
		System.out.printf("% d", valor2);

		System.out.println();

		System.out.printf("% d", valor);

		System.out.println();

		System.out.printf("%.2f", pontoFlutuante);
		
		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.println();

		testeMaisCompleto();


	}
	
	private static void testeMaisCompleto() {
		
		double[] precos = {100000, 2.567, 1256.3445, 1, 4.566768};
		
		for(int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f\n", "Item", i+1, precos[i]);
		}
		
	}

}
