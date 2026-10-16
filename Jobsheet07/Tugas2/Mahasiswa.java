package Jobsheet07.Tugas2;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di warung kos.");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah mengerjakan proyek.");
    }
}