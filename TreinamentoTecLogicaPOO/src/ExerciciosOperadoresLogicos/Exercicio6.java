package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	//Construa um programa em c que, tendo como dados de entrada dois pontos
	//	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
			
		double x1,y1,x2,y2,d,dr;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));
		
		System.out.println("a distancia entre eles é: "+d);
	}
}
