import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();
        int result = 0;
        int n = 0, j = 1;
        System.out.print(n + " " + j);
        for (int i = 1; i < number; i++) {
            result = n + j;
            System.out.print(" " + result);
            n = j;
            j = result;

        }
    }
}
