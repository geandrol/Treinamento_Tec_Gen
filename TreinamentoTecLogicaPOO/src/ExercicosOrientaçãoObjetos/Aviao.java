package ExercicosOrienta��oObjetos;

public class Aviao {

	String nomeP;
	int lugares, passage;

	public Aviao(String nomeP, int lugares, int passage) {
		super();
		this.nomeP = nomeP;
		this.lugares = lugares;
		this.passage = passage;
	}

	void Exibir() {

		System.out.println("Informa��o do avi�o: ");
		System.out.println("Nome do piloto: " + nomeP);
		System.out.println("Lugares disponiveis: " + lugares);
		System.out.println("Passageiros a bordo: " + passage);

	}

}