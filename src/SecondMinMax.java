import java.util.Scanner;

public class SecondMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {24, 11, 8, 25, 123, 43, 100, 2,322,56,5, 3, 4};
        System.out.print("Girilen Sayi : ");
        int number = scan.nextInt();
        int max, min;
        max = list[0];
        min = list[list.length / 2];
        for (int item: list){
            if (item > number && item < max){
                max = item;
            }
            if (item < number){
                min = item;
            }

        }
        for (int minValue: list){
            if (minValue < number && minValue > min){
                min = minValue;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
