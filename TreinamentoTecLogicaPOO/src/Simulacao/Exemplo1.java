package Simulacao;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		// Faça um programa que receba três numeros inteiros e diga qual deles é o maior.
		Scanner ler = new Scanner(System.in);
		
		int numero,maior=0;
		
		System.out.println("Faça um programa que leia tres numeros e me diga qual é o maior?");
		
		for(int x=1; x<4; x++ ) {
			
			System.out.println("Digite o "+x+"º numero:");
			numero = ler.nextInt();
			
			if (numero>maior) {
				
				maior = numero;
				
			}
			
			
		}
		System.out.println("O numero maior é "+maior);
	
	}
}
