package modelo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Estado_cielo {
	@Text(required=false)
	private String ico;
	@Attribute
	private String descripcion;
	public Estado_cielo() {
	}
	public Estado_cielo(String ico, String descripcion) {
		super();
		this.ico = ico;
		this.descripcion = descripcion;
	}
	
	public void setIco(String ico) {
		this.ico = ico;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIco() {
		return ico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	@Override
	public String toString() {
		return "Cielo [ico=" + ico + ", descripcion=" + descripcion + "]";
	}
}
