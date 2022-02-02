package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.loiane.estruturadados.vetor.teste.Contato;

public class Exercicio07 extends Exercicio06 {
		public static void main(String[] args) {
			
			//criar variáveis
			Scanner scan = new Scanner(System.in);
			
			//criação vetor com 20 elementos
			ArrayList<Contato> lista = new ArrayList<Contato>(20);
			
			//adicionar contatos
			criarContatoDinamicamente(5, lista);
			
			//criar menu
			int opcao = 1;
			
			while (opcao != 0) {
				opcao = Menu(scan);
				
				switch (opcao) {
				case 1:
					adicionarContatoFinal(scan, lista);
					break;
				case 2:
					adicionarContatoPosicao(scan, lista);
					break;
				case 3:
					obtemContatoPosicao(scan, lista);
					break;
				case 4:
					obtemContato(scan, lista);
					break;	
				case 5:
					pesquisarUltimoIndice(scan, lista);
					break;	
				case 6:
					pesquisarContatoExiste(scan, lista);
					break;
				case 7:
					excluirPosicao(scan, lista);
					break;
				case 8:
					excluirContato(scan, lista);
					break;
				case 9:
					imprimeTamanhoVetor(lista);
					break;
				case 10:
					limparVetor(lista);
					break;
				case 11:
					imprimirVetor(lista);
					break;
				default:
					break;
				}
				
			}
			System.out.println("Usuário digitou 0. Programa encerrado.\n");

		}
		private static void imprimirVetor(ArrayList<Contato> lista) {
		
			System.out.println(lista);
			
		}
		private static void limparVetor(ArrayList<Contato> lista) {
			
			lista.clear();
			System.out.println("Todos os contatos foram removidos do vetor.");
			
		}
		private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
			
			System.out.println("Tamanho do vetor é: " + lista.size());
			
		}
		private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
			
			Contato contato;
			int posicao = leInformacaoInt("Entre com a posição a ser excluida: ", scan);
			
			try {
				contato = lista.get(posicao);
				lista.remove(contato);
				System.out.println("Contato excluído.");	
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void excluirPosicao(Scanner scan, ArrayList<Contato> lista) {

			int posicao = leInformacaoInt("Entre com a posição a ser excluida: ", scan);
			
			try {
				lista.remove(posicao);
				System.out.println("Contato excluído.");	
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
			
			Contato contato;
			int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
			
			try {
				contato = lista.get(posicao);
				boolean existe = lista.contains(contato);
				
				if(existe){
					System.out.println("Contato existe, seguem dados: ");
					System.out.println(contato);
				}else {
					System.out.println("Contato não existe.");
				}			
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
			
			Contato contato;
			int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
			
			try {
				contato = lista.get(posicao);
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
				
				System.out.println("Fazendo pesquisa do índice do contato encontrado: ");
				posicao = lista.lastIndexOf(contato);
				System.out.println("Contato encontrado no indice" + posicao);
				
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
			
			Contato contato;
			int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
			
			try {
				contato = lista.get(posicao);
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
				
				System.out.println("Fazendo pesquisa de contato encontrado: ");
				posicao = lista.lastIndexOf(contato);
				System.out.println("Contato encontrado na posicao" + posicao);
				
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
			
			Contato contato;
			int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
			
			try {
				contato = lista.get(posicao);
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
				
			}catch(Exception e) {
				System.out.println("Posição inválida.");
			}
			
		}
		private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
			System.out.println("Criando um contato");
			System.out.println("Entre com as informações: ");
			String nome = leInformacao("Digite o nome: ", scan);
			String telefone = leInformacao("Digite o telefone: ", scan);
			String email = leInformacao("Digite o email: ", scan);
			
			Contato contato = new Contato(nome, telefone, email);
			
			lista.add(contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		}
		private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
			System.out.println("Criando um contato");
			System.out.println("Entre com as informações: ");
			String nome = leInformacao("Digite o nome: ", scan);
			String telefone = leInformacao("Digite o telefone: ", scan);
			String email = leInformacao("Digite o email: ", scan);
			
			Contato contato = new Contato(nome, telefone, email);
			
			int posicao = leInformacaoInt("Entre com a posição que deseja adicionar o contato: ", scan);
			
			try {
				lista.add(posicao, contato);
				System.out.println("Contato adicionado com sucesso!");
				System.out.println(contato);
			}catch(Exception e) {
				System.out.println("Posição inválida. Contato não adicionado.");
			}
		}
		private static void criarContatoDinamicamente(int capacidade, ArrayList<Contato> lista) {
			
			Contato contato;
			for (int i = 1; i < capacidade; i++) {
				contato = new Contato();
				contato.setNome("Contato " + i);
				contato.setTelefone("9999-999" + i);
				contato.setEmail("contato" +i+ "@email.com");
				lista.add(contato);
			}
			
		}
	}
