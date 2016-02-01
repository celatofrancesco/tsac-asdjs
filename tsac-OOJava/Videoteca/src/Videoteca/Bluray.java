package Videoteca;

public class Bluray extends SupportoFisico {

	public Bluray() {

		setCostoIniziale(1);
	}

	public double costoNoleggio() {

		double cI = getCostoIniziale();
		int gN = getGiorniNoleggio();

		if (gN == 1)
			return cI;

		else if (gN > 1) {
			double costo = cI;

			for (int i = 1; i < gN; i++) {

				costo += (costo * 10) / 100;
			}

			return costo;
		} else
			return 0;
	}

}