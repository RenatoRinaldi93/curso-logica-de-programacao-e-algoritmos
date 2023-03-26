package exercicios_vetores;

import java.util.Scanner;

/*
 Faça um programa que leia N números inteiros e armazene-os em um vetor. 
 Em seguida, mostre na tela:
		- todos os números pares
		- a quantidade de números pares
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] numeros = new int[N];
		
		for(int i = 0; i<N; i++) {
			numeros[i] = input.nextInt();
		}
		
		int qntdNumerosPares = 0;
		for(int n : numeros) {
			if(n % 2 ==0) {
				qntdNumerosPares += 1;
				System.out.print(n + " ");
			}
		}
		
		System.out.println();
		System.out.print(qntdNumerosPares);
		
		
		input.close();

	}

}
