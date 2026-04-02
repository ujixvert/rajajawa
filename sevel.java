import java.util.Scanner;

public class sevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input belanja
        System.out.print("Total Belanja : Rp ");
        double totalBelanja = input.nextDouble();
        input.nextLine(); // bersihkan buffer

        // Input status member
        System.out.print("Apakah member? (ya/tidak) : ");
        String member = input.nextLine();

        // Variabel identitas
        String nama = "-", alamat = "-", noHP = "-";
        double diskonMember = 0;

        // Kalau member, input identitas & dapat diskon 2%
        if (member.equalsIgnoreCase("ya")) {
            System.out.print("Nama    : ");
            nama = input.nextLine();
            System.out.print("Alamat  : ");
            alamat = input.nextLine();
            System.out.print("No HP   : ");
            noHP = input.nextLine();
            diskonMember = 2;
        }

        // Hitung diskon belanja
        double diskonBelanja = 0;
        if (totalBelanja > 300000) {
            diskonBelanja = 10;
        } else if (totalBelanja > 100000) {
            diskonBelanja = 5;
        }

        // Total diskon
        double totalDiskon = diskonBelanja + diskonMember;
        double potongan = totalBelanja * (totalDiskon / 100);
        double totalBayar = totalBelanja - potongan;

        // Output struk
        System.out.println("================================");
        System.out.println("        STRUK 7ELEVEN          ");
        System.out.println("================================");
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("No HP         : " + noHP);
        System.out.println("--------------------------------");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : " + totalDiskon + "%");
        System.out.println("Potongan      : Rp " + potongan);
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("================================");

        input.close();
    }
}