import java.util.Scanner;

public class uts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kategori tiket : ");
        int n = input.nextInt();
        input.nextLine();

        String[] kategori = new String[n];
        int[] harga = new int[n];
        int[] jumlahBeli = new int[n];

        int menu;

        do {
            System.out.println("\n=== PEMESANAN TIKET SURABAYA ZOO ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Kategori ke-" + (i + 1) + " : ");
                    kategori[i] = input.nextLine();
                    System.out.print("Harga     ke-" + (i + 1) + " : Rp ");
                    harga[i] = input.nextInt();
                    input.nextLine();
                }
                System.out.println("Data berhasil disimpan!");

            } else if (menu == 2) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Jumlah tiket " + kategori[i] + " : ");
                    jumlahBeli[i] = input.nextInt();
                    input.nextLine();
                }
                System.out.println("Jumlah beli berhasil disimpan!");

            } else if (menu == 3) {
                int totalBayar = 0;
                System.out.println("\n--- RINCIAN PEMBELIAN ---");
                for (int i = 0; i < n; i++) {
                    int subtotal = harga[i] * jumlahBeli[i];
                    totalBayar += subtotal;
                    System.out.println(kategori[i] + " x" + jumlahBeli[i] + " = Rp " + subtotal);
                }
                System.out.println("------------------------");
                System.out.println("Total Bayar : Rp " + totalBayar);

            } else if (menu == 4) {
                System.out.println("Terima kasih, sampai jumpa!");

            } else {
                System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 4);

        input.close();
    }
}