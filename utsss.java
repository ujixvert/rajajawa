import java.util.Scanner;

public class utsss {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("jumlah barang : ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaBarang = new String[n];
        int[] harga = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nama barang ke-" + (i + 1) + " : ");
            namaBarang[i] = input.nextLine();
            System.out.print("harga barang ke-" + (i + 1) + " : Rp ");
            harga[i] = input.nextInt();
            input.nextLine();
        }

        int totalBelanja = 0;
        for (int i = 0; i < n; i++) {
            totalBelanja += harga[i];
        }

        double diskon = 0;
        if (totalBelanja >= 100000) {
            diskon = 10;
        } else if (totalBelanja >= 50000) {
            diskon = 5;
        }

        double potongan = totalBelanja * (diskon / 100);
        double grandTotal = totalBelanja - potongan;

        System.out.println("\n--- RINCIAN BELANJA ---");
        for (int i = 0; i < n; i++) {
            System.out.println(namaBarang[i] + " : Rp " + harga[i]);
        }
        System.out.println("-----------------------");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : " + (int) diskon + "%");
        System.out.println("Potongan      : Rp " + (int) potongan);
        System.out.println("Grand Total   : Rp " + (int) grandTotal);

        input.close();
    }
}