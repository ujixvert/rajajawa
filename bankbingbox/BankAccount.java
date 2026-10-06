public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor rekening tidak boleh null atau kosong.");
        }
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama pemilik tidak boleh null atau kosong.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh kurang dari 0.");
        } else {
            this.balance = initialBalance;
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public BankAccount(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0.0);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setoran berhasil. Saldo saat ini: " + String.format("%,.0f", this.balance));
        } else {
            System.out.println("Gagal. Setoran harus lebih besar dari 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Gagal. Penarikan harus lebih besar dari 0.");
        } else if (amount > this.balance) {
            System.out.println("Gagal. Saldo tidak mencukupi.");
        } else {
            this.balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + String.format("%,.0f", this.balance));
        }
    }
}
