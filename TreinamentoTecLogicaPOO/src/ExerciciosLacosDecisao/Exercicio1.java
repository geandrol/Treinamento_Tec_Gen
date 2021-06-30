package ExerciciosLacosDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner ler = new Scanner(System.in);

		int num, cont = 0;

		System.out.println("digite 3 numeros inteiros e descubra qual é o maior? ");
		
		for (int x = 1; x < 4; x++) {
		
			System.out.println("digite o "+x+"º numero: ");
			num = ler.nextInt();

			if (num > cont) {

				cont = num;
			}
		}
		System.out.println("O numero maior é o " + cont);
	}
}
