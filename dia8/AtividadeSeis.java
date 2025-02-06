package exerciciosAvaliativos.dia8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeSeis {
	public static void main (String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero 
		 * seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam 
		 * múltiplos de 3. Veja o exemplo abaixo:
		 */
		
		Scanner leitura = new Scanner(System.in);
		
		double mediaAlunos = 0, entradaDados = 0, somaCalculo = 0;
		int numeroFinal, incrementoNumeros = 0;
		
		
		try {
			do {
				System.out.println("Digite um número: ");
				entradaDados = leitura.nextDouble();
				if (entradaDados % 3 == 0 && entradaDados != 0) {
					++incrementoNumeros;
					somaCalculo += entradaDados;
					mediaAlunos = (somaCalculo)/incrementoNumeros;
				}
			} while (entradaDados != 0);
			
			
			System.out.println("A média de " + somaCalculo + " e " + incrementoNumeros + " é: " + mediaAlunos);
			System.out.println("Encerrando programa...");
			
		} catch (InputMismatchException e) {
			System.out.println("Selecione um número válido...");
		}
		
		
		leitura.close();
	}
}
