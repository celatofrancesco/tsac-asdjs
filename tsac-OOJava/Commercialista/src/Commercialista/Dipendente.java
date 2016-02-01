package Commercialista;

public class Dipendente {

	protected String nome;
	protected String cognome;
	protected String cf;

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getNome() {

		return this.nome;
	}

	public void setCognome(String cognome) {

		this.cognome = cognome;
	}

	public String getCognome() {

		return this.cognome;
	}

	public void setCF(String cf) {

		this.cf = cf;
	}

	public String getCF() {

		return this.cf;
	}
	
	public int parcellaDipendente(){
		
		return 50;
	}
	
	
}
