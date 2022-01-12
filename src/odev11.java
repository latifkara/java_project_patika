import java.util.Scanner;

public class odev11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int toplam = 0;
        int n;

        do {
            System.out.print("sayi giriniz: ");
            n  = in.nextInt();
            if (n % 2 == 0 && n % 4 == 0)
            {
                toplam += n;
            }
        }while (n % 2 == 0);
        System.out.print("toplam : "+ toplam);
    }
}
