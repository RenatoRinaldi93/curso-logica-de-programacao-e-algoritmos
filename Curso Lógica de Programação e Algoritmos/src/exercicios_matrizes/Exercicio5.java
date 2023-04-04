package exercicios_matrizes;

import java.util.Scanner;

/*
 * Fazer um programa para ler duas matrizes de números inteiros A e B, 
 * contendo de M linhas e N colunas cada. Depois, gerar uma terceira 
 * matriz C onde cada elemento desta é a soma dos elementos correspondentes 
 * das matrizes originais. Imprimir na tela a matriz gerada.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		int[][] matA = new int[M][N];
		int[][] matB = new int[M][N];
		int[][] matC = new int[M][N];
		
		// leitura matriz A
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matA[i][j] = input.nextInt();
			}
		}
		
		// leitura matriz B
		for(int i=0;i<M; i++) {
			for(int j=0; j<N; j++) {
				matB[i][j] = input.nextInt();
			}
		}
		
		// gerando a matriz C
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}
		
		// imprimindo a matriz C
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
		
		input.close();

	}

}
