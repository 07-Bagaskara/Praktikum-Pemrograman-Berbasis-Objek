package Jobsheet01;

public class Ransel extends Tas {
    public String warna;
    public String kondisiResleting;

    public void bukaResleting() {
        kondisiResleting = "Terbuka";
        System.out.println("Resleting ransel dibuka.");
    }

    public void tutupResleting() {
        kondisiResleting = "Tertutup";
        System.out.println("Resleting ransel ditutup.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); 
        System.out.println("Warna Ransel: " + warna);
        System.out.println("Kondisi Resleting: " + kondisiResleting); 
    }
}