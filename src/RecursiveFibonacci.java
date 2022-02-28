import java.util.Scanner;

public class RecursiveFibonacci {

    public static int fibonnaci(int data){
        if(data == 1 || data == 2){
            return 1;
        }
        return fibonnaci(data - 1) + fibonnaci(data - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fibonnacı sayısını giriniz: ");
        int fibbonaciNumber = scan.nextInt();
        System.out.println(fibonnaci(fibbonaciNumber));

    }
}
