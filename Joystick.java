package abstracao;

public class Joystick {
	String modelo;
	String cor;
	int porcentagemBateria;
	void visualizarJoystick() {
		System.out.println("Modelo "+modelo);
		System.out.println("Cor "+cor);
		
	}
	void conectar() {
		System.out.println("Joystick "+modelo+" está conectado ao videogame...");
	}
	void recarregar( ) {
		System.out.println("O Joystick tem menos que 10% de bateria. Precisa ser carregado!");
	
	}
}