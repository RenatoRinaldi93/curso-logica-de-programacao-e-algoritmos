package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		   Fazer um programa para ler um vetor de N números reais. Em seguida, 
		   mostrar na tela a média aritmética de todos elementos. Depois mostrar 
		   todos os elementos do vetor que estejam abaixo da média
		 */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		double [] numerosReais = new double[N];
		
		for(int i = 0; i<N; i++) {
			numerosReais[i] = input.nextDouble();
		}
		
		double somaNumerosReais = Double.MIN_VALUE;
		for(int i = 0; i<N; i++) {
			somaNumerosReais += numerosReais[i];
		}
		
		double mediaNumerosReais = somaNumerosReais / N;
		System.out.printf("%.3f%n", mediaNumerosReais);

		
		for(int i = 0; i<N; i++) {
			if(numerosReais[i] < mediaNumerosReais) {
				System.out.printf("%.1f%n", numerosReais[i]);
			}
		}
		
		input.close();

	}

}
