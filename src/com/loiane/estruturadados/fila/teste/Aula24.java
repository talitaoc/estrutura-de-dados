package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(3);
		fila.enfileirar(2);
		
		System.out.println(fila);
		
	}

}
