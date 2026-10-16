package Jobsheet06.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Objek 1: Dibuat menggunakan konstruktor tanpa parameter & diisi satu per satu
        TiketKereta tiket1 = new TiketKereta();
        tiket1.kodeTiket = "KA-001";
        tiket1.namaPenumpang = "Andi";
        tiket1.asal = "Malang";
        tiket1.tujuan = "Jakarta";
        tiket1.hargaDasar = 350000;
        tiket1.nomorGerbong = 3;
        tiket1.nomorKursi = "12A";
        
        tiket1.tampilKereta();
        System.out.println();

        // Objek 2: Dibuat menggunakan konstruktor berparameter
        TiketDomestik tiket2 = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 
                900000, "Garuda Indonesia", 25, 75000);
        tiket2.tampilDomestik();
        System.out.println();

        // Objek 3: Dibuat menggunakan konstruktor berparameter
        TiketInternasional tiket3 = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 
                2500000, "Singapore Airlines", 20, "C1234567", 150000);
        tiket3.tampilInternasional();
    }
}