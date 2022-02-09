package com.loiane.cursojava.aula69;

public class Teste3 {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 800);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();//esperar a thread terminar a execu��o para poder printar o restante do programa
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("Programa finalizado");
	}

}
