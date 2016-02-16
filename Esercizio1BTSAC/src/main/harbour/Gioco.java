package main.harbour;

public class Gioco {

	AeroPorto porto;

	public Gioco(AeroPorto porto) {
		this.porto = porto;
	}

	public boolean portoDistrutto() {
		if (porto.getDimensioneSqMetersNonDistrutta() > 0) {
			return false;
		} else {
			return true;
		}
	}

	public void attacco(Invasore[] invasori) {
		int sommaPotenze = 0;
		for (Invasore i : invasori) {
			sommaPotenze += i.potenzaFuoco();
		}

		porto.addMetriQuadriDistrutti(sommaPotenze * 2.5);
	}

}
