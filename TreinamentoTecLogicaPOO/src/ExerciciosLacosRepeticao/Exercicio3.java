package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		// idade for =-99. (WHILE)
		Scanner ler = new Scanner(System.in);

		int idade = 0, cont1 = 0, cont2 = 0;

		while (idade != 99) {

			System.out.println("Informe su idade :");
			idade = ler.nextInt();

			if (idade <= 21) {
				cont1++;
			}
			if (idade >= 50) {
				cont2++;
			}

		}
		System.out.println("Pssoas com menos de 21 anos são " + cont1 + " e com mais de 51 anos são " + cont2);

	}
}
