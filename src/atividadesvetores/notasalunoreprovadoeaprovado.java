package atividadesvetores;

import java.lang.Character.UnicodeScript;
import java.util.Locale;
import java.util.Scanner;

public class notasalunoreprovadoeaprovado {

	private static final Locale US = null;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		double []  nota1 = new double[1];
		double []  nota2 = new double[1];
		double [] 	soma  = new double[1];
		double []  media = new double[1]; 
		for (double i = 0; i < nota2.length; i++) {
			
			System.out.println("Qual é a primeira nota: " );
			nota1[(int) i] = teclado.nextDouble();
			System.out.print("A nota 1 é = ");
			System.out.println(nota1[(int) i]);
			
			System.out.println("Qual é a segunda nota: ");
			nota2[(int) i] = teclado.nextDouble();
			System.out.print("A nota 2 é = ");
			System.out.println(nota2[(int) i]);
		
		}for (int i = 0; i < soma.length; i++) {
			soma[i] = nota1[i] + nota2[i];
			System.out.print("A soma das notas é: ");
			System.out.println(soma[i]);
		}for (int i = 0; i < soma.length; i++) {
			media[i] = ((nota1[i] + nota2[i])/2);
			System.out.print("A média das notas é:  ");
			System.out.println(media[i]);
		}for (int i = 0; i < media.length; i++) {
		if(media[i]<=3) {
			System.out.println("Aluno reprovado.");
		}else if(media[i]<=6 && media[i]>=4) {
			System.out.println("Aluno está em recuperação");
		}else if(media[i]>6 && media[i]<11) {
			System.out.println("Aluno está aprovado.");
		}
		
		
		}
		
		
		
		
		
		
		/*for (double i = 0; i < soma.length; i++) {
			soma[i] = nota1[i] + nota2[i];
			System.out.print("A soma das notas é: ");
			System.out.println(soma[i]);
		}
		for (double i = 0; i < soma.length; i++) {
			double media = ((nota1[i]+nota2[i])/2);
			System.out.println(media);
		}*/
		
		
	
	
	
		
	}

}
