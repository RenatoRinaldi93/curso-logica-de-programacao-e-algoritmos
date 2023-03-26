package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		double[] numeros = new double[N];
		
		double maior = Double.MIN_VALUE;
		int posicao = 0;
		for(int i = 0; i<N; i++) {
			numeros[i] = input.nextDouble();
			
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		input.close();

	}

}
