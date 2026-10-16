package UTS;;

public class Restoran {
    private String nama;
    private Meja[] daftarMeja;
    private Koki kepalaDapur;

    public Restoran(String nama, int jumlahMeja) {
        this.nama = nama;
        if (jumlahMeja <= 0) jumlahMeja = 1; // Guard clause
        
        this.daftarMeja = new Meja[jumlahMeja];
        
        // IMPLEMENTASI KOMPOSISI: Objek whole (Restoran) menciptakan objek part (Meja)
        for (int i = 0; i < jumlahMeja; i++) {
            this.daftarMeja[i] = new Meja(i + 1);
        }
    }

    public void setKepalaDapur(Koki koki) {
        this.kepalaDapur = koki;
    }

    public Meja getMeja(int nomor) {
        // Guard clause mencegah Index Out Of Bounds
        if (nomor < 1 || nomor > daftarMeja.length) return null; 
        return daftarMeja[nomor - 1];
    }

    public void tampilInfo() {
        System.out.println("Restoran: " + nama);
        if (kepalaDapur != null) {
            System.out.println("Koki Utama: " + kepalaDapur.getNama());
        }
    }
}