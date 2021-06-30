package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	//	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	//	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	//	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	//	consumidor.
			
		double soma, custoF, porc, impos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o custo do carro: ");
		custoF = ler.nextDouble();
		
		porc = (custoF/100)*28;
		impos = (custoF/100)*45;
		soma = custoF + porc + impos;
		
		System.out.println(" O custo do carro ao consumidor é de: "+soma);
	}
}
