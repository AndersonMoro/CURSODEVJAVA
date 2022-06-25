package abstracao;

import java.util.Scanner;
public class VeiculoPrincipal {

	public static void main(String[] args) {
		Veiculo car = new Veiculo(1999,"Celta","Branco",80000);
		Scanner ler = new Scanner(System.in);
		Formatacao line = new Formatacao();
		
		
		car.infoCar();
		line.linhas();
		line.linhas();
		car.verificarManutencao();
		line.linhas();
		line.linhas();
		car.mudarCor();
		car.exibirCor();

	}

}
