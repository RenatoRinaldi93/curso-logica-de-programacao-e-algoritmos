package exercicios_vetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		String [] nomes = new String[N];
		int [] idades = new int[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = input.next();
			idades[i] = input.nextInt();
		}
		
		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;
		for(int i=1; i<N; i++) {
			if(maiorIdade < idades[i]) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		
		input.close();

	}

}
