package exerciciosAvaliativos.dia8;

import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);

		int primeiroNumero, segundoNumero;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = leitura.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		segundoNumero = leitura.nextInt();
		
		if (primeiroNumero < segundoNumero) {
			for (int i = primeiroNumero; i <= segundoNumero; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				} 
			} 
		} else {
			System.out.println("Intervalo inválido");
		}
		
		leitura.close();
	}

}
