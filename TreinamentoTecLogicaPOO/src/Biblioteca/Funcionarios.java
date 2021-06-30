package Biblioteca;

public class Funcionarios {

	String nome, endereco, telefone, Departamento;
	int Numcracha;

	public Funcionarios(String nome, String endereco, String telefone, String departamento, int numcracha) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		Departamento = departamento;
		Numcracha = numcracha;
		
		System.out.println("O nome do Funcionario: "+nome+" o end: "+endereco+" o tel: "
		+telefone+" a sala: "+Departamento+" e o numero chacha: "+Numcracha);
	}

}
