package Jobsheet07.Tugas1;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Implementasi dari rumus Phytagoras c = √(a² + b²) sesuai class diagram
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c; 
    }

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Total Sudut (1 parameter) : " + sg.totalSudut(90));
        System.out.println("Total Sudut (2 parameter) : " + sg.totalSudut(90, 45));
        System.out.println("Keliling (3 parameter)    : " + sg.keliling(3, 4, 5));
        System.out.println("Keliling (Mencari sisi c) : " + sg.keliling(3, 4));
    }
}