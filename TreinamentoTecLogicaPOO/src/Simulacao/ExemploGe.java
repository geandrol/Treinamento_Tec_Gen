package Simulacao;
import java.util.Scanner;
public class ExemploGe {
	public static void main(String[] args) {

		// Escrever um programa que receba vários números inteiros no teclado. E no
		// final imprimir a média dos números múltiplos de 3. Para sair digitar
		// -1.(DO...WHILE)
		
		Scanner ler = new Scanner(System.in);
		
	   int numero,media=0,soma=0,cont=0;
	   
	   do {
		   
		   System.out.println("Digite um numero");
		   numero = ler.nextInt();
		   
		   if(numero%3==0) {
			    
			   cont ++;
			   soma = soma + numero;
			   media = soma / cont;
			   
		   }
		   
		   
	   }while(numero != -1);
	   
	   System.out.println("A media dos numeros multiplos de 3 é? "+media);
		
	}
}
