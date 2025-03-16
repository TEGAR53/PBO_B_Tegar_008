
public class Hewan {
            // Deklarasi atribut untuk menyimpan nama, jenis, dan suara hewan
            String nama;
            String jenis;
            String suara;

           // Konstruktor untuk menginisialisasi objek Hewan dengan nama, jenis, dan suara
            Hewan(String nama, String jenis, String suara) {
                this.nama = nama;
                this.jenis = jenis;
                this.suara = suara;
            }

           // Metode untuk menampilkan informasi hewan ke layar
            void tampilkanInfo() {
                System.out.println("Nama: " + nama);
                System.out.println("Jenis: " + jenis);
                System.out.println("Suara: " + suara);
                System.out.println();   // Menambahkan baris kosong untuk pemisahan output
            }
        }
