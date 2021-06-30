package Aula2;

import java.util.Scanner;

public class Exemple3MatrizEvetor {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String[] nomes = new String[4];

		for (int cont = 0; cont < 4; cont++) {
			System.out.println("digite seu nome: "+cont);
			nomes[cont] = ler.nextLine();
		}
		// String[] nomes = {
		// "Geandro","Cris","Marcelo","Michelle"
		// };
		for (int cont = 0; cont < 4; cont++) {

			System.out.println("Esses são os nomes :" + nomes[cont]);
		}

	}
}
