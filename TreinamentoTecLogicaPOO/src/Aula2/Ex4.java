package Aula2;

public class Ex4 {
	
	public static void main(String[] args) {
		
		String[][] letras = new String[3][3];
		
		letras[0][0] = "a";
		letras[0][1] = "b";
		letras[0][2] = "c";	
		
		letras[1][0] = "d";
		letras[1][1] = "e";
		letras[1][2] = "f";
		
		letras[2][0] = "g";
		letras[2][1] = "h";
		letras[2][2] = "i";
		
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(letras[lin][col] + " | ");
			}
			System.out.println();
		}
	}

}
