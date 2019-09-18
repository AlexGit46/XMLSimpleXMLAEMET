package modelo;

import org.simpleframework.xml.Element;

public class Temperatura {
	@Element
	private double maxima;
	@Element
	private double minima;
	public Temperatura() {
	}	
	public Temperatura(double maxima, double minima) {
		super();
		this.maxima = maxima;
		this.minima = minima;
	}
	
	public void setMaxima(double maxima) {
		this.maxima = maxima;
	}
	public void setMinima(double minima) {
		this.minima = minima;
	}
	public double getMaxima() {
		return maxima;
	}
	public double getMinima() {
		return minima;
	}
	@Override
	public String toString() {
		return "Temperatura [maxima=" + maxima + ", minima=" + minima + "]";
	}
}
