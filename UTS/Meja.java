package UTS;

public class Meja {
    private int nomor;
    private Menu[] pesanan = new Menu[5]; 
    private int jumlahPesanan = 0;
    private Pelayan pelayan;

    public Meja(int nomor) {
        this.nomor = nomor;
    }

    public void setPelayan(Pelayan pelayan) {
        this.pelayan = pelayan;
    }

    public Pelayan getPelayan() { return pelayan; }
    public int getNomor() { return nomor; }
    public Menu[] getPesanan() { return pesanan; }
    public int getJumlahPesanan() { return jumlahPesanan; }

    // OVERLOADING 1: Menambah 1 item
    public void pesan(Menu m) {
        if (m == null) return; // Guard clause 
        if (jumlahPesanan >= pesanan.length) return; // Guard index out of bounds
        
        pesanan[jumlahPesanan] = m;
        jumlahPesanan++;
    }

    // OVERLOADING 2: Menambah banyak item
    public void pesan(Menu m, int jumlah) {
        if (m == null || jumlah <= 0) return; // Guard clause
        if (jumlahPesanan + jumlah > pesanan.length) { // Guard untuk batas array 5
            System.out.println("Gagal: Meja " + nomor + " hanya bisa menampung sisa " + (pesanan.length - jumlahPesanan) + " pesanan.");
            return; 
        }
        
        for (int i = 0; i < jumlah; i++) {
            pesanan[jumlahPesanan] = m;
            jumlahPesanan++;
        }
    }

    public int hitungSubtotal() {
        int subtotal = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            if (pesanan[i] != null) {
                subtotal += pesanan[i].hitungHarga();
            }
        }
        return subtotal;
    }
}