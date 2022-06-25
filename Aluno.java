package br.unoesc.atividades2506;

import java.util.Scanner;

public class Aluno {
	String nome;
	int idade;
	double media;	

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	void infoAluno() {
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		
	}
	void notas() {
		double[]notas = new double[4];
		double soma = 0;
		Scanner ler = new Scanner(System.in);
		for (int cont = 1; cont < 4; cont++) {
			System.out.println("Digite a " +cont+ "° nota:");
			notas[cont] = ler.nextDouble();
			soma = soma + notas[cont];
			}
		media = soma / 3;
			
		System.out.println("A soma das notas é "+soma+ ". A média é: "+media);
	}
	void verificarAprovacao() {
		
		if (media < 5) {
			System.out.print("Reprovado!");
		}else {
			if ((media >=5) && (media<7)) {
				System.out.print("Em exame!");
			}else if (media >= 7) {
				System.out.print("Aprovado!");
			}
		}
	}
}