public class Main {
    public static void main(String[] args) {
        MenuItem menuDefault = new MenuItem();
        MenuItem menuBurger = new MenuItem("Burger Ayam", 25000);
        MenuItem menuMinuman = new MenuItem("Es Teh Manis", "Minuman", 8000, 50);

        System.out.println("=== Data Menu Awal ===");
        menuDefault.tampilInformasi();
        menuBurger.tampilInformasi();
        menuMinuman.tampilInformasi();

        System.out.println();
        System.out.println("=== Proses Transaksi / Perubahan Stok ===");
        menuBurger.updateStok(-3);
        menuMinuman.updateStok(20);

        System.out.println();
        System.out.println("=== Data Menu Setelah Update ===");
        menuBurger.tampilInformasi();
        menuMinuman.tampilInformasi();
    }
}
