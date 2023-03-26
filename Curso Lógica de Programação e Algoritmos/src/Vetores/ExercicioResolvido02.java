package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		double [] vet = new double[N];
		
		double soma = 0;
		for(int i = 0; i<N; i++) {
			vet[i] = input.nextDouble();
			
			soma += vet[i];
		}
		
		for(int i = 0; i<N; i++) {
			System.out.printf("%.1f ", vet[i]);
			
		}
	
		System.out.println();
		double media = soma / N;
		
		System.out.printf("%.1f%n", soma);
		System.out.printf("%.1f", media);
		
		input.close();

	}

}
