package Videoteca;

public class Cassetta extends SupportoFisico {

	public Cassetta() {

		setCostoIniziale(1);
	}

	public double costoNoleggio() {
		double cI = getCostoIniziale();
		int gN = getGiorniNoleggio();

		if (gN == 1)

			return cI;
		else if (gN > 1)

			return cI + ((gN - 1) * 2);
		else
			return 0;
	}

}