package br.unoesc.atividades2506;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			Calculadora hp = new Calculadora();
			double n1, n2, tot;
			
			System.out.print("Digite um n�mero: ");
			n1 = ler.nextDouble();
			System.out.print("Digite outro n�mero: ");
			n2 = ler.nextDouble();
					
			
			tot = hp.soma(n1, n2);
			System.out.println("A soma �: "+tot);
			tot = hp.sub(n1, n2);
			System.out.println("A subtra��o �: "+tot);
			tot = hp.mult(n1, n2);
			System.out.println("A multiplica��o �: "+tot);
			tot = hp.divisao(n1, n2);
			System.out.println("A divis�o �: "+tot);
		}
		
		
		
	
		
	}
}
