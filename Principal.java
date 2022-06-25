package abstracao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Joystick js = new Joystick();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual modelo do Video Game: ");
		js.modelo = ler. nextLine();
		js.cor = (": Branco");
		System.out.print("Quanto de bateria tem? ");
		js.porcentagemBateria = ler.nextInt();
		
		js.visualizarJoystick();
		js.conectar();
		if (js.porcentagemBateria < 10) {
			js.recarregar();
		}

	}

}
