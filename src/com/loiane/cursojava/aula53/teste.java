package com.loiane.cursojava.aula53;

public class teste {

	public static void main(String[] args) {

		diaConstantes();
		
		usandoEnum();
	}
	private static void diaConstantes() {

		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;

		System.out.println("Utilizando constantes no Java\n");
		imprimir(segunda);
		imprimir(terca);
		imprimir(quarta);
		imprimir(quinta);
		imprimir(sexta);
		imprimir(sabado);
		imprimir(domingo);
	}

	private static void imprimir(int dia) {

		switch (dia) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Ter�a-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;		
		}
	}

	private static void imprimir(DiaSemana dia) {

		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
		case TERCA:
			System.out.println("Ter�a-Feira");
			break;
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
		case SABADO:
			System.out.println("S�bado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;		
		}
	}

	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;

		System.out.println("\n\nUtilizando enum no Java\n");
		imprimir(DiaSemana.SEGUNDA);
		imprimir(DiaSemana.TERCA);
		imprimir(DiaSemana.QUARTA);
		imprimir(DiaSemana.QUINTA);
		imprimir(DiaSemana.SEXTA);
		imprimir(DiaSemana.SABADO);
		imprimir(DiaSemana.DOMINGO);
	}
}
