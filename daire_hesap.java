// kullanıcı girişi için kütüphane tanımı
import java.util.Scanner;
public class daire_hesap {

    public static void main(String[] args) {
        // verileri tutmak için veri tipi kullanımı
        int r ;

        double pi = 3.14;
        // kullanıcıdan veri alma 
        Scanner giris = new Scanner(System.in);

        System.out.println("DARİRENİN YARI ÇAPINI GİRİNİZ : ");
        r = giris.nextInt();
        // operatörler ile hesaplama
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        // ekrana bastırma                
        System.out.println("GİRİLEN DAİRENİN ALANI : " + alan);
        System.out.println("GİRİLEN DAİRENİN ÇEVRESİ : " + cevre);



    }
    
}