package Jobsheet01;

public class JamDinding {
    public String merk;
    public int jamSekarang;

    public void putarJarum(int jam) {
        jamSekarang = jam;
        System.out.println("Jarum jam diputar ke angka: " + jamSekarang);
    }

    public void gantiBaterai() {
        System.out.println("Baterai jam dinding telah diganti .");
    }

    public void cetakInfo() {
        System.out.println("Merk Jam: " + merk);
        System.out.println("Menunjuk Pukul: " + jamSekarang);
    }
}