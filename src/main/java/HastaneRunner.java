import java.util.Scanner;

public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();
    static int sec;
    static Scanner sc = new Scanner(System.in);
    static  String hastaDurumu ="Allerji" ;
    static String unvan = doktorUnvan(hastaDurumu);

    public static void main(String[] args) {


        secim();
    }

    public static void secim(){
        while (true){
            System.out.println("Doktor: 1 hasta 2");
            int sec = sc.nextInt();
            if(sec == 1){

                doktorBul(unvan);
            }else if(sec == 2){
                hastaBul(hastaDurumu);
            }


        }
    }
    public static String doktorUnvan(String aktuelDurum) {


        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane1.unvanlar[0];


        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return hastane1.unvanlar[1];

        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane1.unvanlar[2];

        } else if (aktuelDurum.equalsIgnoreCase("Sogukalginligi")) {
            return hastane1.unvanlar[3];

        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane1.unvanlar[4];

        } else if (aktuelDurum.equalsIgnoreCase("Kalphastaliklari")) {
            return hastane1.unvanlar[5];

        }
        return "yanlış secim";
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
//            for (int i = 0; i < hastane1.unvanlar.length; i++) {
//
//                if (unvan.equals(hastane1.unvanlar[i])) {
//                    doktor.setIsim(hastane1.doktorIsimleri[i]);
//                    doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
//                    doktor.setUnvan(unvan);
//
//                }
//         }

        int idx = 0;



        for (String w : hastane1.unvanlar) {
            if (unvan.equals(w)) {
                doktor.setIsim(hastane1.doktorIsimleri[idx]);
                doktor.setSoyIsim(hastane1.doktorSoyIsimleri[idx]);
                doktor.setUnvan(unvan);
            }
            idx++;
        }

        System.out.println("Unvan " + doktor.getUnvan() + " ");
        System.out.println("Doktor isimi " + doktor.getIsim() + " ");
        System.out.println("Doktor soyisim " + doktor.getSoyIsim() + " ");

        return doktor;
    }

    public static Durum hastaDurumuBul(String aktuelDurum){
        Durum hastaDurumu = new Durum();
        switch (aktuelDurum){
            case "Allerji":
            case "Bas agrisi":
            case "Diabet":
            case "Sogukalginligi":
                hastaDurumu.setAciliyet(false);
                System.out.println(aktuelDurum + " Yesil Alan " + hastaDurumu.isAciliyet());
                break;
            case "Migren":
            case "Kalphastaliklari":
                hastaDurumu.setAciliyet(true);
                System.out.println(aktuelDurum + " Kırmızı Alan " + hastaDurumu.isAciliyet());
                break;
            default:
                System.out.println("Gecerli bir durum degil");

        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String actualCase){
        Hasta hasta= new Hasta();
        int idx = 0;

        for (String w : hastane1.durumlar) {

            if(actualCase.equals(w)){

                hasta.setIsim(hastane1.hastaIsimleri[idx]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[idx]);
                hasta.setHastaID(hastane1.hastaIDleri[idx]);
            }
            idx++;
        }

        System.out.println("hasta ismi " +hasta.getIsim());
        System.out.println("Hasta soyismi " + hasta.getSoyIsim());
        System.out.println("Hasta ID " + hasta.getHastaID());
        return hasta;
    }

}
