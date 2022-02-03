package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileirar(T elemento) {
		super.adiciona(elemento);
	}
	
	public T desenfileirar() {
		
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		T elementoRemovido = this.elementos[POS];
		this.remove(POS);
		
		return elementoRemovido;
	}
	
	public T primeiroFila() {
		
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
}
