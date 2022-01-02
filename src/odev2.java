import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName, password;
        String userNamePatika = "patika", passwordPatika = "dev";

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = in.nextLine();
        System.out.print("Lütfen Şifrenizi giriniz: ");
        password = in.nextLine();

        if (userName.equals(userNamePatika) && password.equals(passwordPatika)){
            System.out.println("giriş başarıyla yapıldı.");
        }else{
            System.out.println("Giriş yapılmadı. Şifrenizi sıfırlamak ister misiniz?");
            passwordPatika = in.nextLine();
            if (passwordPatika.equals("dev")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else {
                System.out.println("Şifre oluşturuldu");
            }
        }
    }
}
