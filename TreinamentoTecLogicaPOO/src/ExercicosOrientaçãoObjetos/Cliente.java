package ExercicosOrientaçãoObjetos;

import java.util.Scanner;

public class Cliente {

	Scanner ler = new Scanner(System.in);
	String nome, Endereco, telefone, email;

	public Cliente(String nome, String endereco, String telefone, String email) {
		this.nome = nome;
		Endereco = endereco;
		this.telefone = telefone;
		this.email = email;

	}

	void Exibir() {

		System.out.println("Esse são seus dados: ");
		System.out.println("Seu nome: " + nome);
		System.out.println("Seu nome: " + Endereco);
		System.out.println("Seu nome: " + telefone);
		System.out.println("Seu nome: " + email);

	}

}
