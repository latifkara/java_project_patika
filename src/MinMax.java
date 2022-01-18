import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        int number ,num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();
        int max = 0, min= 0;
        boolean control= false;
        for (int i = 1 ; i <= number ; i++) {
            System.out.print(i+".Sayıyı giriniz: ");
            num1 = input.nextInt();

            if (!control){
                max = num1;
                min = num1;
                control = true;
            }if (num1 < min && control)
            {
                min = num1;
            }if (num1 > max && control){
                max = num1;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);

    }
}
