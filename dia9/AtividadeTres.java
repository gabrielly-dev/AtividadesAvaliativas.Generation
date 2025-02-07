package exerciciosAvaliativos.dia9;

public class AtividadeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		/*
		 * {1,2,3}
		 * {4,5,6}
		 * {7,8,9}
		 */

		for (int linha = 0; linha <= 2; linha ++) {
			System.out.println("O valor da diagonal principal é: " + matriz[linha][linha]);
			somaDiagonalPrincipal += matriz[linha][linha];
		}
		System.out.println("A soma dos valores é: " + somaDiagonalPrincipal);
		
		for (int linha = 2; linha >= 0; linha--) {
			System.out.println("O valor da diagonal secundário é: " + matriz[linha][2 - linha]);
			somaDiagonalSecundaria += matriz[linha][linha];
		}
		System.out.println("A soma dos valores é: " + somaDiagonalPrincipal);
		
	}

}
