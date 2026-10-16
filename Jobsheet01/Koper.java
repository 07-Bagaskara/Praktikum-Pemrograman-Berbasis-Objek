package Jobsheet01;

public class Koper extends Tas {
    public int jumlahRoda;
    public String statusKunci;

    public void gerakkanKoper(String cara) {
        System.out.println("Koper dipindahkan dengan " + cara + " menggunakan " + jumlahRoda + " roda.");
    }

    public void setKunci(String status) {
        statusKunci = status;
        System.out.println("Pengaturan kunci koper diubah menjadi: " + statusKunci);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Status Kunci: " + statusKunci);
    }
}