public class Main {
	public static void main(String[] args) {
		// int-byte-short-long
		short i = 100;
		byte j = 2;
		int k = 4;

		long d = i + j + k;
		System.out.println(d);
		
		// float-double
		double sayi1 = 70.25;
		double sayi2 = 60d;
		double sayi3 = 80.2;
		
		float sayi4 = 70.25f;
		float  sayi5 = 60f;
		float  sayi6 = 80.2f;
		System.out.println("Ortalama1: " + (sayi1 + sayi2 + sayi3) / 3);
		System.out.println("Ortalama2: " + (sayi4 + sayi5 + sayi6) / 3);
		
		// char-boolean
		char x= 'A';
		char y='\u0152';
		boolean a=true;
		boolean b=false;
		System.out.println(x);
		System.out.println(b);	
		System.out.println(y);
		System.out.println(a);
		
		//string
		
		String q = "Java "
				+"Proglamlama "
				+"Dili";
		System.out.println(q);
		
		String w = "Java\nProglamlama\nDili"; // \t tab bosluk bırakır
		System.out.println(w);
			
		
	}
}