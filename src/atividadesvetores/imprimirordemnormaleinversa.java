package atividadesvetores;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class imprimirordemnormaleinversa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] vetor = new int[6];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o [" + (i+1) + "°] número do vetor: ");
			vetor[i]=teclado.nextInt();
		}
		System.out.println("O valor dos vetores em forma crescente é: ");
		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length-1; i++) {
			System.out.println(vetor[i]);
			
		}
		System.out.println("Ordem inversa:");
		for (int i = vetor.length -1 ; i >=0  ; i--) {
			System.out.println(vetor[i]);
			
		}
		
	}

}
