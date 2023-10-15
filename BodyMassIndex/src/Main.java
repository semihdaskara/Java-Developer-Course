import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilonuzu Girin:");
		int kilo = scanner.nextInt();
		System.out.print("Boyunuzu Girin:(Örnek: 1,72)");
		double boy = scanner.nextDouble();
		
		double bmi = kilo / (boy * boy);
		
		System.out.print("Beden Kitle Indexi: " + bmi);
	}

}
