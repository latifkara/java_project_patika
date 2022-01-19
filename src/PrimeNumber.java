import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 2 ; i <= 100 ; i++){
            boolean control =  false;
            for (int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    control = true;
                    break;
                }
            }
            if(!control){
                System.out.print(i + " ");
            }
        }


    }
}
