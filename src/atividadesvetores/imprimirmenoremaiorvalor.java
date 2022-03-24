package atividadesvetores;

import java.util.Scanner;

public class imprimirmenoremaiorvalor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] valor1 = new int[3];
		
		for (int i = 0; i < valor1.length; i++) {	
			System.out.println("Digite o " + (i+1) + "° valor do vetor :" );
			valor1[i] = teclado.nextInt();
			
		}
		for (int i = 0; i < valor1.length; i++) {
			int antecessor=valor1[i]-1;
			System.out.println("O antecessor do número " + valor1[i] + " é " + antecessor + ".");
		}
		
		for (int i = 0; i < valor1.length; i++) {
			int sucessor=valor1[i]+1;
			System.out.println("O sucessor do número " + valor1[i] + " é " + sucessor);
		}
		
		
		
	}

}
