import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int right = 0;
        int chance = 5;
        int selected;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrongList = new int[chance];
        System.out.println(randomNumber);
        while (right < chance){
            System.out.print("Lütfen tahnimizi giriniz : ");
            selected = scan.nextInt();
            if (selected < 0 || selected > 100){
                System.out.println("Lütfe 0-100 arasında bir sayı giriniz.");
                if (isWrong){
                    right++;
                    System.out.println("çok fazla hatalı giriş yaptınız. kalan hakkınız : " + (chance - right));
                }else {
                    isWrong = true;
                    System.out.println("bir daha hatalı girişinizde hakkınızdan düşürülecektir.");
                }
                continue;
            }
            if (selected == randomNumber){
                System.out.println("Tebrikler doğru tahmın yaptınız.");
                break;
            }else{
                wrongList[right++] = selected;
                if (selected > randomNumber){
                    System.out.println(selected + " Sayısı tahmini sayıdan büyüktür!");
                }else {
                    System.out.println(selected + " Sayısı tahmini sayıdan küçüktür!");
                }
                System.out.println("Kalan hakkı : "+ (chance - right));
            }
        }

        if (!isWin){
            System.out.println("Kaybettiniz!");
            if (!isWrong){
                System.out.print("Tahminleriniz : " + Arrays.toString(wrongList));
            }
        }

    }
}
