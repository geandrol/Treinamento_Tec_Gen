package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. E no
		//final imprimir a média dos números múltiplos de 3. Para sair digitar
		//0(zero).(DO...WHILE)
		Scanner ler = new Scanner(System.in);
	
	  int num,media=0,soma=0,cont=0;
	  
	  do {
		  
		  System.out.println("Digite um numero: ");
		  num = ler.nextInt();
		  
		  if(num%3==0 ) {
			  cont ++;
			  soma = soma + num;
			  media = soma / cont;
				  }
		  
	  }while(num != 1) ;

	  System.out.println("a media dos numeros multiplos de 3 é "+media);
	}
}
