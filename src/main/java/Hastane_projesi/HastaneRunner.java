package Hastane_projesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HastaneRunner {

    private static Hastane hastane1=new Hastane();
    static Scanner sc = new Scanner(System.in);
    static  String hastaDurumu ="Allerji" ;
    static String unvan = doktorUnvan(hastaDurumu);

    public static void main(String[] args) {

      //doktorUnvan("Allerji");
      //doktorBul("Allerjist");
      //hastaDurumuBul("Allerji");
      //hastaBul("Allerji");

        secim();

    }
    public static void secim(){
        while (true){
            System.out.println("Doktor: 1 hasta 2");
            int sec = sc.nextInt();
            try{
                if(sec == 1){

                    doktorBul(unvan);
                }else if(sec == 2){
                    hastaBul(hastaDurumu);
                }

            }catch(InputMismatchException e){
                System.out.println("gecerlı deger gırınız");
            }



        }
    }
    public static String doktorUnvan (String aktuelDurum){
        if (aktuelDurum.equalsIgnoreCase("Allerji")){
            return hastane1.unvanlar[0];
        }
        if (aktuelDurum.equalsIgnoreCase("Bas agrisi")){
            return hastane1.unvanlar[1];
        }
        if (aktuelDurum.equalsIgnoreCase("Diabet")){
            return hastane1.unvanlar[2];
        }
        if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")){
            return hastane1.unvanlar[3];
        }
        if (aktuelDurum.equalsIgnoreCase("Migren")){
            return hastane1.unvanlar[4];
        }
        if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")){
            return hastane1.unvanlar[5];
        }else{
            return "yanlıs unvan";
        }
    }

    public static  Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();
        int idx = 0;

        for (String w : hastane1.unvanlar) {

            if (unvan.equals(w)) {
                doktor.setIsim(hastane1.doktorIsimleri[idx]);
                doktor.setSoyIsim(hastane1.doktorSoyIsimleri[idx]);
                doktor.setUnvan(hastane1.unvanlar[idx]);
            }
            idx++;
        }
        System.out.println("unvan        :" + doktor.getUnvan());
        System.out.println("dr isim      :" + doktor.getIsim());
        System.out.println("dr soyisim   :" + doktor.getSoyIsim());
        return doktor;
    }
    public static  Durum hastaDurumuBul(String aktuelDurum){
        Durum hastaDurumu= new Durum();
        switch (aktuelDurum){
            case "Allerji":
            case "Bas agrisi":
            case "Diabet":
            case "Sogukalginligi":
               hastaDurumu.setAciliyet(false);
                System.out.println("yeşil alan     : " + hastaDurumu.isAciliyet());
                break;
            case "Migren":
            case "Kalphastaliklari":
                hastaDurumu.setAciliyet(true);
                System.out.println("kırmızı alan..." + hastaDurumu.isAciliyet());
                break;
            default:
                System.out.println("gecerli bir durum değil");

        }
        return hastaDurumu;
    }
    public static Hasta hastaBul(String aktuelDurum){
        Hasta hasta=new Hasta();

        int idx=0;
        for (String  w : hastane1.durumlar ) {
            if (aktuelDurum.equalsIgnoreCase(w)){
                hasta.setIsim(hastane1.hastaIsimleri[idx]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[idx]);
                hasta.setHastaID(hastane1.hastaIDleri[idx]);
            }
            idx++;
        }
        System.out.println("hasta ismi     : " + hasta.getIsim());
        System.out.println("hasta soyismi  : " + hasta.getSoyIsim());
        System.out.println("hasta id       : " + hasta.getHastaID());

        return hasta;
    }
}