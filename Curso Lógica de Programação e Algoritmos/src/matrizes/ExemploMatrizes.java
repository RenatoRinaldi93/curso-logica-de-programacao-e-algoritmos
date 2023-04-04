package matrizes;

import java.util.Scanner;

public class ExemploMatrizes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.printf("%d\t", mat[i][j]);
			}
			System.out.println();
		}
		
		input.close();

	}

}
