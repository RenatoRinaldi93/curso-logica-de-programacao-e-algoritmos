package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

/*
	Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar
	um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
	programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
		- lucro< 10%
		- 10% ≤ lucro ≤ 20%
		- lucro> 20%
	Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o
	lucro total.
 */

public class Exercicio9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		String [] produtos = new String[N];
		double [] precoCompra = new double[N];
		double [] precoVenda = new double[N];
		
		for(int i = 0; i<N; i++) {
			produtos[i] = input.next();
			precoCompra[i] = input.nextDouble();
			precoVenda[i] = input.nextDouble();	
		}
		
		int lucroAbaixoDe10 = 0;
		int lucroEntre10e20 = 0;
		int lucroAcimaDe20 = 0;
		for(int i = 0; i<N; i++) {
			
			double lucroTotal = precoVenda[i] - precoCompra[i];
			
			double porcentagemLucro = lucroTotal / precoCompra[i] * 100.0;
			
			if(porcentagemLucro < 10.0) {
				lucroAbaixoDe10++;
			} else if (porcentagemLucro >= 10.0 && porcentagemLucro <= 20.0) {
				lucroEntre10e20 ++;
			} else {
				lucroAcimaDe20 ++;
			}
		}
		
		System.out.println("Lucro abaixo de 10%%: " + lucroAbaixoDe10);
		System.out.println("Lucro entre 10%% e 20%%: " + lucroEntre10e20 );
		System.out.println("Lucro acima de 20%%: " + lucroAcimaDe20);
		
		
		double totalCompra = Double.MIN_VALUE;
		double totalVenda = Double.MIN_VALUE;
		double lucroTotal = Double.MIN_VALUE;
		for(int i = 0; i<N; i++) {
			totalCompra += precoCompra[i];
			totalVenda += precoVenda[i];
			
			lucroTotal = totalVenda - totalCompra;
		}
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro Total: %.2f", lucroTotal);
		
		input.close();

	}

}
