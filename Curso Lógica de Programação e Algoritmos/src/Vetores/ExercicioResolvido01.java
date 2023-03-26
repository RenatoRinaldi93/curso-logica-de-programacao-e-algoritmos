package Vetores;

import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] vet = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = input.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		input.close();

	}

}
