package UTS;

public class Main {
    public static void main(String[] args) {
        // 1. Buat Restoran "Kedai Tugu" dengan 5 meja, kepala dapur Koki "Chef Arif"
        Restoran resto = new Restoran("Kedai Tugu", 5);
        resto.setKepalaDapur(new Koki("Chef Arif"));
        Kasir kasir = new Kasir("Kasir Utama");
        
        // 2. Buat Pelayan "Rina" dan set sebagai pelayan meja 2
        Pelayan rina = new Pelayan("Rina");
        Meja meja2 = resto.getMeja(2);
        if (meja2 != null) {
            meja2.setPelayan(rina);
        }
        
        // 3. Buat Makanan ("Nasi Goreng", 25000, true) dan Minuman ("Es Teh", 8000, "L")
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 25000, true);
        Minuman esTeh = new Minuman("Es Teh", 8000, "L");
        
        // 4. Proses pesan dan cetak bill
        if (meja2 != null) {
            meja2.pesan(nasiGoreng);
            meja2.pesan(esTeh, 2);
            kasir.cetakBill(meja2);
        }
    }
}