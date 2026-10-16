package Jobsheet01;

public class Tas {
    public String pemilik;
    public int jumlahBarang;

    public void masukkanBarang(int jumlah) {
        jumlahBarang += jumlah;
        System.out.println(jumlah + "Barang ditambahkan ke dalam tas.");
    }

    public void kosongkanTas() {
        jumlahBarang = 0;
        System.out.println("Barang dikeluarkan dari tas.");
    }

    public void cetakInfo() {
        System.out.println("Pemilik Tas: " + pemilik);
        System.out.println("Total Barang Bawaan: " + jumlahBarang);
    }
}