package Calculadora;

import java.util.Scanner;

public class Acesso {
	Scanner ler = new Scanner(System.in);
	Ux menu = new Ux();
	OperadoresMat op = new OperadoresMat();
	int senha = 0, opcao = 0;

	void acesso() {

		for (int cont = 0; cont < 3; cont++) {

			if (senha != 1234) {
				System.out.println("difite sua senha");
				senha = ler.nextInt();
				menu.Linha();
				if (senha != 1234) {
					System.out.println("senha invalida!");
				}
				if (cont == 2) {
					System.out.println("Você tentou 3x sua senha foi bloqueada!");
				}
			} else {
				while (opcao != 5) {

					menu.menu();

					System.out.println("Digite uma opção!");
					opcao = ler.nextInt();

					switch (opcao) {
					case 1: {
						op.Soma();
						break;
					}
					case 2: {
						op.Subtracao();
						break;
					}
					case 3: {
						op.Divisao();
						break;
					}
					case 4: {
						op.Multiblicacao();
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
