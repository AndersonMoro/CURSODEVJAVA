package br.unoesc.atividades2506;

import java.util.Scanner;

public class CadernoAnotacaoPrincipal {

	public static void main(String[] args) {
		CadernoAnotacoes ca = new CadernoAnotacoes();
		Formatacao line = new Formatacao();
		Scanner leia = new Scanner(System.in);
		int resp = 0;
		
		while (resp !=4) {		
	    	 System.out.println("\tCADERNO DE ANOTA��ES");
		     System.out.println("1 � Adicionar Anota��o");
		     System.out.println("2 � Visualizar Caderno de Anota��es");
		     System.out.println("3 - Apagar Anota��es");
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
	             System.out.println("Op��o inv�lida.");
	         }
	    		
	     }
	     
	    }
}
