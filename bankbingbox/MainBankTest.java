public class MainBankTest {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Kasus Valid ===");
        BankAccount acc1 = new BankAccount("REK-001", "Budi Jatlei", 600000000);
        System.out.println("Akun 1 berhasil dibuat: " + acc1.getOwnerName() + " | Saldo: " + String.format("%,.0f", acc1.getBalance()));

        BankAccount acc2 = new BankAccount("REK-002", "Siti Aminah");
        System.out.println("Akun 2 berhasil dibuat (overloaded constructor): " + acc2.getOwnerName() + " | Saldo: " + String.format("%,.0f", acc2.getBalance()));

        // acc1.balance = -1000000;

        System.out.println("\n-- Tes deposit --");
        acc1.deposit(500000);
        acc1.deposit(-1000);

        System.out.println("\n-- Tes penarikan melebihi saldo --");
        acc2.withdraw(999999999);

        System.out.println("\n-- Tes pembuatan akun dengan saldo negatif --");
        try {
            new BankAccount("REK-003", "Andi", -50000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): " + e.getMessage());
        }

        System.out.println("\n-- Tes pembuatan akun dengan nama null --");
        try {
            new BankAccount("REK-004", null, 100000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): " + e.getMessage());
        }
    }
}
