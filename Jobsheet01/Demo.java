package Jobsheet01;
public class Demo {
    public static void main(String[] args) {
        JamDinding jam = new JamDinding();
        BotolMinum botol = new BotolMinum();
        Tas tasUmum = new Tas();
        Ransel ransel = new Ransel();
        Koper koper = new Koper();

        System.out.println("---------------------");
        jam.merk = "Rolex";
        jam.putarJarum(10);
        jam.gantiBaterai();
        jam.cetakInfo();

        System.out.println("\n--------------------");
        botol.merk = "Pocari Sweet";
        botol.isiAirMl = 0; 
        botol.isiAir(500);
        botol.minumAir(200);
        botol.cetakInfo();

        System.out.println("\n--------------------");
        tasUmum.pemilik = "Adit";
        tasUmum.jumlahBarang = 0;
        tasUmum.masukkanBarang(3);
        tasUmum.kosongkanTas();
        tasUmum.cetakInfo();

        System.out.println("\n--------------------");
        ransel.pemilik = "Budi";      
        ransel.jumlahBarang = 2;      
        ransel.warna = "Hitam";
        ransel.bukaResleting();
        ransel.tutupResleting();
        ransel.cetakInfo();

        System.out.println("\n--------------------");
        koper.pemilik = "Jarwo";
        koper.jumlahBarang = 10;
        koper.jumlahRoda = 4;
        
        koper.gerakkanKoper("ditarik");
        koper.setKunci("Terkunci");
        koper.cetakInfo();
    }
}