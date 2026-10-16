package Jobsheet04.PERCOBAAN_4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        
        // Tes untuk modifikasi pertanyaan 5
        Penumpang p2 = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(p2, 1); // Akan ditolak karena sudah ada Mr. Krab
        
        System.out.println(gerbong.info());
    }
}