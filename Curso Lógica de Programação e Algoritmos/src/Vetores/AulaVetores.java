package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class AulaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		double [] vet = new double[N]; //Criando e instanciando o vetor
		
		for(int i=0; i<N; i++) {
			vet[i] = input.nextDouble();
		}
		
		for(int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		
		
		input.close();

	}

}
