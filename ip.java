import java.util.Scanner;

public class ip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah mata kuliah
        System.out.print("Jumlah Mata Kuliah : ");
        int jumlahMK = input.nextInt();

        double totalBobot = 0;
        int totalSKS = 0;

        // Input nilai & SKS tiap MK
        for (int i = 1; i <= jumlahMK; i++) {
            System.out.print("SKS MK ke-" + i + "    : ");
            int sks = input.nextInt();

            System.out.print("Nilai MK ke-" + i + "  : ");
            double nilai = input.nextDouble();

            totalBobot += nilai * sks;
            totalSKS += sks;
        }

        // Hitung IP
        double ip = totalBobot / totalSKS;

        // Tentukan maks SKS
        int maksSKS;
        if (ip >= 3.50) {
            maksSKS = 24;
        } else if (ip >= 3.00) {
            maksSKS = 22;
        } else if (ip >= 2.00) {
            maksSKS = 20;
        } else {
            maksSKS = 18;
        }

        // Output
        System.out.println("================================");
        System.out.println("IP Semester    : " + ip);
        System.out.println("Maks SKS       : " + maksSKS + " SKS");
        System.out.println("================================");

        input.close();
    }
}
