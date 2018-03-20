package Menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import MenjacnicaInterfejs.MenjacnicaInterfejs;
import Valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(GregorianCalendar datum, double kupovni, double prodajni, double srednji, String naziv,
			String skraceniNaziv) {
		Valuta novaValuta = new Valuta();
		novaValuta.setKupovni(kupovni);
		novaValuta.setProdajni(prodajni);
		novaValuta.setSrednji(srednji);
		novaValuta.setSkraceniNaziv(skraceniNaziv);
		novaValuta.setNaziv(naziv);
		novaValuta.setDatum(datum);
		valute.addLast(novaValuta);
	}

	@Override
	public void obrisiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public double[] vratiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
