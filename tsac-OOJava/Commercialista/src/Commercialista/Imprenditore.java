package Commercialista;

public class Imprenditore {

	protected String nome;
	protected String cognome;
	protected String cf;
	protected String pIva;
	protected String ragioneSociale;
	protected int nFatture;

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

	public void setPIva(String pIva) {

		this.pIva = pIva;
	}

	public String getPIva() {

		return this.pIva;
	}

	public void setNFatture(int nFatture) {

		this.nFatture = nFatture;
	}

	public int getNFatture() {

		return this.nFatture;
	}

	public void setRagioneSociale(String ragioneSociale) {

		this.ragioneSociale = ragioneSociale;
	}

	public String getRagioneSociale() {

		return this.ragioneSociale;
	}
	
	public int parcellaImprenditori(){
		
		if(nFatture <= 100){
			
			return 500;
			
		} else {
			
			int add = nFatture - 100;
			return 500 + add;
		}
		
	}

}
