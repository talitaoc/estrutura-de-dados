package com.loiane.cursojava.aula64;

public class Externa2 {

	public void metodoQualquer() {
		
		class ClasseLocal{
			
			private String texto = "String classe local";
			
			public void imprimeTexto() {
				System.out.println(texto);
			}
		}
		
		ClasseLocal classeLocal = new ClasseLocal();
		
		classeLocal.imprimeTexto();
	}
	
	public static void main(String[] args) {
		
		Externa2 externa = new Externa2();
		
		externa.metodoQualquer();
	}
}
