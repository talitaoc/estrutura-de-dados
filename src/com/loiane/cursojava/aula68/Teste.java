package com.loiane.cursojava.aula68;

public class Teste {

	public static void main(String[] args) {

		MinhasThreadsRunnable thread1 = new MinhasThreadsRunnable("#1", 500);
		
		MinhasThreadsRunnable thread2 = new MinhasThreadsRunnable("#2", 800);
		
		MinhasThreadsRunnable thread3 = new MinhasThreadsRunnable("#3", 1100);
		
	}

}
