package br.unoesc.atividades2506;

import java.util.Scanner;

public class Conta {
	String titular,tipoconta;
	double dep, saque, sald, conta;
	int numeroconta;
	
		
	public Conta(String titular, String tipoconta, double sald, int numeroconta) {
		super();
		this.titular = titular;
		this.tipoconta = tipoconta;
		this.sald = sald;
		this.numeroconta = numeroconta;
	}	
	void infoConta() {
		System.out.println("Titular: "+titular);
		System.out.println("Tipo da conta: "+tipoconta);
		System.out.println("Saldo Atual: R$ "+sald);
		System.out.println("Número da conta: "+numeroconta);
		
		
	}
	void depositar() {
		System.out.println("Quanto quer depositar:R$ ");
		Scanner ler = new Scanner(System.in);
		dep = ler.nextDouble();
		System.out.println("Depósito de R$  "+dep+ " realizado com sucesso!");
	}
	void sacar() {
		System.out.println("Quanto quer sacar: ");
		Scanner ler = new Scanner(System.in);
		saque = ler.nextDouble();
		if (saque > sald) {
			System.out.println("Valor indisponível!");
		}
		if (saque <= sald) {
			System.out.println("Saque de R$ "+saque+ " realizado com sucesso!");			
		}
	}
	void verificarSaldo() {
		sald = (sald + dep) - saque;
		System.out.print("Saldo atual:R$ " +sald);
	}

		
	}

