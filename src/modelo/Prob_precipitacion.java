package modelo;

import org.simpleframework.xml.Text;

public class Prob_precipitacion {
	@Text(required=false)
	private int lluvia;

	@Override
	public String toString() {
		return "Prob_precipitacion [lluvia=" + lluvia + "]";
	}

	public int getLluvia() {
		return lluvia;
	}

	public void setLluvia(int lluvia) {
		this.lluvia = lluvia;
	}

	public Prob_precipitacion(int lluvia) {
		super();
		this.lluvia = lluvia;
	}

	public Prob_precipitacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
