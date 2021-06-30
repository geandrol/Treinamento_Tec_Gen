package ExerciciosLacosDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		// categoria ela se encontra:
		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Qual a sua idade para ver qual categoria vc se enquadra? ");
		idade = ler.nextInt();

		if (idade < 10) {

			System.out.println("Você é muito novinho não tem categoria! ");

		}

		if (idade >= 10 && idade < 15) {

			System.out.println("Você faz parte do infantil! ");

		}
		if (idade >= 15 && idade < 18) {

			System.out.println("Você faz parte do Juvenil! ");

		}
		if (idade >= 18 && idade < 26) {

			System.out.println("Você faz parte do Juvenil! ");

		}
		if (idade >= 26)

		{

			System.out.println("Você é muito velho! ");

		}

	}
}
