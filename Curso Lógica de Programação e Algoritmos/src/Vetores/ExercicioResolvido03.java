package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		String [] nomes = new String[N];
		int [] idade = new int[N];
		double [] altura = new double[N];
		
		for(int i = 0; i<N; i++) {
			
			nomes[i] = input.next();
			idade[i] = input.nextInt();
			altura[i] = input.nextDouble();
		
		}
		
		double somaAltura = 0.0;
		for(int i =0; i<N; i++) {
			
			somaAltura += altura[i];
			
		}
		
		int idadeMenor16 = 0;
		for(int i=0; i<N; i++) {
			
			if(idade[i] < 16) {
				idadeMenor16 +=1;
			}
		}
		
		double mediaAltura = somaAltura / N;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		double porcentagemAlunosMenores16 = (double) idadeMenor16 * 100 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", porcentagemAlunosMenores16);
		
		input.close();

	}

}
