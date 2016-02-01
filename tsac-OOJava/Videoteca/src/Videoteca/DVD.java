package Videoteca;

public class DVD extends SupportoFisico {

	public DVD() {

		setCostoIniziale(1.50);
	}

	public double costoNoleggio() {

		double cI = getCostoIniziale();
		int gN = getGiorniNoleggio();

		if (gN == 1)

			return cI;
		else if (gN == 2)

			return cI * 2;
		else if (gN > 2)

			return (cI * 2) + (gN - 2) * 2;
		else
			return 0;
	}
}