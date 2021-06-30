package Aula3;

public class Pessoa {

	String nome, endereco, email;
	int cep, tel;

	public Pessoa(String nome, String endereco, String email, int cep, int tel) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cep = cep;
		this.tel = tel;
	}
	void ExiberDados() {
		
		System.out.print("Seu nome: " + nome + "\n");
		System.out.println("Seu emdereço: " + endereco);
		System.out.println("Seu cep:  " + cep);
		System.out.println("Seu telefone: " + tel);
		System.out.println("Seu email: " + email);
		
		
	}

 }
