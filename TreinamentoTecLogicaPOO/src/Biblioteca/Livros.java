package Biblioteca;

public class Livros {

	String nome,ligua,midia,autor,editora;
	int imprestimo;
	
	void MostrarDados(){
		
		System.out.println("O nome do livro: "+nome+" a midia: "+midia+" o autor: "+autor+" a editora"
		+editora+" e o historico de imprestimo: "+imprestimo);
	}
}
