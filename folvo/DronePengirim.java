public class DronePengirim extends Armada {
    private int batasKetinggianMaksimal;

    public DronePengirim(String noPlat, String merk, int kapasitasKg, int batasKetinggianMaksimal) {
        super(noPlat, merk, kapasitasKg);
        this.batasKetinggianMaksimal = batasKetinggianMaksimal;
    }

    @Override
    public double hitungBiayaOperasional() {
        return (kapasitasKg * 10000) + 50000;
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("DRONE PENGIRIM");
        System.out.println("No. Registrasi  : " + noPlat);
        System.out.println("Merk            : " + merk);
        System.out.println("Kapasitas       : " + kapasitasKg + " kg");
        System.out.println("Batas Ketinggian: " + batasKetinggianMaksimal + " meter");
        System.out.println("Estimasi Biaya/Hari: Rp " + String.format("%,.2f", hitungBiayaOperasional()));
    }
}
    