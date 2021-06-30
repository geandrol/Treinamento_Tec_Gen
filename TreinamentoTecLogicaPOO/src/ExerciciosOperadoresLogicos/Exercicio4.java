package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	//	calcule a seguinte expressão:
			
		int A,B,C,resul,R,S,D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		B = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		C = ler.nextInt();
		
		R = (A+B)*2;
		S = (B+C)*2;
		D = (R+S)/2;
		
		System.out.println(" /nO valor de R é :"+R);
		System.out.println(" /nO valor de S é :"+S);
		System.out.println(" /nO valor de D é :"+D);
	}
}
