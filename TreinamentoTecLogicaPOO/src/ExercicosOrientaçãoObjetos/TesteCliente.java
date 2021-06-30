package ExercicosOrientaçãoObjetos;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Cliente clie = new Cliente("joao","rua 2","1156456","gean@)");
		
	   clie.Exibir();
		
	}
}
