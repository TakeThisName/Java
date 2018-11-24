package classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static Scanner beolvas = new Scanner(System.in);
	

	public static List<Versenyzo> versenyzok(String file) {
		List<Versenyzo> versenyzok = new ArrayList<>();
		try {
			List<String> beolvas = Files.readAllLines(Paths.get(file));
			for (String sor : beolvas.subList(1, beolvas.size())) {
				String[] split = sor.split(";");

				Versenyzo o = new Versenyzo(split[0], split[1], Float.parseFloat(split[2]),  
						Float.parseFloat(split[3]), Float.parseFloat(split[4]));
				
				

				versenyzok.add(o);
			}
		} catch (IOException e) {
			System.err.println("Hiba a beolvasásnál!");
		}
		return versenyzok;
	}
	
	static float Osszpontszam(String nev, List<Versenyzo> r, List<Versenyzo> d) {
		
		float osszpont = 0;
		
		for (Versenyzo v : r)
			if (v.getNev().equals(nev))
				osszpont += v.getTechpont() + v.getKomppont() - v.getHibapont();
		for (Versenyzo v : d)
			if (v.getNev().equals(nev))
				osszpont += v.getTechpont() + v.getKomppont() - v.getHibapont();
		
		return osszpont;
	}
	
	public static <K, V extends Comparable<? super V>> TreeMap<K, V> rendez(TreeMap<K, V> a) {
		TreeMap<K, V> sortByValue = new TreeMap<>(new Comparator<K>() {
			@Override
			public int compare(K o1, K o2) {
				int compare = a.get(o2).compareTo(a.get(o1));
				if (compare == 0) {
					return 1;
				} else {
					return compare;
				}

			}
		});
		sortByValue.putAll(a);
		return sortByValue;
	}
	
	public static void main(String[] args) {
		/*
		List<Versenyzo> v = versenyzok("rovidprogram.csv");
		for (Versenyzo versenyzo : v) {
			System.out.println(v);
		}
		*/
		
		// versenyzok("rovidprogram.csv").forEach(System.out::println);
		
		List<Versenyzo> rovid = versenyzok("rovidprogram.csv");
		List<Versenyzo> donto = versenyzok("donto.csv");
		rovid.forEach(System.out::println);
		donto.forEach(System.out::println);
		
		System.out.println("Ennyi versenyző indult: "+rovid.size());
		
		for (Versenyzo i : donto) {
			if (i.getOrszagkod().equals("HUN"))
				System.out.println("Van magyar továbbjutó");
		}
		// keresett versenyző neve
		String nev = beolvas.nextLine();
		// van-e versenyző
		int c = 0;
		for (Versenyzo v : rovid) {
			
			if (!v.getNev().equals(beolvas))
				c += 1;
		}
		if (c > 0)
			System.out.println("Ilyen versenyző nincs!");
		
		// összpontszáma egy adott versenyzőnek
		System.out.println(Osszpontszam(nev, rovid, donto));
		
		// egynél több döntős versenyzők országok szerint
		Map<String, Integer> map = new HashMap<>();
		for (Versenyzo v : donto) {
			map.merge(v.getOrszagkod(), 1, Integer::sum);
		}
		         // Key, Value
		map.forEach((k, v) -> {
			if (v > 1)
				System.out.println(k + ": "+ v);
		});
		System.out.println("\n" + "\n");
		// végeredmények
		TreeMap<String, Float> vegeredmeny = new TreeMap<>();
		for (Versenyzo v : donto) {
			vegeredmeny.put(v.getNev() + "; " + v.getOrszagkod(), Osszpontszam(v.getNev(), rovid, donto));
		}
		vegeredmeny.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
		
		// sorrend
		vegeredmeny = rendez(vegeredmeny);
		
		
		
		int c2 = 0;
		String fajlba = "";
		for (Map.Entry<String, Float> e : vegeredmeny.entrySet()) {
			fajlba += c2++ + ", "+ e.getKey() + ", " + new DecimalFormat("0.00").format(e.getValue()) + "\n";
		}
		try {
			Files.write(Paths.get("vegeredmeny.csv"), fajlba.getBytes());
		}
		catch (IOException ex) {
			System.err.println(ex);
		}
	}

}
