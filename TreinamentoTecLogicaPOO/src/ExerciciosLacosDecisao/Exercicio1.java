package ExerciciosLacosDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		Scanner ler = new Scanner(System.in);

		int num, cont = 0;

		System.out.println("digite 3 numeros inteiros e descubra qual � o maior? ");
		
		for (int x = 1; x < 4; x++) {
		
			System.out.println("digite o "+x+"� numero: ");
			num = ler.nextInt();

			if (num > cont) {

				cont = num;
			}
		}
		System.out.println("O numero maior � o " + cont);
	}
}
