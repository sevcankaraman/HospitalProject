public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();


    public static void main(String[] args) {
        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);
        System.out.println();


        System.out.println("Doktor unvan = " + doktorUnvan(hastaDurumu) + "\nHastanın durumu = " + hastaDurumu);

        hastane1.setDoktor(doktorBul(unvan));
        //System.out.println("Unvan = " + hastane1.getDoktor().getUnvan() + " ");
        System.out.println("Doktor isimi = " + hastane1.getDoktor().getIsim() + " ");
        System.out.println("Doktor soyisim = " + hastane1.getDoktor().getSoyIsim() + " ");

        System.out.println();
        System.out.println("***********hasta bul methodu***********");
        System.out.println();

        hastane1.setHasta(hastaBul(hastaDurumu));
        hastaBul(hastaDurumu);
        System.out.println("hasta ismi = " + hastane1.hasta.getIsim());
        System.out.println("hasta soyismi = " + hastane1.hasta.getSoyIsim());
        System.out.println("hasta ID = " + hastane1.hasta.getHastaID());



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

    public static Hasta hastaBul(String aktuelDurum){
        Hasta hasta = new Hasta();
        int idx=0;

        for (String s : hastane1.durumlar) {
            if (aktuelDurum.equals(s)){
                hasta.setIsim(hastane1.hastaIsimleri[idx]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[idx]);
                hasta.setHastaID((hastane1.hastaIDleri[idx]));
            }
            idx++;

        }

        return hasta;
    }
}