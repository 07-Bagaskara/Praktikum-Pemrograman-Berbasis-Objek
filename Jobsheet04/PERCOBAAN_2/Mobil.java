package Jobsheet04.PERCOBAAN_2;

public class Mobil {
    private String merk;
    private int biaya;

    public  Mobil(){
    }

    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public int getBiaya(int biaya){
        return biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
