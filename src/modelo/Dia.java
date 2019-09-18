package modelo;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class Dia {
	@Attribute
	private String fecha;
	@ElementList(inline = true)
	public List<Prob_precipitacion> lluvias;
	@ElementList(inline = true)
	public List<Estado_cielo> cielos;
	@Element
	private Temperatura temperatura;

	public Dia() {
	}
	public Dia(String fecha, Temperatura temperatura, List<Estado_cielo> cielos, List<Prob_precipitacion> lluvias) {
		super();
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.cielos = cielos;
		this.lluvias = lluvias;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Temperatura getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}
	public List<Estado_cielo> getCielos() {
		return cielos;
	}
	public void setCielos(List<Estado_cielo> cielos) {
		this.cielos = cielos;
	}
	public List<Prob_precipitacion> getLluvias() {
		return lluvias;
	}
	public void setLluvias(List<Prob_precipitacion> lluvias) {
		this.lluvias = lluvias;
	}
	@Override
	public String toString() {
		return "Dia [fecha=" + fecha + ", temperatura=" + temperatura + ", cielos=" + cielos + ", lluvias=" + lluvias
				+ "]";
	}
	
}