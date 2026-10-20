import java.util.ArrayList;
import java.util.List;

public class MainSistemEkspedisi {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("  SISTEM OPERASIONAL EXPEDITION - FASTSPEED EXPRESS");
        
         System.out.println();
        List<Armada> daftarArmada = new ArrayList<>();
        daftarArmada.add(new MotorExpress("KT 2207 CAC", "Supra X 125", 50, true));
        daftarArmada.add(new MobilBox("B 666 SAT", "Daihatsu Gran Max", 2000, 6));
        daftarArmada.add(new DronePengirim("DR0N3", "DJI Air 3S", 5, 120));
        System.out.println("REKAP BIAYA OPERASIONAL ARMADA");
        double totalBiayaOperasional = 0;
        for (Armada a : daftarArmada) {
            a.tampilkanInfoArmada();
            totalBiayaOperasional += a.hitungBiayaOperasional();
            System.out.println();
        }
        System.out.println("TOTAL OPERASIONAL ARMADA/HARI: Rp " + String.format("%,.2f", totalBiayaOperasional));

        System.out.println();

        List<Kurir> daftarKurir = new ArrayList<>();
        daftarKurir.add(new KurirTetap("EXP-001", "Haland", 120, 3500000, 5000));
        daftarKurir.add(new KurirMitra("SPX-501", "Mbappe", 85, 12000));

        System.out.println("DAFTAR GAJI & KAPABILITAS KURIR");
        for (Kurir k : daftarKurir) {
            k.tampilkanProfil();
            System.out.println();

            System.out.println("\n[UJI HAK AKSES & DYNAMIC CASTING]");

            if (k instanceof AksesSistem) {
                AksesSistem akun = (AksesSistem) k;
                akun.login(k.getIdKurir(), "password123");
            } else {
                System.out.println("Info: Kurir " + k.getNama() + " TIDAK MEMILIKI akses login dashboard.");
            }

            if (k instanceof PresensiDigital) {
                PresensiDigital presensi = (PresensiDigital) k;
                presensi.rekamKehadiran();
            }

            System.out.println();
        }
    }
}
