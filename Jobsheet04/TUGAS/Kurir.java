package Jobsheet04.TUGAS;

public class Kurir {
    private String namaEkspedisi;

    public Kurir(String namaEkspedisi) { this.namaEkspedisi = namaEkspedisi; }
    
    public void kirimPaket(String nomorResi, String alamatTujuan) {
        System.out.println("[" + namaEkspedisi + "] Mengirim resi " + nomorResi + " ke " + alamatTujuan);
    }
}
