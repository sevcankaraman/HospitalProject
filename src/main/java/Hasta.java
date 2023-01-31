import java.util.Scanner;

public class Hasta {

    private String isim;
    private String soyIsim;
    private int hastaID;
    private Durum hastaDurumu;

    public static Scanner sc= new Scanner(System.in);

    public static void sec(){
        while(true){
            System.out.println(" 1 doktor ekle\n2Doktor Listelel\n3 unvandan doktor bulma\n4 doktor silme\nana menu\n6 cıkıs");
            String sec=sc.next();
            switch (sec){
                case"1":
                    ekle();
                case "2":
                    listele();
                case "3":
                    bulma();
                case"4":


            }

        }

    }

    public  static void ekle(){}
    public  static void listele(){}
    public  static void bulma(){}
    public  static void silme(){}


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }



    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", hastaID=" + hastaID +
                ", hastaDurumu=" + hastaDurumu +
                '}';
    }
}
