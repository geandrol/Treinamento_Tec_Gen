package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	//	valores de x e y.
			
		double x,y,a,b,c,d,e,f;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o valor de A: ");
		a = ler.nextDouble();
		System.out.println("digite o valor de B: ");
		b = ler.nextDouble();
		System.out.println("digite o valor de C: ");
		c = ler.nextDouble();
		System.out.println("digite o valor de D: ");
		d = ler.nextDouble();
		System.out.println("digite o valor de E: ");
		e = ler.nextDouble();
		System.out.println("digite o valor de F: ");
		f = ler.nextDouble();
	
		
		x = ((c*e) - (b*f))/((a*f) - (c*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de X è: "+ x);
		System.out.println("O valor de Y è: "+ y);
		
		
	}
}
