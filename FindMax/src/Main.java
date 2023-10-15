import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		int a=scanner.nextInt();
		System.out.println("İkinci sayi: ");
		int b=scanner.nextInt();
		System.out.println("Üçüncü sayi: ");
		int c=scanner.nextInt();
		
		int maks= -1;
		
		if(a>=b && a>=c)
		{
			maks=a;
		}
		else if(b>=a && b>=c)
		{
			maks=b;
		}
		else
		{
			maks=c;
		}
		
		System.out.println("Maksimum sayi: " +maks);
	}

}
