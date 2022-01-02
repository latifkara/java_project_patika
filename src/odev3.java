import java.util.Scanner;

public class odev3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int turkce, matematik, fizik, kimya, muzik;
        double ortalama = 0;
        System.out.print("Türkçe dersi notunuzu giriniz : ");
        turkce = in.nextInt();

        System.out.print("matematik dersi notunuzu giriniz : ");
        matematik = in.nextInt();

        System.out.print("fizik dersi notunuzu giriniz : ");
        fizik = in.nextInt();

        System.out.print("kimya dersi notunuzu giriniz : ");
        kimya = in.nextInt();

        System.out.print("muzik dersi notunuzu giriniz : ");
        muzik = in.nextInt();

        if (turkce >= 0 && turkce <= 100){
            ortalama += turkce;
        }
        if (matematik >= 0 && matematik <= 100){
            ortalama += matematik;
        }
        if (fizik >= 0 && fizik <= 100){
            ortalama += turkce;
        }
        if (kimya >= 0 && kimya <= 100){
            ortalama += kimya;
        }
        if (muzik >= 0 && muzik <= 100){
            ortalama += muzik;
        }
        ortalama = ortalama / 5;

        if (ortalama <= 55){
            System.out.println("Sınfta kaldınız. seneye tekrar görüşmek üzere");
        }else{
            System.out.println("Tebrikler. sınıfı geçtiniz.");
        }
        System.out.println("Ortlamanız: "+ ortalama);

    }
}
