package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista <T> {
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; //solução livro Effective Java
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento){
		aumentaCapacidade(); 
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean adiciona(int posicao, T elemento)  {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		aumentaCapacidade();
		//movendo todos os elementos
		for (int i = this.tamanho-1; i >= posicao; i--) {  
			elementos[i+1] = elementos[i]; //elementos[5] = elementos[4];
		}
		elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T busca(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				return i;
			}	
		}
		return -1;
	}
	
	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	public int ultimoIndice(T elemento) {
		
		int ultimaPosicao = -1;
		for (int i = 0; i < this.tamanho; i++) {
			if(elementos[i].equals(elemento)) {
				ultimaPosicao = i;
			}	
		}
		return ultimaPosicao;
	}
	
	public boolean contem(T elemento) {
		int posicao = busca(elemento);
		if(posicao > -1) {
			return true;
		} else {
			return false;
		}
		//return busca(elemento) > -1 ou >=0;
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
	
	public void remove(T elemento) {
		
		int posicao = this.busca(elemento);
		if(posicao > -1) {
			this.remove(posicao);
		}
	}
	
	public void limpar() {
		
		//opcao 1
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//opcao 2
		for (int i = 0; i < this.elementos.length; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
		
		//opcao 3 
		//this.tamanho = 0;
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
