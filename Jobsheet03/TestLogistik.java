package Jobsheet03;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan jumlah muatan baru yang ingin ditambahkan (kg): ");
        double tambah1 = sc.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + tambah1 + " kg...");
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan jumlah muatan baru yang ingin ditambahkan (kg): ");
        double tambah2 = sc.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + tambah2 + " kg...");
        kontainerAlfa.tambahMuatan(tambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan jumlah muatan yang ingin dibongkar (kg): ");
        double turun1 = sc.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + turun1 + " kg...");
        kontainerAlfa.turunkanMuatan(turun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        sc.close();
    }
}