public class Buku {

    String judul;
    String pengarang;
    int tahunTerbit;
    boolean isDipinjam;

    public Buku(String judul, String pengarang, int tahunTerbit, boolean isDipinjam) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
    }

    public void pinjamBuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            System.out.println("Berhasil meminjam buku: " + judul);
        } else {
            System.out.println("Gagal meminjam, buku \"" + judul + "\" tidak tersedia (sedang dipinjam)");
        }
    }

    public void kembalikanBuku() {
        if (isDipinjam) {
            isDipinjam = false;
            System.out.println("Berhasil mengembalikan buku");
        } else {
            System.out.println("Beta buka gudang, bukunya hilang");
        }
    }

    public void tampilkanDetail() {
        String status = isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("---------------------------------------");
        System.out.println("Judul");
        System.out.println(judul);
        System.out.println("---------");
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status : " + status);
        System.out.println("---------------------------------------");
    }
}
