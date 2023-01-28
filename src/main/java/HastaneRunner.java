public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Kalp hastaliklari";
        String unvan = doktorUnvan(hastaDurumu);
        boolean aktuelDurum= hastaDurumuBul().isAciliyet();

        hastane1.setDoktor(doktorBul(unvan));
        hastane1.setHasta(hastaDurumuBul());




        System.out.println("doktor ismi :"+ hastane1.getDoktor().getIsim());
        System.out.println("doktor soyisim :" + hastane1.getDoktor().getSoyIsim());
        System.out.println("doktor unvan : " + hastane1.getDoktor().getUnvan());
        System.out.println("");


    }

    public static String doktorUnvan(String aktuelDurum) {

        if (aktuelDurum.equals("Allerji")){
            return hastane1.unvanlar[0];
        } else if (aktuelDurum.equals("Bas agrisi")) {
            return hastane1.unvanlar[1];
        } else if (aktuelDurum.equals("Diabet")) {
            return hastane1.unvanlar[2];
        } else if (aktuelDurum.equals("Soguk alginligi")) {
            return hastane1.unvanlar[3];
        } else if (aktuelDurum.equals("Migren")) {
            return hastane1.unvanlar[4];
        } else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return hastane1.unvanlar[5];
        }

        return "yanlış seçim";
    }

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane1.unvanlar.length; i++) {

            if (unvan.equals(hastane1.unvanlar[i])) {
                doktor.setIsim(hastane1.doktorIsimleri[i]);
                doktor.setSoyIsim(hastane1.doktorSoyIsimleri[i]);
                doktor.setUnvan(unvan);

            }
        }return doktor;
    }

    public static Durum hastaDurumuBul(boolean aktuelDurum){

        Durum hastaDurumu=new Durum();

        switch (aktuelDurum){

        case " Allerji":
            System.out.println(false);
        case " Bas agrisi":
            System.out.println(false);
        case " Diabet":
            System.out.println(false);
        case " Soguk alginligi":
            System.out.println(false);
        case " Migren":
            System.out.println(true);
        case " Kalp hastaliklari":
            System.out.println(true);
        default:
        System.out.println("Gecerli bir durum degil");

        }  return hastaDurumu;

    }

    public static Hasta hastaBul(String actualCase){
        Hasta hasta = new Hasta();



        return hasta;
    }

}
