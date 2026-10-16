package UTS;

public class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, int hargaDasar, String ukuran) {
        super(nama, hargaDasar);
        this.ukuran = ukuran;
    }

    @Override
    public int hitungHarga() {
        // Guard clause untuk ukuran null
        if (ukuran != null && ukuran.equalsIgnoreCase("L")) {
            return hargaDasar + 5000;
        }
        return hargaDasar;
    }
}