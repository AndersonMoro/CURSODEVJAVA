package br.unoesc.atividades2506;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			Calculadora hp = new Calculadora();
			double n1, n2, tot;
			
			System.out.print("Digite um número: ");
			n1 = ler.nextDouble();
			System.out.print("Digite outro número: ");
			n2 = ler.nextDouble();
					
			
			tot = hp.soma(n1, n2);
			System.out.println("A soma é: "+tot);
			tot = hp.sub(n1, n2);
			System.out.println("A subtração é: "+tot);
			tot = hp.mult(n1, n2);
			System.out.println("A multiplicação é: "+tot);
			tot = hp.divisao(n1, n2);
			System.out.println("A divisão é: "+tot);
		}
		
		
		
	
		
	}
}
