package Aula3;

public class Livros {

	String Titulo;
	String Autor;
	int Num_Paginas;
	String Editora;
	int Isbn;
	double Valor;

	public Livros(String titulo, String autor, int num_Paginas, String editora, int isbn, double valor) {
		Titulo = titulo;
		Autor = autor;
		Num_Paginas = num_Paginas;
		Editora = editora;
		Isbn = isbn;
		Valor = valor;
	}
	
	public Livros() {}

	void ExibirDados() {

		System.out.print("O titulo � " + Titulo + "\n");
		System.out.println("O autor � " + Autor);
		System.out.println("O numero de paginas � " + Num_Paginas);
		System.out.println("A editora � " + Editora);
		System.out.println("O isbn � " + Isbn);
		System.out.println("O valor � " + Valor);

	}

}
