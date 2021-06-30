package Aula1;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		//
		Scanner ler = new Scanner(System.in);
		int opcao = 0, senha = 0, cont = 0;
		double resul, num, num2;

		for (cont = 0; cont < 3; cont++) {
			
			if (senha != 1234) {
				System.out.println("Digite sua senha para acessar a calculadora: ");
				senha = ler.nextInt();
			
				System.out.println("________________________________: ");
				
				if (senha != 1234) {
	                 System.out.println("senha invalida!");
				}

				if (cont == 2) {
					System.out.println("Sua senha foi bloquada!");

				}
			}

			else {

				while (opcao != 5) {
					System.out.println("\n   ---------------------");
					System.out.println("  |     CALCULADORA     |");
					System.out.println("  |_____________________|");
					System.out.println("  |                     |");
					System.out.println("  | Opção 1 - soma      |");
					System.out.println("  | Opção 2 - subtração |");
					System.out.println("  | Opção 3 - divisão   |");
					System.out.println("  | Opção 4 - multipli  |");
					System.out.println("  | Opção 5 - sai       |");
					System.out.println("  |_____________________|");

					System.out.println("\nDigite sua opção: ");
					opcao = ler.nextInt();

					switch (opcao) {

					case 1: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num + num2;

						System.out.println("A soma dos numeros è : " + resul);
						break;
					}

					case 2: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num - num2;

						System.out.println("A subtração dos numeros è : " + resul);
						break;

					}

					case 3: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num / num2;

						System.out.println("A divisão dos numeros è : " + resul);
						break;

					}

					case 4: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num * num2;

						System.out.println("A multiplicação dos numeros è : " + resul);
						break;

					}

					}
					if (opcao < 1 || opcao > 5) {

						System.out.println("!Não existe essa Opção!");

					}

					if (opcao == 5) {
						System.out.println("Volte sempre!");
					}
				}

			}

		}
	}

}
