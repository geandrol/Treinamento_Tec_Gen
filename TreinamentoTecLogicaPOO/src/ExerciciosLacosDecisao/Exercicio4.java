package ExerciciosLacosDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se
		// este
		// número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se
		// for
		// mpar exiba o número elevado ao quadrado.
		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("digite um numero para saber se é ipar ou par e tambem descubra a sua raiz quadrada ");
		num = ler.nextInt();

		if (num % 2 == 0) {

			System.out.println("esse numero é par");
			System.out.println("e a raiz quadrada é"+ Math.sqrt(num) );

		} else if (num % 2 != 0) {

			System.out.println("esse numero é impar");
			System.out.println("e a raiz quadrada é"+ Math.pow(num, 2) );

		}
	}

}
