package com.loiane.cursojava.aula64;

import javax.security.auth.callback.TextOutputCallback;

public class Anonima {

	public void imprimeTexto() {
		System.out.println("Texto");
	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("Sobrescrita texto");
			}
		};

		anonima.imprimeTexto();
		//usando interface
		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("Imprime texto - interface");
			}
		};

		texto.imprimeTexto();
	};


} 


