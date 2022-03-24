package atividadesvetores;

import java.util.Scanner;

public class somademesmoovetor {

	public static void main(String[] args) {
		
		int [] vetorA = new int[2];
		int soma = 0;
		
		for (int  i= 0;  i< vetorA.length; i++) {
			System.out.println("Digite o "+ (i+1) + "° valor do vetor 1.");
			Scanner teclado = new Scanner(System.in);
			vetorA[i] = teclado.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			soma=soma+vetorA[i];
		
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A [ "+ (i+1) + "] = " + vetorA[i]);
		}
		System.out.println(soma);
	
	
	}

}
