import java.util.Scanner;

public class ReverseStar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int number = input.nextInt();
        for (int i=number; i >= 1 ; i--){
            for (int k = -1; k < (number - i) ; k++){
                System.out.print(" ");
            }
            for (int n=1; n <= (2 * i) - 1 ; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
