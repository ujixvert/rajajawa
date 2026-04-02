import java.util.Scanner;
public class projectmangkrak {
    public static  void main(String[] args) {

        // Step 1: Buat Scanner
        Scanner input = new Scanner(System.in);

        // Step 2: Input dari user
        System.out.print("Nama Barang   : ");
        String namaBarang = input.nextLine();

        System.out.print("Harga Barang  : ");
        double hargaBarang = input.nextDouble();

        System.out.print("Jumlah Beli   : ");
        int jumlahBeli = input.nextInt();

        // Step 3: Proses hitung total
        double totalBayar = hargaBarang * jumlahBeli;

        // Step 4: Output
        System.out.println("==============================");
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Bayar  : " + totalBayar);
        System.out.println("==============================");

        // Step 5: Tutup Scanner
        input.close();
    }
}
