package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

/*
 	Fazer um programa para ler um vetor de N números inteiros. 
 	Em seguida, mostrar na tela a média aritmética somente dos números pares lidos.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] vet = new int[N];
		
		for(int i = 0; i<N; i++) {
			vet[i] = input.nextInt();
		}
		
		double somaPares = Double.MIN_VALUE;
		double qntdPares = Double.MIN_VALUE;
		for(int i = 0; i<N; i++) {
			if(vet[i] % 2 == 0) {
				somaPares += vet[i];
				qntdPares ++;
			}
		}
		
		double mediaPares = Double.MIN_VALUE;
		mediaPares = somaPares / qntdPares;
		
		System.out.printf("%.1f", mediaPares);
		
		input.close();

	}

}
