import java.util.ArrayList;

public class Anggota {

    String nama;
    ArrayList<Buku> bukuDipinjam;

    public Anggota(String nama) {
        this.nama = nama;
        this.bukuDipinjam = new ArrayList<Buku>();
    }

    public void pinjamBuku(Buku buku) {
        boolean tersediaSebelum = !buku.isDipinjam;
        buku.pinjamBuku();
        if (tersediaSebelum) {
            bukuDipinjam.add(buku);
        }
    }

    public void tampilkanBukuDipinjam() {
        System.out.println(nama + " sedang meminjam " + bukuDipinjam.size() + " buku:");
        for (int i = 0; i < bukuDipinjam.size(); i++) {
            System.out.println("- " + bukuDipinjam.get(i).judul);
        }
    }
}
