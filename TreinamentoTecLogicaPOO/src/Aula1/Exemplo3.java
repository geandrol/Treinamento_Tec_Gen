package Aula1;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		//
		Scanner ler = new Scanner(System.in);
		int resulS=0,resulSu=0,resulD=0,resulM=0,num,num2;
		
		System.out.println("\n   ---------------------");
		System.out.println("  |    Calculadora      |");
		System.out.println("  |_____________________|");
		
		System.out.println("\nDigite um numero: ");
		num = ler.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = ler.nextInt();
		
		resulS = num + num2;
		resulSu = num - num2;
		resulD = num / num2;
		resulM = num * num2;
		
		System.out.println("soma dos numeros :" + resulS);
		System.out.println("subtração dos numeros :" + resulSu);
		System.out.println("divisao dos numeros :" + resulD);
		System.out.println("multiplicação dos numeros :" + resulM);
		

	}

}
