package modul_2.latihan.bagian_1;

    public class Main {

    public static void main(String[] args) {
        // Membuat objek dari class buku
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.nama_buku = "Laskar Pelangi";
        buku1.pengarang = "Rizal";

        // Menampilkan nilai atribut
        System.out.println("Judul Buku  : " + buku1.nama_buku);
        System.out.println("Pengarang   : " + buku1.pengarang);
    }
}

