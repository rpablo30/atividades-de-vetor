package atividadesvetores;

import java.util.Scanner;

public class somadevetoresdiferente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] vetor1 = new int[1];
		int [] vetor2 = new int[1];
		int [] soma = new int[1];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o valor do vetor 1 : ");
			vetor1[i] = teclado.nextInt();
			System.out.print("Digite o valor do vetor 2 : ");
			vetor2[i] = teclado.nextInt();
			}
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("O vetor 1 é =  ");
			System.out.println(vetor1[i]);
			
		}
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("O vetor 2 é : ");
			System.out.println(vetor2[i]);
			System.out.println(" ");
		}
		for (int i = 0; i < soma.length; i++) {
			System.out.print("A soma é: ");
			soma[i] = vetor1[i] + vetor2[i];
			System.out.println(soma[i] + "	.");
		}
		
		
	}

}
