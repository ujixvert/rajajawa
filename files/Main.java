public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Islam ala Prabowo", "Prabowo", 2021, false);
        Buku buku2 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005, false);
        Buku buku3 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980, false);
        Buku buku4 = new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009, false);

        buku1.tampilkanDetail();
        buku2.tampilkanDetail();
        buku3.tampilkanDetail();
        buku4.tampilkanDetail();

        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Ani");

        System.out.println("=== Skenario 1: Budi meminjam lebih dari satu buku ===");
        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);
        anggota1.tampilkanBukuDipinjam();

        System.out.println();
        System.out.println("=== Skenario 2: Ani mencoba meminjam buku yang sudah tidak tersedia ===");
        anggota2.pinjamBuku(buku1);

        System.out.println();
        System.out.println("=== Skenario 3: Ani meminjam buku yang masih tersedia ===");
        anggota2.pinjamBuku(buku3);
        anggota2.pinjamBuku(buku4);
        anggota2.tampilkanBukuDipinjam();

        System.out.println();
        buku1.tampilkanDetail();
    }
}
