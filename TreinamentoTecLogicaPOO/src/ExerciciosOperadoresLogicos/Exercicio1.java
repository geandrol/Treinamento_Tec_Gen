package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
    //dias e mostre-a expressa apenas em dias.	
		
		
		int anos, mes, dias, idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua Idade: ");
		anos = ler.nextInt();
		
		System.out.println("Digite mes de nascimnto: ");
		mes = ler.nextInt();
		
		System.out.println("Digite dia de nascimento: ");
		dias = ler.nextInt();
		
		idade = ((mes*31)+(anos*365)+dias);
		
		System.out.println("Sua idadade em dias é: "+ idade);

	}

}
