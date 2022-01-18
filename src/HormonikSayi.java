import java.util.Scanner;

public class HormonikSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int hormonNumber = input.nextInt();
        double index = 1, result = 0;

        while (index <= hormonNumber) {
            result += (1/index);
            index++;
        }
        System.out.println("hormonik sayi değeri: "+ result);
    }
}
