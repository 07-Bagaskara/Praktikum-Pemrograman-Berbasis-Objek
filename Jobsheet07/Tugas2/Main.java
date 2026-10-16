package Jobsheet07.Tugas2;

public class Main {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        // Menggunakan tipe data Superclass (Manusia) untuk merujuk pada objek Subclass
        Manusia referensiManusia;

        Dosen pakDosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("--- Implementasi Dynamic Method Dispatch ---");
        
        referensiManusia = pakDosen;
        referensiManusia.makan();

        referensiManusia = mhs;
        referensiManusia.makan(); 
    }
}