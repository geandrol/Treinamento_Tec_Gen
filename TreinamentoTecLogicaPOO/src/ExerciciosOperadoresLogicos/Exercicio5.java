package ExerciciosOperadoresLogicos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	//	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	//	respectivamente.
			
		int nota1,nota2,nota3;
		double media,soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("nota 1: ");
		nota1 = ler.nextInt();
		System.out.println("nota 2: ");
		nota2 = ler.nextInt();
		System.out.println("nota 3: ");
		nota3 = ler.nextInt();
		
		soma = nota1+nota2+nota3;
		media = soma / 3;
		
		System.out.println(" A media das notas �: "+media);
	}

}
