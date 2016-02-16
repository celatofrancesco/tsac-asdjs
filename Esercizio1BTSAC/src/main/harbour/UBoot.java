package main.harbour;

public class UBoot extends Invasore {

	protected int armaK;
	protected int armaH;

	@Override
	public int potenzaFuoco() {
		return (armaK * 20) + (armaH * 30);

	}

	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}

	public int getArmaK() {
		return armaK;
	}

	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}

	public int getArmaH() {
		return armaH;
	}

}