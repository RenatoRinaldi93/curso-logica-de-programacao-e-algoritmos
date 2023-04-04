package exercicios_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		double[][] mat = new double[N][N];
		
		// leitura da matriz
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = input.nextDouble();
			}
		}
		
		int escolhaLinha = input.nextInt();
		int escolhaColuna = input.nextInt();
		
		System.out.print("SOMA DOS POSITIVOS: ");
		double somaPositivos = 0.0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] > 0.0) {
					somaPositivos += mat[i][j];
				}
			}
		}
		System.out.printf("%.1f%n", somaPositivos);
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(int j=0; j<N; j++) {
			System.out.printf("%.1f ", mat[escolhaLinha][j]);
		}
		System.out.println();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i=0; i<N; i++) {
			System.out.printf("%.1f ", mat[i][escolhaColuna]);
		}
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(int i=0; i<N; i++) {
			System.out.printf("%.1f ",mat[i][i]);
		}
		System.out.println();
		
		
		System.out.println("MATRIZ ALTERADA:");
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] *= mat[i][j];
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		
		
		input.close();

	}

}
