package br.unoesc.atividades2506;

public class ProdutosPrincipal {

	public static void main(String[] args) {
		Produtos feira1 = new Produtos("Goiaba", 2.00, 9.90);
		Produtos feira2 = new Produtos("Laranja", 5.5, 20.00);
		Produtos feira3 = new Produtos("Uva", 4.5, 10.00);
		Produtos feira4 = new Produtos("Pera", 18.50, 5.00);
		Produtos feira5= new Produtos("Melancia", 2.2, 2.00);
		Formatacao line = new Formatacao();
		
		
		feira1.infoProduto();
		feira1.aumentarPeso();
		line.linhas();
		
		feira2.infoProduto();
		feira2.aumentarPeso();
		line.linhas();
		
		feira3.infoProduto();
		feira3.aumentarPeso();
		line.linhas();
		
		feira4.infoProduto();
		feira4.aumentarPeso();
		line.linhas();
		
		feira5.infoProduto();
		feira5.aumentarPeso();
		line.linhas();
	}

}
