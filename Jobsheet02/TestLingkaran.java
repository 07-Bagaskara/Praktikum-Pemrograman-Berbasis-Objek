package Jobsheet02;

class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran();
        L.r = 10;
        System.out.println("Luas     : " + L.hitungLuas());
        System.out.println("Keliling : " + L.hitungKeliling());
    }
}