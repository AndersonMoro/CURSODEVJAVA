package br.unoesc.atividades2506;

import java.util.Scanner;

public class AlunoPrincipal {

	public static void main(String[] args) {
		
		Aluno cdf = new Aluno("Maria", 16);
		
		cdf.infoAluno();
		cdf.notas();
		cdf.verificarAprovacao();	
		
	}
	
}

