public class MenuItem {
    private String namaMenu;
    private String kategori;
    private double harga;
    private int stok;

    public MenuItem() {
        this("Menu Belum Dinamai", "Umum", 0.0, 0);
    }

    public MenuItem(String namaMenu, double harga) {
        this(namaMenu, "Makanan", harga, 10);
    }

    public MenuItem(String namaMenu, String kategori, double harga, int stok) {
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilInformasi() {
        System.out.println("-----------------------------------");
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Harga     : Rp " + String.format("%,.0f", harga));
        System.out.println("Stok      : " + stok);
        System.out.println("-----------------------------------");
    }

    public void updateStok(int jumlah) {
        int stokBaru = stok + jumlah;
        if (stokBaru < 0) {
            System.out.println("Gagal update stok " + namaMenu + ", stok tidak boleh minus.");
        } else {
            stok = stokBaru;
            System.out.println("Stok " + namaMenu + " berhasil diupdate menjadi " + stok);
        }
    }
}
