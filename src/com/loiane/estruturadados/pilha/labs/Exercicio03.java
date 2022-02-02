package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Livro;
import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilhaLivro = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
		Livro livro5 = new Livro();
		Livro livro6 = new Livro();
		
		livro1.setIsbn("8535933921");
		livro1.setNome("Sapiens (Nova edição): Uma breve história da humanidade");
		livro1.setAnoLancamento("2020");
		livro1.setAutor("Yuval Noah Harari ");
		
		livro2.setIsbn("8575420275");
		livro2.setNome("O poder do agora: Um guia para a iluminação espiritual");
		livro2.setAnoLancamento("2000");
		livro2.setAutor("Eckhart Tolle ");
		
		livro3.setIsbn("853252978X");
		livro3.setNome("Mulheres que correm com os lobos");
		livro3.setAnoLancamento("2018");
		livro3.setAutor("Clarissa Pinkola Estés");
		
		livro4.setIsbn("8595081514");
		livro4.setNome("O pequeno príncipe");
		livro4.setAnoLancamento("2018");
		livro4.setAutor("Antoine de Saint-Exupéry");
		
		livro5.setIsbn("8535909559");
		livro5.setNome("A revolução dos bichos: Um conto de fadas");
		livro5.setAnoLancamento("2007");
		livro5.setAutor("George Orwell");
		
		livro6.setIsbn("8574068179");
		livro6.setNome("A parte que falta");
		livro6.setAnoLancamento("2018");
		livro6.setAutor("Shel Silverstein ");
		
		System.out.println("A pilha está vazia? \n" + pilhaLivro.estaVazia());
		System.out.println(pilhaLivro);
		System.out.println("");
		System.out.println("");
		
		pilhaLivro.empilhar(livro1);
		pilhaLivro.empilhar(livro2);
		pilhaLivro.empilhar(livro3);
		pilhaLivro.empilhar(livro4);
		pilhaLivro.empilhar(livro5);
		pilhaLivro.empilhar(livro6);
		
		
		System.out.println(pilhaLivro.tamanho() + " livros foram empilhados.\n");
		System.out.println(pilhaLivro);
		System.out.println("");
		
		System.out.println("O livro que está em cima é: \n" + pilhaLivro.topo());
		
		while(!pilhaLivro.estaVazia()) {
			
			System.out.println("Desempilhando " + pilhaLivro.desempilhar());
		}
		
		System.out.println("\n\nTodos os livros foram desempilhados.\n\n");
		
		System.out.println("A pilha está vazia? " + pilhaLivro.estaVazia());
		
		
		
		
		
		
		
	}

}
