package br.unoesc.atividades2506;

import java.util.ArrayList;
import java.util.Scanner;

public class CadernoAnotacoes {
	String nome, resp;
	Scanner leia = new Scanner(System.in);
	ArrayList<String> listaAnotacoes = new ArrayList();
	
	
	void adicionarAnotacao() {
		System.out.println("Voc� entrou no m�todo Adicionar Anota��o.");
		do {
			System.out.print("Digite o nome: ");
			listaAnotacoes.add(new String(leia.nextLine()));
			
			System.out.println("Deseja digitar outro: ");
			resp = leia.nextLine();
		}while (resp.equalsIgnoreCase("S"));
		
		
	}
	void visualizarAnotacoes() {
		System.out.println("Voc� entrou no m�todo Visualizar Caderno de Anota��es.");
		for(String e:listaAnotacoes) {
			System.out.println(e);
		}
		if (listaAnotacoes.isEmpty()) {
			System.out.println("Lista Vazia");
		}
	}
	
	void apagarAnotacoes() {
		System.out.println("Voc� entrou no m�todo Apagar Anota��es.");
		listaAnotacoes.clear();
	}
}
