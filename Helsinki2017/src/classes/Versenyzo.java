package classes;

import java.util.List;

public class Versenyzo {

	private String nev;
	private String orszagkod;
	private float techpont;
	private float komppont;
	private float hibapont;
	
	public Versenyzo(String nev, String orszagkod, float techpont, float komppont, float hibapont) {
		super();
		this.nev = nev;
		this.orszagkod = orszagkod;
		this.techpont = techpont;
		this.komppont = komppont;
		this.hibapont = hibapont;
	}
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getOrszagkod() {
		return orszagkod;
	}
	public void setOrszagkod(String orszagkod) {
		this.orszagkod = orszagkod;
	}
	public float getTechpont() {
		return techpont;
	}
	public void setTechpont(float techpont) {
		this.techpont = techpont;
	}
	public float getKomppont() {
		return komppont;
	}
	public void setKomppont(float komppont) {
		this.komppont = komppont;
	}
	public float getHibapont() {
		return hibapont;
	}
	public void setHibapont(float hibapont) {
		this.hibapont = hibapont;
	}
	
	
	@Override
	public String toString() {
		
		return nev +", "+ orszagkod+", "+techpont+", "+komppont+", "+hibapont;
	}
	
	
	
}
