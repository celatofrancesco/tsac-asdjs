package Videoteca;

public class SupportoFisico {

	private String nome;
	private double costoIniziale;
	private int giorniNoleggio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCostoIniziale() {

		return costoIniziale;
	}

	public void setCostoIniziale(double costoIniziale) {

		this.costoIniziale = costoIniziale;
	}

	public int getGiorniNoleggio() {

		return giorniNoleggio;
	}

	public void setGiorniNoleggio(int giorniNoleggio) {

		this.giorniNoleggio = giorniNoleggio;
	}

	public double costoNoleggio() {
		return 0;
	}
}
