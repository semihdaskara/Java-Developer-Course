import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Aracınız km'de kaç kuruş yakıyor? (Örnek: 0,32)");
		double kurus = scanner.nextDouble();
		System.out.print("Aracınızla kaç km gittiniz? : ");
		int km = scanner.nextInt();

		System.out.print("Toplam ödemeniz gereken tutar: " + (kurus * km) + "TL'dir...");

	}

}
