package Jobsheet04.TUGAS;

public class Pesanan {
    private String idPesanan;
    // 1. Aggregation: Disimpan sebagai array/atribut, dibuat di luar.
    private Produk[] daftarProduk; 
    // 2. Composition: Disimpan sebagai atribut, lifecycle dikontrol dari dalam.
    private Alamat alamatPengiriman;

    public Pesanan(String idPesanan, String jalan, String kota) {
        this.idPesanan = idPesanan;
        // Instansiasi Composition
        this.alamatPengiriman = new Alamat(jalan, kota); 
    }

    // Setter untuk Aggregation
    public void setDaftarProduk(Produk[] produk) {
        this.daftarProduk = produk;
    }

    // 3. Dependency: Kurir tidak dijadikan atribut, hanya meminjam objek via parameter
    public void prosesPengiriman(Kurir kurir) {
        System.out.println("Pesanan " + idPesanan + " sedang diproses...");
        for (Produk p : daftarProduk) {
            System.out.println("- Packing " + p.getInfo());
        }
        // Menggunakan layanan kurir
        kurir.kirimPaket(idPesanan, alamatPengiriman.getDetail());
    }
}
