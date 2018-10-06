
public class negyedik {

	public static void main(String[] args) {
		// számjegyek száma
		
		int a = Integer.parseInt(args[0]);
		
		if (a >= 1 && a <= 1000000) {
			if (a < 10)
				System.out.println("Egyjegyű");
			if (a >= 10 && a <= 99)
				System.out.println("Kétjegyű");
			if (a >= 100 && a <= 999)
				System.out.println("Háromjegyű");
			if (a >= 1000 && a <= 9999)
				System.out.println("Négyjegyű");
			if (a >= 10000 && a <= 99999)
				System.out.println("Ötjegyű");
			if (a >= 100000 && a <= 999999)
				System.out.println("Hatjegyű");
			if (a >= 1000000 && a <= 9999999)
				System.out.println("Hétjegyű");
		}
		else
			System.out.println("A paraméterben megadott szám helytelen");

	}

}
