
public class ötödik {

	public static void main(String[] args) {
		// melyik a nagyobb
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if (args.length == 2) {
			if (a > b)
				System.out.println("az \'a\' nagyobb");
			else
				System.out.println("az \'b\' nagyobb");
		}
		else
			System.out.println("nem két paramétert adott meg");
	}

}
