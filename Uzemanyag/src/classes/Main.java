package classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	

	public static List<Uzemanyag> uzemanyagok() {
		List<Uzemanyag> uzemanyagok = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get("uzemanyag.txt"));
			for (String sor : beolvas) {
				String[] split = sor.split(";");

				Uzemanyag o = new Uzemanyag(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]));

				uzemanyagok.add(o);
			}
		} catch (IOException e) {
			System.err.println("Hiba a beolvasásnál!");
		}
		return uzemanyagok;
	}
	
	public static int ValtozasokSzama() {
		List<Uzemanyag> uzemag = uzemanyagok();
		int c = 0;
		
		for (Uzemanyag i : uzemag) {
			c++;
		}
		
		return c;
	}
	
	public static int LegkisebbKulombseg() {
		List<Uzemanyag> uzemag = uzemanyagok();
		int minK = Integer.MAX_VALUE;
		
		for (Uzemanyag i : uzemag) {
			if (Math.abs(i.getBenzinar() - i.getDizelar())< minK)
				minK = Math.abs(i.getBenzinar() - i.getDizelar());
		}
		
		return minK;
	}
	
	public static int LegkisebbKulombsegEloford() {
		List<Uzemanyag> uzemag = uzemanyagok();
		int db = 0;
		
		for (Uzemanyag i : uzemag) {
			if (Math.abs(i.getBenzinar() - i.getDizelar()) == LegkisebbKulombseg())
				db++;
		}
		
		return db;
	}
	
	public static String VolteValtozasSzokonapon() { // feb 24 FFS
		boolean valtozas = false;
		String valt = "";
		List<Uzemanyag> uzemag = uzemanyagok();
		
		for (Uzemanyag i : uzemag) {
			String[] datum = i.getDate().split("\\.");
			if (Integer.parseInt(datum[0]) % 4 == 0 && datum[1].equals("02") && datum[2].equals("24"));
			valtozas = true;
		}
		
		if (valtozas == true)
			valt += "volt változás";
		else
			valt += "nem volt változás";
		
		return valt;
	}
	
	public static void main(String[] args) {
		System.out.println("3-as feladat -> Változások száma: " + ValtozasokSzama());
		System.out.println("4-as feladat -> Legkisebb külömbség: " + LegkisebbKulombseg());
		System.out.println("5-as feladat -> Legkisebb külömbség előfordulásainak száma: " + LegkisebbKulombsegEloford());
		System.out.println("6-as feladat -> Szökőévben " + VolteValtozasSzokonapon());
		
	}

}
