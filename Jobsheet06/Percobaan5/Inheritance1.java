package Jobsheet06.Percobaan5;

public class Inheritance1 {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Kedung Kandang";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();
        
        Staff S = new Staff();
        S.nama = "Budi";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Laki-laki";
        S.gaji = 2000000;
        S.lembur = 100000;
        S.potongan = 50000;
        S.tampilDataStaff();
    }
}