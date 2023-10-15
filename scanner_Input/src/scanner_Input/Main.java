package scanner_Input;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Lütfen yaşınızı girin:");
		int yas = scanner.nextInt();
		System.out.println("Yaşınız: " + yas);  
		
		System.out.println("Lütfen yazı girin:");
		String yazi = scanner.nextLine();
		System.out.println(yazi);
		*/
		
		int yas = scanner.nextInt();
		scanner.nextLine(); //Dummy
		
		String isim = scanner.nextLine();
		
		System.out.println("Yaş: " + yas);
		System.out.println("İsim " + isim);
		
		
	}
}
