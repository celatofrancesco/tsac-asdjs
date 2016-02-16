package main.harbour;

public class CarroArmato extends Invasore {

	private int stazza;
	private int missili;

	@Override
	public int potenzaFuoco() {

		return Math.round(0.3f * stazza * missili);

	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getStazza() {
		return stazza;
	}

	public void setMissili(int missili) {
		this.missili = missili;
	}

	public int getMissili() {
		return missili;
	}

}
