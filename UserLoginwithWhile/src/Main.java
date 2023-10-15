import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int girisHakki=3;
		
		String sysKullaniciAdi ="Semih Daskara";
		String sysParola = "12345";
		System.out.println("*******************************");
		System.out.println("Kullanıcı Girişine Hoşgeldiniz!");
		System.out.println("*******************************");
		
		while(true)
		{
			System.out.print("Kullanıcı Adı: ");
			String kullanici = scanner.nextLine();
			System.out.print("Parola: ");
			String parola = scanner.nextLine();
			if(kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola))
			{
				System.out.println("Sisteme giriş yapılıyor. "+ sysKullaniciAdi+ " Hoşgeldiniz!\n" );
				break;
			}
			else if (kullanici.equals(sysKullaniciAdi) && !parola.equals(sysParola))
			{
				System.out.println("Parola Yanlış!");
				girisHakki-=1;
				System.out.println("Giris Hakki: "+ girisHakki+"\n");
			}
			else if (!kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola))
			{
				System.out.println("Kullanici Adi Yanlış!");
				girisHakki-=1;
				System.out.print("Giris Hakki: "+ girisHakki+"\n");
			}
			else
			{
				System.out.println("Kullanici Adi ve Parola Yanlış!");
				girisHakki-=1;
				System.out.println("Giris Hakki: "+ girisHakki+"\n");
			}
			if(girisHakki ==0)
			{
				System.out.println("Giris Hakki: "+ girisHakki);
				System.out.println("Giriş Hakkınız Bitti.");
				break;
			}	
		}
	}

	private static String toUpperCase(String sysKullaniciAdi) {
		// TODO Auto-generated method stub
		return null;
	}
}
