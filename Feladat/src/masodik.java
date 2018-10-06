
public class masodik {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int osszeg = a+b;
		int kulombseg = a-b;
		int szorzat = a*b;
		double hanyados = a/b;
		
		System.out.println("Összeg: "+ osszeg +"\nKülömbség: "+kulombseg+"\nSzorzat: "+szorzat+"\nHányados: "+hanyados);
	}

}
