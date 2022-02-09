package com.loiane.cursojava.aula72;

public class ThreadTiqueTaque implements Runnable{

	TiqueTaque tt;
	Thread t;
	final int NUM = 5;
	
	public ThreadTiqueTaque(String nome, TiqueTaque tt){
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
		
	}

	@Override
	public void run() {

		if(t.getName().equalsIgnoreCase("Tique")) {
			for(int i = 0; i < NUM; i++) {
				try {
					tt.tique(true);
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			tt.tique(false);
		} else {
			for(int i = 0; i < NUM; i++) {
				try {
					Thread.sleep(800);
					tt.taque(true);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			tt.taque(false);
		}
	}
}
