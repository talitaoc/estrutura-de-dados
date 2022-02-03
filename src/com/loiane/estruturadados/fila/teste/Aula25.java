package com.loiane.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		
		Queue<Paciente> filaPrioridade = new PriorityQueue<>(
				new Comparator<Paciente>() {
					@Override
					public int compare(Paciente p1, Paciente p2) {
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}	
				}
		);

		filaPrioridade.add(new Paciente("Maria", 2));
		filaPrioridade.add(new Paciente("João", 1));
		filaPrioridade.add(new Paciente("Talita", 3));
		
		System.out.println(filaPrioridade);
	}

}
