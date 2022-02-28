import java.util.Scanner;

public class recursivePrimeNumber {

    static int prime(int number) {
        if (number == 1) {
            return 1;
        }

        return number / prime(number - 1);
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz : ");
             num = scan.nextInt();
            if (num == 0) {
                System.out.println(num + " sayısına bölünmez");
                continue;
            }
            if (prime(num) > 1) {
                System.out.println(num + " sayısı ASALDIR !");
            }else {
                System.out.println(num + " sayısı ASAL değildir !");
            }
        }while (num != 0);
    }
}
