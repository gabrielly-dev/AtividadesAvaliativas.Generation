package exerciciosAvaliativos.Dia11.Atividade2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	Stack<String> pilha = new Stack<String>();
	Scanner leitura = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.Menu();
	}
	
	private void Menu() {
		String menu = """
		\n+++++++++++++++++++++++++++++++++++++++++++++
			1 - Adicionar um novo livro na pilha
			2 - Listar todos os livros da pilha
			3 - Retirar um livro da pilha
			0 - Sair
		+++++++++++++++++++++++++++++++++++++++++++++
			""";
		System.out.println(menu);
		int opcao = leitura.nextInt();
		leitura.nextLine();
		 do {
			switch (opcao) {
				case 1:
					AdicionarLivroNaPilha();
					break;
				case 2:
					ListarLivros();
					break;
				case 3:
					RetirarLivroDaPilha();
					break;
				case 0: 
					System.out.println("Programa Finalizado!");
					break;
				default:
					System.out.println("Opção inválida!");
			} 
		} while (opcao != 0);
		
	}
	
	private void AdicionarLivroNaPilha() {
		System.out.println("\nVocê seleciou a opção de adicionar um livro a pilha: ");
		pilha.push(leitura.nextLine());
//		leitura.nextLine();
		System.out.println("\nLivros na lista: ");
		for (String nome : pilha) {
			System.out.println(nome);
		}
		Menu();
	}
	
	private void ListarLivros() {
		System.out.println("\nVocê selecionou a opção de listar todos os livros: ");
		System.out.print("\n");
		for (String nomes : pilha) {
			System.out.println(nomes);
		}
		Menu();
	}
	
	private void RetirarLivroDaPilha() {
		if (pilha.isEmpty() == false) {
			System.out.println("\nVocê selecionou a opção de retirar um livro da pilha: ");
			System.out.println("\nO livro excluído foi: " + pilha.peek() + "\n");
			pilha.pop();
			System.out.println("Lista de livros atualizada: ");
			for (String nomes : pilha) {
				System.out.println(nomes);
			}
			Menu();
		} else {
			System.out.println("\nA lista está vazia, por isso não é possível remover um livro\n");
			Menu();
		}

	}

}
