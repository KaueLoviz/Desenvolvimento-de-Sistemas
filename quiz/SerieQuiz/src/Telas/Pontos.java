package Telas;

public class Pontos {
	static int acerto = 0;
	static int erro = 0;
	
	public static void acerto() {
		acerto++;
	}
	public static void erro() {
		erro++;
	}
	
	public static int getAcertos() {
		return acerto;
	}
	
	public static int getErro() {
		return erro;
	}

}
