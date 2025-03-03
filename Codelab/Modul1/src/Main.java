import java.util.Scanner;  // Mengimpor kelas Scanner untuk input dari pengguna
import java.time.LocalDate; // Mengimpor kelas LocalDate untuk mendapatkan tahun saat ini

public class Main {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine(); // Membaca input nama sebagai string

        // Meminta input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminInput = scanner.next().charAt(0); // Membaca satu karakter pertama dari input
        // Menentukan jenis kelamin berdasarkan input
        String jenisKelamin = (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') ? "Laki-laki" : "Perempuan";

        // Meminta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt(); // Membaca input angka sebagai tahun lahir

        // Menutup scanner untuk menghemat sumber daya
        scanner.close();

        // Mendapatkan tahun saat ini menggunakan LocalDate
        int tahunSekarang = LocalDate.now().getYear();

        // Menghitung umur berdasarkan tahun lahir dan tahun saat ini
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan output hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Umur           : " + umur + " tahun");
    }
}
// Tegar Tutu Empar Pranata 202410370110008 codelab1 modul 1 Informatika B