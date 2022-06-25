package br.unoesc.atividades2506;

import java.util.Scanner;

public class CadernoAnotacaoPrincipal {

	public static void main(String[] args) {
		CadernoAnotacoes ca = new CadernoAnotacoes();
		Formatacao line = new Formatacao();
		Scanner leia = new Scanner(System.in);
		int resp = 0;
		
		while (resp !=4) {		
	    	 System.out.println("\tCADERNO DE ANOTAÇÕES");
		     System.out.println("1 – Adicionar Anotação");
		     System.out.println("2 – Visualizar Caderno de Anotações");
		     System.out.println("3 - Apagar Anotações");
		     System.out.println("4 - Sair");
		     System.out.println("Opcao: ");
	    	 int opcao = leia.nextInt();
	    	 switch(opcao){
	         case 1:
	        	 ca.adicionarAnotacao();
	             break;
	         case 2:
	        	 ca.visualizarAnotacoes();
	             break;
	         case 3:
	        	 ca.apagarAnotacoes();
	             break;
	         
	         default:
	             System.out.println("Opção inválida.");
	         }
	    		
	     }
	     
	    }
}
