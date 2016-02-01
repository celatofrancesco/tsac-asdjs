package Videoteca;

public class Film {

	protected String titolo;
	protected String regista;
	protected int annoProduzione;
	protected String[] attori = new String[10];
	protected SupportoFisico supportoFisico;

	public String getTitolo() {

		return titolo;
	}

	public void setTitolo(String titolo) {

		this.titolo = titolo;
	}

	public String getRegista() {

		return regista;
	}

	public void setRegista(String regista) {

		this.regista = regista;
	}

	public int getAnnoProduzione() {

		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {

		this.annoProduzione = annoProduzione;
	}

	public String[] getAttori() {

		return attori;
	}

	public void set_attori(String[] attori) {

		this.attori = attori;
	}

	public SupportoFisico getSupporto() {

		return supportoFisico;
	}

	public void setSupporto(SupportoFisico supportoFisico) {

		this.supportoFisico = supportoFisico;
	}

}
