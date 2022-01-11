import java.util.Scanner;

public class odev6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String borc = "";
        int month, day;
        boolean isError = false;

        System.out.print("Doğdunuz ayı giriniz: ");
        month = in.nextInt();
        System.out.print("Doğdunuz günü giriniz: ");
        day = in.nextInt();

        if (month == 1)
        {
            if (day > 1 && day < 31)
            {
                if (day < 23)
                {
                    borc = "oğlak";
                }else {
                    borc = "kova";
                }
            }else {
                isError = true;
            }

        }
        else if (month == 2)
        {
            if (day > 1 && day < 28)
            {
                if (day < 20)
                {
                    borc = "kova";
                }else {
                    borc = "balık";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 3)
        {
            if (day > 1 && day < 31)
            {
                if (day < 21)
                {
                    borc = "balık";
                }else {
                    borc = "koç";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 4)
        {
            if (day > 1 && day < 30)
            {
                if (day < 21)
                {
                    borc = "koç";
                }else {
                    borc = "boğa";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 5)
        {
            if (day > 1 && day < 31)
            {
                if (day < 22)
                {
                    borc = "boğa";
                }else {
                    borc = "ikizler";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 6)
        {
            if (day > 1 && day < 30)
            {
                if (day < 23)
                {
                    borc = "ikizler";
                }else {
                    borc = "yengeç";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 7)
        {
            if (day > 1 && day < 31)
            {
                if (day < 23)
                {
                    borc = "yengeç";
                }else {
                    borc = "aslan";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 8)
        {
            if (day > 1 && day < 31)
            {
                if (day < 23)
                {
                    borc = "aslan";
                }else {
                    borc = "başak";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 9)
        {
            if (day > 1 && day < 30)
            {
                if (day < 23)
                {
                    borc = "başak";
                }else {
                    borc = "terazi";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 10)
        {
            if (day > 1 && day < 31)
            {
                if (day < 22)
                {
                    borc = "terazi";
                }else {
                    borc = "akrep";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 11)
        {
            if (day > 1 && day < 30)
            {
                if (day < 22)
                {
                    borc = "akreb";
                }else {
                    borc = "yay";
                }
            }else {
                isError = true;
            }
        }
        else if (month == 12)
        {
            if (day > 1 && day < 31)
            {
                if (day < 22)
                {
                    borc = "yay";
                }else {
                    borc = "oğlak";
                }
            }else {
                isError = true;
            }
        }

        if (isError){
            System.out.println("günü tekrar giriniz ");
        }else {
            System.out.println("Borcunuz: "+ borc);
        }
    }
}
