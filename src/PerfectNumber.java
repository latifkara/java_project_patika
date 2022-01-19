import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int number = input.nextInt();
        int result = 0;
        for (int i=1; i < number ; i++){
            if (number % i == 0){
                result += i;
            }
        }
        if(result == number){
            System.out.println(number+" Mükkemmel sayidir.");
        }else {
            System.out.println(number +" Mükkemmel sayi değildir.");
        }
    }
}
