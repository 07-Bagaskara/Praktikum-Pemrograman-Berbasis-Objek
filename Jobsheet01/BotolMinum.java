package Jobsheet01;

public class BotolMinum {
    public String merk;
    public int isiAirMl;

    public void isiAir(int jumlah) {
        isiAirMl += jumlah;
        System.out.println("Air diisi. Total air terisi: " + isiAirMl + " ml.");
    }

    public void minumAir(int jumlah) {
        isiAirMl -= jumlah;
        System.out.println("Air diminum. Sisa air: " + isiAirMl + " ml.");
    }

    public void cetakInfo() {
        System.out.println("Merk Botol: " + merk);
        System.out.println("Volume Air Saat Ini: " + isiAirMl + " ml");
    }
}