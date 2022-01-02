import java.util.Scanner;

public class odev1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, select, sonuc;
        System.out.print("Birinci sayi giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("seçiminizi yapınız : \n 1-toplama: \n 2-cıkarma: \n 3-çarpma: \n 4- bölme: \n ");
        select = input.nextInt();
        System.out.print("ikinci sayi giriniz : ");
        sayi2 = input.nextInt();

        switch (select){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("sonuç: "+ sonuc);
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("sonuç: "+ sonuc);
                    break;
                }else{
                    System.out.println("Sayi 0 Değerine Bölünemez!");
                    break;
                }

            default:
                System.out.println("Lütfen geçerli bir seçim yapınız. tekrar deneyiniz!");
        }
    }
}
