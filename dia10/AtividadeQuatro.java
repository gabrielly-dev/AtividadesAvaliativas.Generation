package exerciciosAvaliativos.dia10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		int entradaUsuario, repeticao;
		
		Set<Integer> numeros = new 	HashSet<Integer>();
		
		for (repeticao = 0; repeticao <= 9; repeticao ++) {
			System.out.println("Digite um número: ");
			entradaUsuario = leitura.nextInt();
			numeros.add(entradaUsuario);
		}
		
		Iterator<Integer> interator = numeros.iterator();
		
		while(interator.hasNext()) {
			//.next() -> ++
			System.out.println("O número é: " + interator.next());
		}
	}

}
