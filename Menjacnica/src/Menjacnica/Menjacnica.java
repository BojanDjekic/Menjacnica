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
		Valuta nova = new Valuta();
		nova.setDatum(datum);
		nova.setKupovni(kupovni);
		nova.setProdajni(prodajni);
		nova.setSrednji(srednji);
		nova.setNaziv(naziv);
		nova.setSkraceniNaziv(skraceniNaziv);
		valute.add(nova);
	}

	@Override
	public void obrisiKurs(GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(datum)) {
				valute.remove(i);
				break;
			}
		}
	}

	@Override
	public double[] vratiKurs(GregorianCalendar datum) {
		double[] niz = new double[3];
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().equals(datum)) {
				niz[0] = valute.get(i).getKupovni();
				niz[1] = valute.get(i).getProdajni();
				niz[2] = valute.get(i).getSrednji();
				return niz;
			}
		}
		return null;
	}

}
