package MenjacnicaInterfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKurs(GregorianCalendar datum,double kupovni, double prodajni, double srednji, String naziv, String skraceniNaziv);
	public void obrisiKurs(GregorianCalendar datum);
	public double[] vratiKurs(GregorianCalendar datum);
}
