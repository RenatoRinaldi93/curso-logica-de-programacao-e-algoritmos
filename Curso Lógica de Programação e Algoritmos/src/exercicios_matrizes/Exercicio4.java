package exercicios_matrizes;

import java.util.Scanner;

/*
 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.
 */

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int [][] mat = new int [N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		int soma = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j > i) {
					soma += mat[i][j];
				}
			}
		}
		
		System.out.println(soma);
		
		input.close();

	}

}
