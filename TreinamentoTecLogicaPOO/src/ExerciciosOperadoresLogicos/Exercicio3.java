package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	//	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		
		int seg, mi, ho, segun;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite os segundos: ");
		seg = ler.nextInt();
		
		ho = (seg/60/60);
		mi = (seg/60%60);
		segun = (seg%60%60);
		
		System.out.println("tempo � de: "+ho+" hora/as e "+mi+" minuto/os e "+segun+" segundos");
		
	}
}
