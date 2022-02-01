package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//criar variáveis
		Scanner scan = new Scanner(System.in);
		
		//criação vetor com 20 elementos
		Lista<Contato> lista = new Lista<Contato>(20);
		
		//adicionar contatos
		criarContatoDinamicamente(10, lista);
		
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
				imprimeTamanhoVetor(lista);
				break;
			default:
				break;
			}
			
		}
		System.out.println("Usuário digitou 0. Programa encerrado.\n");

	}
	private static void imprimirVetor(Lista<Contato> lista) {
	
		System.out.println(lista);
		
	}
	private static void limparVetor(Lista<Contato> lista) {
		
		lista.limpar();
		System.out.println("Todos os contatos foram removidos do vetor.");
		
	}
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		
		System.out.println("Tamanho do vetor é: " + lista.tamanho());
		
	}
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser excluida: ", scan);
		
		try {
			contato = lista.busca(posicao);
			lista.remove(posicao);
			System.out.println("Contato excluído.");	
		}catch(Exception e) {
			System.out.println("Posição inválida.");
		}
		
	}

	private static void excluirPosicao(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser excluida: ", scan);
		
		try {
			lista.remove(posicao);
			System.out.println("Contato excluído.");	
		}catch(Exception e) {
			System.out.println("Posição inválida.");
		}
		
	}
	
	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			contato = lista.busca(posicao);
			boolean existe = lista.contem(contato);
			
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
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			contato = lista.busca(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do índice do contato encontrado: ");
			posicao = lista.busca(contato);
			System.out.println("Contato encontrado no indice" + posicao);
			
		}catch(Exception e) {
			System.out.println("Posição inválida.");
		}
		
	}
	
	private static void obtemContato(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			contato = lista.busca(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa de contato encontrado: ");
			posicao = lista.busca(contato);
			System.out.println("Contato encontrado na posicao" + posicao);
			
		}catch(Exception e) {
			System.out.println("Posição inválida.");
		}
		
	}
	
	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
		
		Contato contato;
		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			contato = lista.busca(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			
		}catch(Exception e) {
			System.out.println("Posição inválida.");
		}
		
	}
	
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato");
		System.out.println("Entre com as informações: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("Digite o telefone: ", scan);
		String email = leInformacao("Digite o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}
	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato");
		System.out.println("Entre com as informações: ");
		String nome = leInformacao("Digite o nome: ", scan);
		String telefone = leInformacao("Digite o telefone: ", scan);
		String email = leInformacao("Digite o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		int posicao = leInformacaoInt("Entre com a posição que deseja adicionar o contato: ", scan);
		
		try {
			lista.adiciona(posicao, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida. Contato não adicionado.");
		}
	}

	
	private static String leInformacao(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	private static int leInformacaoInt(String mensagem, Scanner scan) {
		
		boolean entradaValida = false;
		String entrada;
		int numero = 0;
		
		while (entradaValida) {
			
			try {
			System.out.println(mensagem);
			entrada = scan.nextLine();
			numero = Integer.parseInt(entrada);
			
			entradaValida = true;
			
			}catch(Exception e) {
				System.out.println("Entrada inválida. Digite novamente.");
			}
			
		}
		return numero;
	}
	
	private static int Menu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while (!entradaValida) {
			
			System.out.println("Digite a oção: ");
			System.out.println("1- Adicionar - ultima posição do vetor ");
			System.out.println("2- Adicionar - passando posição do vetor ");
			System.out.println("3- Busca - passando posição do vetor");
			System.out.println("4- Consulta - contato ");
			System.out.println("5- Consulta - ultimo índice do contato");
			System.out.println("6- Verifica se o contato existe");
			System.out.println("7- Exclui por posição");
			System.out.println("8- Exclui contato");
			System.out.println("9- Verifica tamanho do vetor");
			System.out.println("10- Exclui todos contatos do vetor");
			System.out.println("11- Imprime o vetor");
			System.out.println("0- Sair");
			
			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Opção incorreta, digite novamente: \n\n");
			}
		}
		return opcao;
	}
	
	private static void criarContatoDinamicamente(int capacidade, Lista<Contato> lista) {
		
		Contato contato;
		for (int i = 1; i < capacidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("9999-999" + i);
			contato.setEmail("contato" +i+ "@email.com");
			lista.adiciona(contato);
		}
		
	}

}
