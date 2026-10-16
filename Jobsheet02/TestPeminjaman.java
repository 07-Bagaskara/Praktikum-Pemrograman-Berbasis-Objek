package Jobsheet02;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p= new Peminjaman();

        p.id ="123";
        p.namaMember="Windah";
        p.namaGame="GTA";
        p.lamaSewa=7;
        p.harga=100000;

        p.tampilDataPeminjaman();
    }
}
