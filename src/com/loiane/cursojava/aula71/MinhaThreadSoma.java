package com.loiane.cursojava.aula71;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
//		Thread t = new Thread(this, nome);
//		t.start();
	}

	@Override
	public void run() {
		
		System.out.println(nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma da thread " + this.nome + " é: " + soma);
		
		System.out.println(nome + " terminada");
	}
	
	
}
