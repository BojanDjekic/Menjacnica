package Valuta;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv, skraceniNaziv;
	private double prodajni, srednji, kupovni;
	private GregorianCalendar datum;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty()) throw new RuntimeException("Uneti validan naziv valute.");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty()) throw new RuntimeException("Uneti validan skraceni naziv valute.");
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni < 0) throw new RuntimeException("Uneti validan prodajni kurs (veci od nule).");
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji < 0) throw new RuntimeException("Uneti validan srednji kurs (veci od nule).");
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni < 0) throw new RuntimeException("Uneti validan kupovni kurs (veci od nule).");
		this.kupovni = kupovni;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		GregorianCalendar danas = new GregorianCalendar();
		if (datum.before(danas)) throw new RuntimeException("Uneti danasnji ili buduci datum.");
		this.datum = datum;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", prodajni=" + prodajni + ", srednji="
				+ srednji + ", kupovni=" + kupovni + ", datum=" + datum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	
}
