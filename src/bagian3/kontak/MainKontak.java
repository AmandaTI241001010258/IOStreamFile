package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"));

        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println();

        System.out.println("=== Cari Kontak ===");
        buku.cariKontak("Budi");

        System.out.println();

        System.out.println("=== Hapus Kontak ===");
        buku.hapusKontak("Budi");

        System.out.println();

        System.out.println("=== Data Setelah Dihapus ===");
        buku.tampilkanSemua();

        System.out.println();

        BukuKontak bukuLain =
                new BukuKontak("kontak.txt");

        bukuLain.muatDariBerkas();

        System.out.println();

        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: "
                + bukuLain.jumlahKontak());
    }
}