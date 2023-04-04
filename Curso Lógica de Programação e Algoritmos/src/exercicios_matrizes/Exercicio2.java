package exercicios_matrizes;

import java.util.Scanner;

/*
 Ler um número N e depois uma matriz quadrada NxN com números inteiros. 
 Depois, mostrar na tela a soma dos elementos de cada linha da matriz.
 */

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[][] mat = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		int[] vetSoma = new int[N];
		
		for(int i=0; i<N; i++) {
			int soma = 0;
			for(int j=0; j<N; j++) {
				soma += mat[i][j];
			}
			vetSoma[i] = soma;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(vetSoma[i] + " ");
		}
		
		input.close();

	}

}
