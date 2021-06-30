package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	//	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		
		int seg, mi, ho, segun;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite os segundos: ");
		seg = ler.nextInt();
		
		ho = (seg/60/60);
		mi = (seg/60%60);
		segun = (seg%60%60);
		
		System.out.println("tempo é de: "+ho+" hora/as e "+mi+" minuto/os e "+segun+" segundos");
		
	}
}
