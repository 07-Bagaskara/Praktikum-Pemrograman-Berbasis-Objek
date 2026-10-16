package UTS;

public class Kasir {
    private String nama;
    public Kasir(String nama) { this.nama = nama; }

    public void cetakBill(Meja meja) {
        if (meja == null) return; // Guard clause
        
        String namaPelayan = (meja.getPelayan() != null) ? meja.getPelayan().getNama() : "-";
        System.out.println("Bill Meja " + meja.getNomor() + " (Pelayan: " + namaPelayan + ")");
        
        Menu[] pesanan = meja.getPesanan();
        for (int i = 0; i < meja.getJumlahPesanan(); i++) {
            if (pesanan[i] != null) {
                System.out.printf("%-13s %d\n", pesanan[i].getNama(), pesanan[i].hitungHarga());
            }
        }
        
        int subtotal = meja.hitungSubtotal();
        int pajak = (int) (subtotal * 0.10); // Pajak 10%
        int total = subtotal + pajak;
        
        System.out.printf("%-13s %d\n", "Subtotal", subtotal);
        System.out.printf("%-13s %d\n", "Pajak 10%", pajak);
        System.out.printf("%-13s %d\n", "Total", total);
    }
}