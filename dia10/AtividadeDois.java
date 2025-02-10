package exerciciosAvaliativos.dia10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa 
		 * deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e 
		 * caso ele seja encontrado no ArrayList, exiba na tela a posição deste número 
		 * na Collection. Caso o número não seja encontrado, ele deverá exibir na tela 
		 * a mensagem: O número NN não foi encontrado!
		 */

		ArrayList<Integer> numero = new ArrayList<Integer>();
		Scanner leitura = new Scanner(System.in);
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		
		try {
			System.out.println("Digite o número que você deseja encontrar: ");
			int entradaUsuario = leitura.nextInt();
			
			if (numero.contains(entradaUsuario) == true) {
				System.out.println("O número " + entradaUsuario + " está localizado na posição: " + (numero.indexOf(entradaUsuario) + 1));
			} else {
				System.out.println("O número " + entradaUsuario + " não foi encontrado!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida, digite um número inteiro.");
		}

	}

}
