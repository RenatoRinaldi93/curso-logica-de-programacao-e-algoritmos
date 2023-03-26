package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

/*
 Faça um programa que leia N números reais e armazene-os em um vetor. 
 Em seguida, mostrar na tela o maior número do vetor (supor não haver 
 empates). Mostrar também a posição do maior elemento.
 */

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
