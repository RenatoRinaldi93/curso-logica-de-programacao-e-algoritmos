package exercicios_matrizes;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		int[][] fila = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				fila[i][j] = input.nextInt();
			}
		}
		
		int girarFila = input.nextInt();
		
		// Aqui decrementa o valor de girar Fila
		girarFila = girarFila - 1;
		
		// aqui salva o último da fila escolhida
		int ultimoDaFila = fila[girarFila][N-1];
		
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print( + " ");
			}
		}
		
		input.close();

	}

}
