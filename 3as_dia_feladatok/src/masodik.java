
public class masodik {

	public static void main(String[] args) {
		// 2, 3, 5-el osztható
		
		int a = Integer.parseInt(args[0]);
		
		if (a % 2 == 0)
			System.out.println("A szám osztható kettővel");
		if (a % 2 != 0)
			System.out.println("A szám NEM osztható kettővel");
		if (a % 3 == 0)
			System.out.println("A szám osztható hárommal");
		if (a % 3 != 0)
			System.out.println("A szám NEM osztható hárommal");
		if (a % 5 == 0)
			System.out.println("A szám osztható öttel");
		if (a % 5 != 0)
			System.out.println("A szám NEM osztható öttel");

	}

}
