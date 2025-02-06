package exerciciosAvaliativos.dia8;

import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int acumuloMenores = 0;
		int acumuloMaiores = 0;
		int entrada = 1;

		
		while (entrada > 0) {
			System.out.println("Informe uma idade: ");
			entrada = leia.nextInt();
			
			if (entrada <= 21) {
				++acumuloMenores;
			} else if (entrada >= 50) {
				++acumuloMaiores;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + acumuloMenores);
		System.out.println("Total de pessoas menores de 50 anos: " + acumuloMaiores);
		
		leia.close();
	}

}
