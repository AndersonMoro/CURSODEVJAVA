package abstracao;

import java.util.Scanner;

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
	
	void infoCar() {
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
		Scanner ler = new Scanner(System.in);
		System.out.println("Para qual cor quer mudar: ");
		cor = ler.nextLine();
	}
	void exibirCor() {
		System.out.println("Cor atual: " +cor);
	}
}
