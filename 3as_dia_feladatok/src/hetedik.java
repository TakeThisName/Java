
public class hetedik {

	public static void main(String[] args) {
		// másodfokú, ellenörzéssel

		
		
		if (args.length == 3) {
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			
			double diszk = Math.pow(b, 2) - (4 * a * c);

			if (diszk == 0)
				System.out.println("Az egyenlet nem másodfokú");
			else if (diszk < 0)
				System.out.println("Nincs megoldás");
			else {
				double x1 = (-b - Math.sqrt(diszk)) / (2 * a);
				double x2 = (-b + Math.sqrt(diszk)) / (2 * a);

				System.out.println("Az x1 = " + x1 + "\nAz x2 = " + x2 + "\nA diszkrimináns = " + diszk);

			}
			
		}
		else 
			System.out.println("Három paramétert adjon meg");
		
	}

}
