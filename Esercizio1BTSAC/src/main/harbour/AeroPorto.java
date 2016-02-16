package main.harbour;

public class AeroPorto {

	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;

	public void addMetriQuadriDistrutti(double mq) {

		dimensioneSqMetersNonDistrutta -= mq;

		if (dimensioneSqMetersNonDistrutta < 0) {

			dimensioneSqMetersNonDistrutta = 0;
		}
	}

	public double getDimensioneSqMeters() {

		return dimensioneSqMeters;
	}

	public void setDimensioneSqMeters(double dimensioneSqMeters) {

		this.dimensioneSqMeters = dimensioneSqMeters;
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}

	public double getDimensioneSqMetersNonDistrutta() {

		return dimensioneSqMetersNonDistrutta;
	}

	public void setDimensioneSqMetersNonDistrutta(double dimensioneSqMetersNonDistrutta) {

		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}

}
