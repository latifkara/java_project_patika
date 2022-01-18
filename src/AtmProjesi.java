import java.util.Scanner;

public class AtmProjesi {

    public static void main(String[] args) {
        String userName, Password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select ;
        int balance = 1000;
        int price;
        while (right > 0)
        {
            System.out.print("kullanıcı adını giriniz: ");
            userName = input.nextLine();
            System.out.print("password giriniz: ");
            Password = input.nextLine();
            if (userName.equals("patika") && Password.equals("dev123")){
                System.out.print("Kodluyoruz bankarasına hoşgeldiniz: ");
                do {
                    System.out.print("1-para yatırma\n"+
                                      "2-para çekme\n"+
                                        "3-bakiye sorgula\n"+
                                        "4-çıkış yap\n");
                    System.out.print("yapacağınız işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("para miktarı giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("para miktarı giriniz: ");
                            price = input.nextInt();
                            if(price > balance)
                            {
                                System.out.println("bakiyeniz yeterli değil");
                            }else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            break;

                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
        }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }


        }
    }
}
