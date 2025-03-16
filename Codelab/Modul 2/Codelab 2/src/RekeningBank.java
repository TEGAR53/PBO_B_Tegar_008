// Kelas RekeningBank yang merepresentasikan rekening nasabah
class RekeningBank {
    // Atribut untuk menyimpan informasi rekening
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor untuk inisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Metode untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambah saldo
        System.out.println(namaPemilik + " menambah uang Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Metode untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah; // Mengurangi saldo
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}