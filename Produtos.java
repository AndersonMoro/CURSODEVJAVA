package br.unoesc.atividades2506;

public class Produtos {
	String nome;
	double peso, preco,precoNovo;
	
	
	public Produtos(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	void infoProduto() {
		System.out.println("Produto: "+nome);
		System.out.println("PesoKg: "+peso);
		System.out.println("Preço: R$ "+preco);
		
	}
	
	void aumentarPeso() {
		if (preco < 50) {
			precoNovo = ((preco * 0.2) + preco);
		}else {
			precoNovo = ((preco * 0.10) + preco);
		}
		System.out.println("O preço anterior era R$ " +preco+ ". O preço atual R$ "+precoNovo);
	}
	
						
	

}
