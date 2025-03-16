
// Kelas utama yang berisi metode main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("202410370110008", "tegar", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110006", "gilbert", 700000);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Simulasi transaksi untuk rekening1
        rekening1.setorUang(200000);
        rekening1.tarikUang(800000); // Gagal karena saldo tidak mencukupi
        rekening1.tarikUang(500000); // Berhasil

        System.out.println(); // Pemisah output

        // Simulasi transaksi untuk rekening2
        rekening2.setorUang(100000);
        rekening2.tarikUang(300000); // Berhasil

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.println("\nProcess finished with exit code 0");
    }
}
