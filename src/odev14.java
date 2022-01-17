import java.util.Scanner;

public class odev14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k, total= 1;
        System.out.print("üstü alınacak sayi: ");
        k = in.nextInt();
        System.out.print("üs olacak sayi: ");
        n = in.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("total: "+ total);
    }
}
