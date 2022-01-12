import java.util.Scanner;

public class odev12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total;
        System.out.print("sayi giriniz: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n ; i *=4){
            System.out.print(i + " ");
        }
        System.out.println("\n------------------");
        for (int j = 1; j <= n ; j *=5){
            System.out.print(j + " ");
        }
    }
}
