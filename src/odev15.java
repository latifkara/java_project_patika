import java.util.Scanner;

public class odev15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int number = input.nextInt();
        int tempNumber = number;
        int result = 0;
        // basamk sayi bulma işlemi
        while(tempNumber != 0) {
            result +=tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("basamak sayi toplamı: "+result);
    }
}
