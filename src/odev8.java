import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumTarihi= in.nextInt();
        String borc = "";
        if(dogumTarihi % 12 == 0)
        {
            borc = "Maymun";
        }else if(dogumTarihi % 12 == 1)
        {
            borc = "Horoz";
        }else if(dogumTarihi % 12 == 2)
        {
            borc = "Köpek";
        }else if(dogumTarihi % 12 == 3)
        {
            borc = "Domuz";
        }else if(dogumTarihi % 12 == 4)
        {
            borc = "Fare";
        }else if(dogumTarihi % 12 == 5)
        {
            borc = "Öküz";
        }else if(dogumTarihi % 12 == 6)
        {
            borc = "kaplan";
        }else if(dogumTarihi % 12 == 7)
        {
            borc = "Tavşan";
        }else if(dogumTarihi % 12 == 8)
        {
            borc = "Ejderha";
        }else if(dogumTarihi % 12 == 9)
        {
            borc = "Yılan";
        }else if(dogumTarihi % 12 == 10)
        {
            borc = "At";
        }else if(dogumTarihi % 12 == 11)
        {
            borc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+ borc);
    }
}
