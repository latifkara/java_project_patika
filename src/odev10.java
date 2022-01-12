import java.util.Scanner;

public class odev10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int toplam = 0, ort;
        System.out.print("sayi giriniz: ");
        int k = in.nextInt();

        for (int i = 0 ; i <= k ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
            }

        }
        ort = toplam / k;
        System.out.print("ortalama: "+ ort);
    }
}
