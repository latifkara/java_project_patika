import java.util.Scanner;

public class odev7 {

    public static void main(String[] args) {
        double mesafa;
        int yas;
        int yolculukTipi;
        double normalTutar, toplamTutar = 0,yasIndirimi,indirimliTutar,geriDonusBiletIndirimi;
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen mesafayı giriniz: ");
        mesafa = in.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = in.nextInt();
        System.out.print("Lütfen Yolculuk tipini (Tek Yön, Gidiş-Dönüş) giriniz: ");
        yolculukTipi = in.nextInt();

        if(mesafa > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2))
        {
            if(yolculukTipi == 1)
            {
                if (yas < 12)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar  * 2;
                }else if (yas >= 12 && yas <= 24)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar  * 2;
                }else if (yas > 60)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar * 2;
                }else {
                    toplamTutar = mesafa * 0.10;
                }
            }else if(yolculukTipi == 2)
            {
                if (yas < 12)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    geriDonusBiletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - geriDonusBiletIndirimi) * 2;
                }else if (yas >= 12 && yas <= 24)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    geriDonusBiletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - geriDonusBiletIndirimi) * 2;
                }else if (yas > 60)
                {
                    normalTutar = mesafa * 0.10;
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    geriDonusBiletIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - geriDonusBiletIndirimi) * 2;
                }
            }
            System.out.println("Toplam Tutar = "+ toplamTutar);
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
