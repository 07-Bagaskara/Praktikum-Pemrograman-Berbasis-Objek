package Jobsheet04.TUGAS;

public class MainTugas {
    public static void main(String[] args) {
        // Objek dari luar (Aggregation)
        Produk p1 = new Produk("Laptop Gaming", 15000000);
        Produk p2 = new Produk("Mouse Wireless", 250000);
        Produk[] keranjang = {p1, p2};

        // Instansiasi Pesanan. (Alamat otomatis dibuat di dalam constructor - Composition)
        Pesanan pesananSaya = new Pesanan("TRX-998", "Jl. Soekarno Hatta", "Malang");
        pesananSaya.setDaftarProduk(keranjang);

        // Objek jasa (Dependency)
        Kurir jne = new Kurir("JNE Express");
        
        // Eksekusi
        System.out.println("=== SISTEM E-COMMERCE ===");
        pesananSaya.prosesPengiriman(jne);
    }
}