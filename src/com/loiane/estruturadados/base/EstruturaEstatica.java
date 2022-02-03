package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;
	
	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
		
	}
	
	protected boolean adiciona(T elemento){
		this.aumentaCapacidade(); 
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}
	
	protected boolean adiciona(int posicao, T elemento)  {
		if(posicao < 0 || posicao > this.tamanho) {
			throw new IllegalArgumentException("Posição inválida");
		}
		this.aumentaCapacidade();
		for (int i = this.tamanho-1; i >= posicao; i--) {  
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	protected void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			@SuppressWarnings("unchecked")
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}	
		}
		return -1;
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");			
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
		
		
	}
}
