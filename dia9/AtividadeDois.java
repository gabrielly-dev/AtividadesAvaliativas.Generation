package exerciciosAvaliativos.dia9;

import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		
		double vetor[] = new double[10];
		int linha;
		int somatoriaVetores = 0;
		double somatoriaVetoresMedia = 0;
		double quantidadeDeVetores = 0;
		double mediaDosVetores = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		for(linha = 0; linha < 10; linha++) {
			System.out.println("Digite o " + (linha + 1) + "º Número: ");
			vetor[linha] = leitura.nextDouble();
			System.out.println("________________________________________\n");
		}
		
		System.out.println("Elementos nos índices  ímpares: ");
		for (linha = 0; linha < 10; linha++) {
			if (linha % 2 != 0) {
				System.out.print(vetor[linha] + " ");
			}
		}
		
		System.out.println("\n");

		System.out.println("Elementos pares: ");
		for (linha = 0; linha < 10; linha++) {
			if (vetor[linha] % 2 == 0) {
				System.out.print(vetor[linha] + " ");
			}
		}
		
		System.out.println("\n");

		for (linha = 0; linha < 10; linha ++) {
			somatoriaVetores += vetor[linha];
		}
		System.out.println("Soma: " + somatoriaVetores + "\n");
		
		for (linha = 0; linha < 10; linha++) {
			somatoriaVetoresMedia += vetor[linha];
			++quantidadeDeVetores;
			mediaDosVetores = (somatoriaVetoresMedia)/quantidadeDeVetores;
		}
		System.out.printf("A média dos vetores é: %.2f", mediaDosVetores);
		
		leitura.close();
	}

}
