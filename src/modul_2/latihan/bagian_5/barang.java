package modul_2.latihan.bagian_5;

public class barang {
    String namaBarang;
    int harga;

    //defaul constructor
    public barang() {
        namaBarang = "Mobil";
        harga = 100000;
    }

    //parameterized contrusctor
    public barang(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
//method
        public void tampilkanInfo () {
            System.out.println("Nama Barang : " + namaBarang);
            System.out.println("Harga Barang : " + harga);
        }

}
