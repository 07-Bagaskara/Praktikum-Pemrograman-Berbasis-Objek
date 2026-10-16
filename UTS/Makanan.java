package UTS;

public class Makanan extends Menu {
    private boolean porsiJumbo;

    public Makanan(String nama, int hargaDasar, boolean porsiJumbo) {
        super(nama, hargaDasar);
        this.porsiJumbo = porsiJumbo;
    }

    @Override
    public int hitungHarga() {
        if (porsiJumbo) {
            return (int) (hargaDasar + (hargaDasar * 0.3)); // Harga naik 30%
        }
        return hargaDasar;
    }
}