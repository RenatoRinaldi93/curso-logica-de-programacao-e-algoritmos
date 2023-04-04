package matrizes;

import java.util.Scanner;

public class ExercicioExemplo1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int [][] mat = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVO = " + cont);
		
		
		input.close();

	}

}
