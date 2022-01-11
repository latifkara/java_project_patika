import java.util.Scanner;

public class odev4 {

    public static void main(String[] args) {
        int heat;
        Scanner in = new Scanner(System.in);

        System.out.println("sıcaklık değerini giriniz: ");
        heat = in.nextInt();

        if(heat > 25){
            System.out.println("yüzmeye gidebilirsin");
        }else if(heat < 25){
            if(heat > 10 && heat < 15){
                System.out.println("sinemayı gidebilirsin");
                System.out.println("pakniğe gidebilirsin");
            }else if(heat < 10){
                System.out.println("sinemayı gidebilirsin");
            }else{
                System.out.println("pakniğe gidebilirsin");
            }
        }else{
            System.out.println("kayak yapabilirsin");
        }
    }
}
