package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		Scanner ler = new Scanner(System.in);
	
		int num,cont1=0,cont2=0;
		
		System.out.println(" Digite 4 numeros aleatorio e veremos quantos s�o pares e quantos s�o impares?");
		
		for(int x=1;x<5;x++) {
			
			
			System.out.println(" Digite o numero: "+x);
			num = ler.nextInt();
			
			if (num%2 == 0){
				cont1 ++;
				
			}
			if (num%2 != 0){
				cont2 ++;
				
			}
		}
		System.out.println("S�o "+cont1+" numero/os pares e "+cont2+" numero/os impares.");
	
	}

}
