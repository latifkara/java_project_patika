import java.util.Scanner;

public class odev9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yil;
        System.out.print("Yili giriniz: ");
        yil = in.nextInt();
        if(yil % 4 == 0){
            if(yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır !");
                }else {
                    System.out.println(yil + " bir artık yıldır değildir !");
                }
            }else {
                System.out.println(yil + " bir artık yıldır !");
            }
        }else {
            System.out.println(yil + " bir artık yıldır değildir !");
        }
    }
}
