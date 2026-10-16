package Jobsheet07.Tugas2;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan di kantin dosen.");
    }
    
    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas mahasiswa.");
    }
}