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
		
		
		// move todos da fila (menos o último) para a direita, em contagem decrescente
		for(int j=N-1; j>0; j--) {
			fila[girarFila][j] = fila[girarFila][j-1];
		}
		
		// armazena o último na primeira posição da fila
		fila[girarFila][0] = ultimoDaFila;
		
		
		// imprime a matriz alterada
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(fila[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();

	}

}
