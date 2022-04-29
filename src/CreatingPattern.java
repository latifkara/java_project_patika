import java.util.Scanner;

public class CreatingPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scan.nextInt();
        int temp = n;
        while (true)
        {
            System.out.print(n + " ");
            if(n <= 0) {
                for (int i = n + 5; i <= temp; i += 5) {
                    System.out.print(i + " ");
                }
                break;
            }
            n -= 5;
        }
    }
}
