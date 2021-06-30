package Aula2;

import java.util.Scanner;
public class Exemplo2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double saldo=100,saque;
	    int senha=0,cont=0;
		
	    for (cont = 0 ; cont < 3; cont ++) {
	    
	    System.out.println(" digite sua senha sua senha: ");
	    senha = ler.nextInt();
	    
	    
	    if(senha == 1234)
	    {
	    	System.out.println("Digite o valor do saque; ");
		    saque = ler.nextDouble();
		    
	 	    if (saque > saldo) {
	    	
	    	System.out.println("Seu saldo é insuficiente!");
	    	
	    	
	    }
	    else {
	    	
	    	saldo = saldo - saque;
	    	
	    	System.out.println("Saldo tual :"+saldo);
	    	System.out.println("saque realizado com sucesso!");
	    	
	    }
	    }
	    else {
	    	System.out.println("senha errada!");
	    }
	    
	    }
	    System.out.println("Sua conta foi bloqueada!");
	 }
}

