package exercicios_matrizes;

import java.util.Scanner;

/*
 Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o 
 maior elemento de cada linha. Suponha não haver empates.
 */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[][] mat = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i= 0; i<N; i++) {
			int maiorValor = mat[i][0];
			for(int j=0; j<N; j++) {
				if(maiorValor < mat[i][j]) {
					maiorValor = mat[i][j];
				}
			}
			System.out.println(maiorValor + " ");
		}
		
		input.close();

	}

}
