package modul_2.latihan.bagian_4;

public class Mahasiswa {
    private String nama;
    private String nim;

    //setter

    public void setmhs(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    public String getMhs() {
        return ("Nama : " + nama + "\nNIM : " + nim);
    }
}
