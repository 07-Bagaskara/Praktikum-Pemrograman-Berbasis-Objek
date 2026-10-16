package Jobsheet04.TUGAS;

public class Alamat {
    private String jalan;
    private String kota;

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }
    public String getDetail() { return jalan + ", " + kota; 
    }
}
