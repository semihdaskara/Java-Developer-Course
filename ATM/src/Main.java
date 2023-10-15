import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye=1000;
		String islemler="1.İşlem:Bakiye Öğrenme\n"
				+"2.İşlem: Para Çekme\n"
				+"3.İşlem: Para Yatırma\n"
				+"Çıkış için q' ya basın.";
		System.out.println("***************");
		System.out.println(islemler);
		System.out.println("***************");
		
		while(true)
		{
			System.out.print("İşlemi Seçiniz:");
			String islem=scanner.nextLine();
			if(islem.equals("q"))
			{
				System.out.println("Programdan çıkılıyor..");
				break;
			}
			else if(islem.equals("1"))
			{
				System.out.print("Bakiyeniz: "+bakiye+"\n");
			}
			else if(islem.equals("2"))
			{
				System.out.print("Lütfen çekmek istediğiniz miktarı girin: ");
				double cikar=scanner.nextDouble();
				
				if(bakiye <= 0)
				{
					System.out.print("Yeterli bakiyeniz bulunmamaktadır. Bakiyeniz:"+bakiye+"\n");
				}
				else
				{
					bakiye-=cikar;
					System.out.print("Bakiyeniz: "+bakiye+"\n");
				}
			}
			else if(islem.equals("3"))
			{
				System.out.print("Lütfen yatırmak istediğiniz miktarı girin: ");
				double ekle=scanner.nextDouble();
				bakiye+=ekle;
				System.out.print("Bakiyeniz: "+bakiye+"\n");
			}
			else
			{
				System.out.print("Hatalı giriş yaptınız. Programdan çıkılıyor....");
				break;
			}
		}
	}

}
