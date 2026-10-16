package Jobsheet04.TUGAS;

public class Produk {
    private String namaBarang;
    private int harga;

    public Produk(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    public String getInfo() { return namaBarang + " (Rp" + harga + ")"; 
    }
}
