package Aula3;

public class ContaCorrente {

	String nome;
	int numconta, agencia, pix;
	double saldo;

	public ContaCorrente(String nome, int numconta, int agencia, int pix, double saldo) {
		super();
		this.nome = nome;
		this.numconta = numconta;
		this.agencia = agencia;
		this.pix = pix;
		this.saldo = saldo;
	}
	
	void ExiberDados() {
		
		System.out.print("Seu nome: " + nome + "\n");
		System.out.println("O numero da conta: " + numconta);
		System.out.println("Sua agerncia:  " + agencia);
		System.out.println("codigo pix: " + pix);
		System.out.println("Seu saldo é: " + saldo);
		
		
	}

}
