package Calculadora;

import java.util.Scanner;

public class OperadoresMat {
	Scanner ler = new Scanner(System.in);
	int num, num2, resul;

	void Soma() {

		System.out.println("Vamos ao calculo de soma!\n ");
		System.out.println("digite um numero: ");
		num = ler.nextInt();
		System.out.println("digite um numero: ");
		num2 = ler.nextInt();

		resul = num + num2;

		System.out.println(" a soma dos numeros � : " + resul);
	}

	void Subtracao() {

		System.out.println("Vamos ao calculo de Subtra��o!\n ");
		System.out.println("digite um numero: ");
		num = ler.nextInt();
		System.out.println("digite um numero: ");
		num2 = ler.nextInt();

		resul = num - num2;

		System.out.println(" a soma dos numeros � : " + resul);
	}

	void Divisao() {

		System.out.println("Vamos ao calculo de Divis�o!\n ");
		System.out.println("digite um numero: ");
		num = ler.nextInt();
		System.out.println("digite um numero: ");
		num2 = ler.nextInt();

		resul = num / num2;

		System.out.println(" a soma dos numeros � : " + resul);
	}

	void Multiblicacao() {

		System.out.println("Vamos ao calculo de Multiplica��o!\n ");
		System.out.println("digite um numero: ");
		num = ler.nextInt();
		System.out.println("digite um numero: ");
		num2 = ler.nextInt();

		resul = num * num2;

		System.out.println(" a soma dos numeros � : " + resul);
	}

}
