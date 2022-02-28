import java.util.Scanner;

public class recursivePower {

    static int power(int number, int powerNumber) {
        if (powerNumber == 0) {
            return 1;
        }
        return number * power(number, powerNumber - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int firstNumber = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int secondNumber = scan.nextInt();
        System.out.println("Sonuc : "+ power(firstNumber, secondNumber));
    }
}
