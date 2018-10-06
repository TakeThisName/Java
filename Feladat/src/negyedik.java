
public class negyedik {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		double diszk = Math.pow(b, 2)-(4*a*c);
		double x1 = (-b-Math.sqrt(diszk))/(2*a);
		double x2 = (-b+Math.sqrt(diszk))/(2*a);
		
		System.out.println("Az x1 = "+x1+"\nAz x2 = "+x2+"\nA diszkrimináns = "+diszk);
	}

}
