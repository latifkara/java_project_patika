import java.util.Scanner;

public class odev5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.print("birinci sayi giriniz: ");
        a = in.nextInt();
        System.out.print("ikinci sayi giriniz: ");
        b = in.nextInt();
        System.out.print("üçüncü sayi giriniz: ");
        c = in.nextInt();

        if((a < b) && (a < c)){
            if(b < c){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        }else if((b < a) && (b < c)){
            if(a < c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        }else if((c < a) && (c < b)){
            if(a < b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }

    }
}
