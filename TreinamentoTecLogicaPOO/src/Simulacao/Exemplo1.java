package Simulacao;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s numeros inteiros e diga qual deles � o maior.
		Scanner ler = new Scanner(System.in);
		
		int numero,maior=0;
		
		System.out.println("Fa�a um programa que leia tres numeros e me diga qual � o maior?");
		
		for(int x=1; x<4; x++ ) {
			
			System.out.println("Digite o "+x+"� numero:");
			numero = ler.nextInt();
			
			if (numero>maior) {
				
				maior = numero;
				
			}
			
			
		}
		System.out.println("O numero maior � "+maior);
	
	}
}
