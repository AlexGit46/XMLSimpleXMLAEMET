package modelo;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="root")
public class Aemet {	
	@ElementList
    List<Dia> prediccion = new ArrayList<Dia>();

	public Aemet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aemet(List<Dia> prediccion) {
		super();
		this.prediccion = prediccion;
	}

	public List<Dia> getPrediccion() {
		return prediccion;
	}

	public void setPrediccion(List<Dia> prediccion) {
		this.prediccion = prediccion;
	}

	@Override
	public String toString() {
		return "Aemet [prediccion=" + prediccion + "]";
	}
	

}
