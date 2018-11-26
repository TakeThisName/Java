package classes;

public class Uzemanyag {
	private String date;
	private int benzinar, dizelar;
	
	public Uzemanyag(String date, int benzinar, int dizelar) {
		super();
		this.date = date;
		this.benzinar = benzinar;
		this.dizelar = dizelar;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getBenzinar() {
		return benzinar;
	}

	public void setBenzinar(int benzinar) {
		this.benzinar = benzinar;
	}

	public int getDizelar() {
		return dizelar;
	}

	public void setDizelar(int dizelar) {
		this.dizelar = dizelar;
	}

	@Override
	public String toString() {
		return "Uzemanyag [date=" + date + ", benzinar=" + benzinar + ", dizelar=" + dizelar + "]";
	}
	
	
}
