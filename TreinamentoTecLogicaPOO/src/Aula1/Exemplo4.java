package Aula1;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		 // escopo de variaveis
		String nome;
		int num;
		
		Scanner ler = new Scanner(System.in);
		
	    System.out.println("digite seu nome: ");
		nome = ler.nextLine();
		
		  System.out.println("digite sua idade: ");
			num = ler.nextInt();
		
		System.out.println("Seu nome é:" + nome);
		System.out.println("Sua idade é:" + num);

	}

}
