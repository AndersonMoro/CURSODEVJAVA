package br.unoesc.atividades2506;

public class ContaPrincipal {

	public static void main(String[] args) {
		Conta cc = new Conta("Goiabinha", "Poupança", 5000, 9558-2);
		
		cc.infoConta();
		System.out.println("-------------");
		cc.depositar();
		System.out.println("-------------");
		cc.sacar();
		System.out.println("-------------");
		cc.verificarSaldo();

	}

}
