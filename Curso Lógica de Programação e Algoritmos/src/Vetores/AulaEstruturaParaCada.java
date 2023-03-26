package Vetores;

import java.util.Scanner;

public class AulaEstruturaParaCada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = input.next();
		}
		
		System.out.println("Nomes lidos:");
		for(String s : nomes) {
			System.out.println(s);
		}

		/*
		 * linha 19 e 20 é uma alternativa ao método
		 * for(int i=0; i<N; i++) {
		 * 		System.out.println(nomes[i]);
		 * }
		 */
		
		input.close();
	}

}
