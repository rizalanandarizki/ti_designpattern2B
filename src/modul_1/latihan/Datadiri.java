public class Datadiri {
    public static void main(String[] args) {
        String namaLengkap = "Rizal Ananda Rizky";
        String tempatLahir = "Lhokseumawe";
        String tanggalLahir = "09-08-2005";
        String golonganDarah = "O";
        int umur = 19;
        double tinggiBadan = 165;
        char jenisKelamin = 'L';
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        System.out.println("\n=== Biodata ===");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Golongan Darah: " + golonganDarah);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Agama: " + agama);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
