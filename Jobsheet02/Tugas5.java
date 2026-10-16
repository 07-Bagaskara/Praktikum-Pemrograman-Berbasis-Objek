package Jobsheet02;

public class Tugas5 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};
        
        System.out.println("Awal Program");
        
        try {
            System.out.println(angka[3]);
        } catch (Exception e) {
            System.out.println("Terjadi error: Indeks array melebihi batas (ArrayIndexOutOfBoundsException)");
        }   
        System.out.println("Akhir Program");
    }
}