package abstracao;

public class Veiculo {
	int ano;
	String modelo, cor;
	double quilometragem;
	
		
	public Veiculo(int ano, String modelo, String cor, double quilometragem) {
		super();
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}
	void exibirInfo() {
		System.out.println("Ano: " +ano);	
		System.out.println("Modelo: " +modelo);
		System.out.println("Cor: " +cor);	
		System.out.println("Quilometragem: " +quilometragem);
	}

	void verificarManutencao() {
		if (quilometragem < 25000) {
			System.out.println("Tudo ok!");
		}else {
			if ((quilometragem >= 25000) && (quilometragem < 75000)) {
				System.out.println("Realizar revisão parcial!");
			}else {
				System.out.println("Realizar revisão completa!");
			}
		}
	}
	
	void mudarCor() {
		System.out.println(cor);
	}
	void exibirCor() {
		System.out.println("Cor atual: " +cor);
	}
}
