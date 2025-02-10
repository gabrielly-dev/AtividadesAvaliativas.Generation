package exerciciosAvaliativos.Dia11.Atividade1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	Scanner leitura = new Scanner(System.in);
	Queue<String> fila = new LinkedList<String>();

	public static void main(String[] args) {
		Main main = new Main();
		main.Menu();
	}
	
	private void Menu() {
		String menu = """
		\n+++++++++++++++++++++++++++++++++++++++++++++
			1 - Adicionar Cliente na Fila
			2 - Listar todos os Clientes
			3 - Retirar Cliente na Fila
			0 - Sair
		+++++++++++++++++++++++++++++++++++++++++++++
			""";
		System.out.println(menu);
		int opcao = leitura.nextInt();
		leitura.nextLine();
		 do {
			switch (opcao) {
				case 0: 
					System.out.println("Programa Finalizado!");
					break;
				case 1:
					AdicionarClienteNaFila();
					break;
				case 2:
					ListarClientes();
					break;
				case 3:
					RetirarClienteDaFila();
					break;
				default:
					System.out.println("Opção inválida!");
			} 
		} while (opcao != 0);
		
	}
	
	private void AdicionarClienteNaFila() {
		System.out.println("\nVocê selecionou a opção de adicionar um cliente na fila: ");
		fila.add(leitura.nextLine());
//		leitura.nextLine();
		System.out.println("\nNomes na lista: ");
		for (String nome : fila) {
			System.out.println(nome);
		}
		Menu();
	}
	
	private void ListarClientes() {
		System.out.println("\nVocê selecionou a opção de listar todos os clientes: ");
		System.out.print("\n");
		for (String nomes : fila) {
			System.out.println(nomes);
		}
		Menu();
	}
	
	private void RetirarClienteDaFila() {
		if (fila.isEmpty() == false) {
			System.out.println("\nVocê selecionou a opção de retirar o cliente que já foi atendido: ");
			System.out.println("\nO nome excluído foi: " + fila.poll() + "\n");
			System.out.println("Lista atualizada: ");
			for (String nomes : fila) {
				System.out.println(nomes);
			}
			Menu();
		} else {
			System.out.println("\nA lista está vazia, por isso não é possível remover alguém\n");
			Menu();
		}

	}
}


