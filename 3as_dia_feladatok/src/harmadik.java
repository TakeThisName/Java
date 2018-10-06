
public class harmadik {

	public static void main(String[] args) {
		// szerkeszthető-e háromszög a megadott oldalakból
		
		double a = (double)Integer.parseInt(args[0]);
		double b = (double)Integer.parseInt(args[1]);
		double c = (double)Integer.parseInt(args[2]);
		
		if (a + b > c && b + c > a && a + c > b)
			System.out.println("A háromszög megszerkeszthető");
		else
			System.out.println("A megadott adatokból nem szerkeszthető 3szög");

	}

}
