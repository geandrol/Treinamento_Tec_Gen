package ExerciciosLacosDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		// este
		// n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se
		// for
		// mpar exiba o n�mero elevado ao quadrado.
		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("digite um numero para saber se � ipar ou par e tambem descubra a sua raiz quadrada ");
		num = ler.nextInt();

		if (num % 2 == 0) {

			System.out.println("esse numero � par");
			System.out.println("e a raiz quadrada �"+ Math.sqrt(num) );

		} else if (num % 2 != 0) {

			System.out.println("esse numero � impar");
			System.out.println("e a raiz quadrada �"+ Math.pow(num, 2) );

		}
	}

}
