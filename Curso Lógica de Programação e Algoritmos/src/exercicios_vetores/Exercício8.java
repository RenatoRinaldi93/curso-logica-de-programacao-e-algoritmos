package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

/*
 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. 
   Fazer um programa que calcule e escreva:
		- a maior e a menor altura do grupo
		- a média de altura das mulheres
		- o número de homens
 */

public class Exercício8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		double [] altura = new double[N];
		char [] sexo = new char[N];
		
		for(int i=0; i<N; i++) {
			altura[i] = input.nextDouble();
			sexo[i] = input.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		double totalAlturaF = Double.MIN_VALUE;
		double mediaAlturaF = Double.MIN_VALUE;
		int totalM = 0;
		int totalF = 0;
		for(int i=0; i<N; i++) {
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
			
			if(sexo[i] == 'F') {
				totalF ++;
				totalAlturaF += altura[i];
			}
			
			if(sexo[i] == 'M') {
				totalM ++;
			}
		}
		
		mediaAlturaF = totalAlturaF / totalF;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média da altura das mulheres = %.2f%n", mediaAlturaF);
		System.out.print("Número de homens = " +  totalM);
		
		input.close();

	}

}
