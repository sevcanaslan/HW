import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullanıcıdan bir kelime alın
				// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın

				// eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin

				//eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın

				//replace metohud
				//charAt()
				//kelime.startsWith("a")
				//length()

						Scanner scanner = new Scanner(System.in);
						System.out.println("Bir kelime giriniz: ");
						String kelime = scanner.next();
						int a= kelime.charAt(0);
						if(kelime.startsWith("a")) {
							System.out.println("son index: " + kelime.charAt(kelime.length()-1));
						}
						else if(kelime.startsWith("b")) {
							System.out.println("yeni kelime: " + kelime.replaceFirst("b", "@"));
						}
						
						else{
							System.out.println("1. karekter: " + kelime.charAt(0));
						
					}
				

	}

}
