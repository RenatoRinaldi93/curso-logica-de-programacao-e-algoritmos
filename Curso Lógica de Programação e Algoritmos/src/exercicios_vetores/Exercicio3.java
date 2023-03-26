package exercicios_vetores;

import java.util.Scanner;
public class Exercicio3 {

	/*
	   Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
	   Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos 
	   elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int [] a = new int[N];
		int [] b = new int[N];
		
		for(int i = 0; i<N; i++) {
			a[i] = input.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			b[i] = input.nextInt();
		}
		
		int [] c = new int[N];
		for(int i = 0; i<N; i++) {
			c[i] = a[i] + b[i];
			System.out.print(c[i] + " ");
		}
		
		input.close();		

	}

}
