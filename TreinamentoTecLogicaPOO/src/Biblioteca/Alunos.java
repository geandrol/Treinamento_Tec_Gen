package Biblioteca;

public class Alunos {

	String nome, endereco, telefone,anoEscolar;
	int carteirinaEs, sala;

	public Alunos(String nome, String endereco, String telefone, int carteirinaEs, int sala, String anoEscolar) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.carteirinaEs = carteirinaEs;
		this.sala = sala;
		this.anoEscolar = anoEscolar;

	}

	public Alunos() {

	}

	void ExiberDados() {
		System.out.println("O nome do aluno: " + nome + " o end: " + endereco + " o tel: " + telefone + " a sala: "
				+ sala + " o ano: " + anoEscolar + " e o numero carteirinha: " + carteirinaEs);
	}

}
