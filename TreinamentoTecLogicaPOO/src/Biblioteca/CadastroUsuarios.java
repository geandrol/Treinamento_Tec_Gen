package Biblioteca;

import java.util.Scanner;

public class CadastroUsuarios {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Alunos aluno = new Alunos();
		
		System.out.println("Cadastre-se na biblioteca:");
		System.out.println("Digite seu nome: ");
	    aluno.nome = ler.next();
	    System.out.println("Digite seu endereço: ");
	    aluno.endereco = ler.next();
	    System.out.println("Digite seu telefone: ");
	    aluno.telefone = ler.next();
	    System.out.println("Digite o numro da sua sala: ");
	    aluno.sala = ler.nextInt();
	    System.out.println("Digite seu ano escolar: ");
	    aluno.anoEscolar = ler.next();
	    System.out.println("Digite seu numero de carteirinha: ");
	    aluno.carteirinaEs = ler.nextInt();
		
		aluno.ExiberDados();
		
	}
	


}
