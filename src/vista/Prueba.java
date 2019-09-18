package vista;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import modelo.Aemet;
import modelo.Dia;

public class Prueba {

	public static void main(String[] args) {
		String urlTxt = "http://www.aemet.es/xml/municipios/localidad_45168.xml";
		URL url = null;
		try {
			//File is = new File("toledo.xml"); // Si es local
			url = new URL(urlTxt);
			InputStream is = url.openStream();
			Serializer serializer = new Persister();
  		    Aemet aemet = serializer.read(Aemet.class, is, false);
  		    
  		    for (Dia dia:aemet.getPrediccion()){
  		    		System.out.println(dia);
  		    }
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
