package pertemuan14;

public class BankAccount {
	private final String accountNumber; // Nomor rekening yang unik
    private double balance; // Saldo rekening
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
