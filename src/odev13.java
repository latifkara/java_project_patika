import java.util.Scanner;

public class odev13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //C(n,r) = n! / (r! * (n-r)!)
        int num1, num2, total, n= 1 , r  = 1, nr = 1;
        System.out.print("n elemanı giriniz: ");
        num1 = scan.nextInt();
        System.out.print("\nr elemanı giriniz: ");
        num2 = scan.nextInt();
        for (int i = 1 ; i < num1; i++)
        {
            n *= i;
        }
        for (int j = 1 ; j < num2 ; j++)
        {
            r *= j;
        }
        for(int d = 1 ; d < num2 - num1 ; d ++){
            nr *= d;
        }
        if((r * nr) != 0) {
            total = n / (r * (nr));
            System.out.print("C(n, r) değeri: " + total);
        }

    }
}
