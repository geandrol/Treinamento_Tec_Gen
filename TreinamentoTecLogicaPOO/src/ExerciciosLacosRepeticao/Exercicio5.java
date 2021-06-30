package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um
		//número igual a zero. No final, mostre a soma dos números
		//digitados.(DO...WHILE)
		Scanner ler = new Scanner(System.in);
		
		int num,soma=0,resul=0;
		
		do {
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			soma = soma + num;
			
		} while(num != 0);
		
		System.out.println("A soma dos numeros é : "+soma);
		
	}

}
