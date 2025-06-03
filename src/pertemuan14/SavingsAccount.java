package pertemuan14;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }
    // Ini akan menyebabkan error karena displayAccountInfo() adalah method final
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("This method cannot be overridden.");
    }
    */
}
