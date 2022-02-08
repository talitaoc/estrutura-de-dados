package com.loiane.cursojava.aula60;

public class EscopoVariavel {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public EscopoVariavel(int valor) {
		super();
		this.valor = valor;
	}

	public EscopoVariavel() {
		super();
	}

	@Override
	public String toString() {
		return "EscopoVariavel [valor=" + valor + "]";
	}

	public int calculaValor(int valor) {
		valor = valor + 10;

		return valor;
	}

	public int teste() {

		int valor = 5;

		if(true) {
			valor--;
		}

		return valor;
	}

	public void outroTeste() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		//i++; erro de compilação

		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);			
		}
		
		System.out.println(j);//ja tem valor, 10
	}
	
	public void maisUmTeste() {
		
		boolean flag = true;
		
		if(flag) {
			
			int variavel = 10;
			
			variavel++;
			
			System.out.println(variavel);
		}
		
//		System.out.println(variavel); erro de compilação. A variavel só existe dentro do escopo do if
	}
	
	public void maisUmOutroTeste(int num) {
		
		int total = 0;
		
		try {
			int outroNum = 0;
			
			total = num/outroNum;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			total++;
			//outroNum++;
			//e.printStackTrace();
		}
		
		num++; 
		//outroNum++;
	}


}
