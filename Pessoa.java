package abstracao;

public class Pessoa {
	String nome;
	int idade;
	
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	void exibirInfo() {
		System.out.println("Nome: " +nome);	
		System.out.println("Idade: " +idade);
	}
}
