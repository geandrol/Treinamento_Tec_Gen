package ExerciciosLacosDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		Scanner ler = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for (int x = 0; x < 3; x++) {

			System.out.println("digite um numero: ");
			num[x] = ler.nextInt();
			
				
		}
		System.out.println("Ordem crescente ");	
	}
}
