package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//	expressa em anos, meses e dias.
		
		
		int anos, mes, dias, diasV;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = (dias/365);
		mes = (dias%365/31);
		diasV = (dias%365%31);
		
		System.out.println("Você tem : "+ anos+" anos");
		System.out.println("Você tem : "+ mes+" meses");
		System.out.println("Você tem : "+ diasV+" meses");
		
	}
		
}
