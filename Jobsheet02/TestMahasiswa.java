package Jobsheet02;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        Mahasiswa mhs2=new Mahasiswa();
        Mahasiswa mhs3=new Mahasiswa();

        mhs1.nim="254107020215"; 
        mhs1.nama="Bagaskara Pradana Yulianto";
        mhs1.alamat="Jl. Soekarno Hatta";
        mhs1.kelas="TI-2D";
        mhs1.tampilBiodata();

        mhs2.nim="254107020000"; 
        mhs2.nama="Abyan";
        mhs2.alamat="Jl. Jakarta";
        mhs2.kelas="TI-2D";
        mhs2.tampilBiodata();

        mhs3.nim="254107020111"; 
        mhs3.nama="M.Bagas";
        mhs3.alamat="Jl. Malang";
        mhs3.kelas="TI-2D";
        mhs3.tampilBiodata();
    }
}
