package Jobsheet02;

public class Mahasiswa {
    public String nim;//dijadiin String karena nimku ada 12 angka,juga karena entah mengapa tidak bisa kupakai double//
    public String nama;
    public String alamat;
    public String kelas;

    public void tampilBiodata(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Kelas : "+kelas);
    }
}
