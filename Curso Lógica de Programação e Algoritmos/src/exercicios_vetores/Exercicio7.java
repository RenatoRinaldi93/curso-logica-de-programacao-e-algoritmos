package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

/*
  	Fazer um programa para ler um conjunto de N nomes de alunos, 
  	bem como as notas que eles tiraram no 1o e 2o semestres. Cada uma 
  	dessas informações deve ser armazenada em um vetor. Depois, imprimir 
  	os nomes dos alunos aprovados, considerando aprovados aqueles cuja média 
  	das notas seja maior ou igual a seis.
 */

public class Exercicio7 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		String [] nomeAlunos = new String[N];
		double [] mediaAlunos1 = new double[N];
		double [] mediaAlunos2 = new double[N];
		
		for(int i=0; i<N; i++) {
			nomeAlunos[i] = input.next();
			mediaAlunos1[i] = input.nextDouble();
			mediaAlunos2[i] = input.nextDouble();
		}
		
		double[] mediaTotal = new double[N];
		System.out.println("Alunos aprovados:");
		for(int i=0; i<N; i++) {
			mediaTotal[i] = (mediaAlunos1[i] + mediaAlunos2[i]) / 2.0;
			
			if(mediaTotal[i] >= 6.0) {
				System.out.println(nomeAlunos[i]);
			}
		}
		
		input.close();

	}

}
