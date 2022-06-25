package abstracao;

import java.util.Scanner;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Veiculo car = new Veiculo(1999,"Celta","Branco",80000);
		Scanner ler = new Scanner(System.in);
		
		car.exibirInfo();
		car.verificarManutencao();
		System.out.print("Para qual cor quer mudar: ");
		car.cor = ler.nextLine();
		car.mudarCor();
		car.exibirCor();
		

	}
}
