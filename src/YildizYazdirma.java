import java.util.Scanner;

public class YildizYazdirma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("yildiz basamağı giriniz: ");
        int star = input.nextInt();
        int index = 1;
        int indexSpace = 1, indexStar = 1;
        int indexReverse = 1;
        while (index <= star){
            indexSpace = 1;
            indexStar = 1;
            while (indexSpace <= (star - index) )
            {
                System.out.print(" ");
                indexSpace++;
            }
            while (indexStar <= (2 * index) - 1){
                System.out.print("*");
                indexStar++;
            }
            System.out.println();
            index ++;

        }
        index = star;
        while (index >= 1){
            indexSpace = star;
            indexStar = (index - 1 ) * 2;
            while (indexSpace > star -indexReverse)
            {
                System.out.print(" ");
                indexSpace--;
            }
            indexReverse++;
            while (indexStar  > 1){
                System.out.print("*");
                indexStar--;
            }
            System.out.println();
            index --;


        }

    }
}
