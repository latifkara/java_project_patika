import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class EkokEbob {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("ebob en büyük ortak böleni işlemi");
        System.out.print("n1 değeriniz giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 değeriniz giriniz: ");
        n2 = input.nextInt();
        int index = n1;
        while (index >= 1)
        {
            if (n1%index==0 && n2%index==0){
                System.out.println(index);
                break;
            }
            index--;
        }


        System.out.println("ekok en küçük ortak böleni işlemi");
        System.out.print("n3 değeriniz giriniz: ");
        n3 = input.nextInt();
        System.out.print("n4 değeriniz giriniz: ");
        n4 = input.nextInt();
        int indexEkok = 1;
        while (indexEkok <= (n3 * n4)){
            if (indexEkok%n3==0 && indexEkok%n4==0){
                System.out.println(indexEkok);
                break;
            }
            indexEkok++;
        }
    }
}
