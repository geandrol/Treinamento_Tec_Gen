package Biblioteca;

public class Professores {

	String nome, endereco, telefone, Departamento;
	int Itic, ensino;

	public Professores(String nome, String endereco, String telefone, String departamento, int itic, int ensino) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		Departamento = departamento;
		Itic = itic;
		this.ensino = ensino;
		
		System.out.println("O nome do aluno: "+nome+" o "+endereco+" o "+telefone+" a "
		+Departamento+" o "+ensino+" e a "+Itic);
	}

}
