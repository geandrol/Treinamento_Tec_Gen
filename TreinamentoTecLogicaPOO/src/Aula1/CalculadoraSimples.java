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
					System.out.println("  | Op��o 1 - soma      |");
					System.out.println("  | Op��o 2 - subtra��o |");
					System.out.println("  | Op��o 3 - divis�o   |");
					System.out.println("  | Op��o 4 - multipli  |");
					System.out.println("  | Op��o 5 - sai       |");
					System.out.println("  |_____________________|");

					System.out.println("\nDigite sua op��o: ");
					opcao = ler.nextInt();

					switch (opcao) {

					case 1: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num + num2;

						System.out.println("A soma dos numeros � : " + resul);
						break;
					}

					case 2: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num - num2;

						System.out.println("A subtra��o dos numeros � : " + resul);
						break;

					}

					case 3: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num / num2;

						System.out.println("A divis�o dos numeros � : " + resul);
						break;

					}

					case 4: {

						System.out.println("\nDigite um numero: ");
						num = ler.nextInt();
						System.out.println("Digite outro numero: ");
						num2 = ler.nextInt();

						resul = num * num2;

						System.out.println("A multiplica��o dos numeros � : " + resul);
						break;

					}

					}
					if (opcao < 1 || opcao > 5) {

						System.out.println("!N�o existe essa Op��o!");

					}

					if (opcao == 5) {
						System.out.println("Volte sempre!");
					}
				}

			}

		}
	}

}
