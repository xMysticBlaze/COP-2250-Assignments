public class Accounttest {
    public static void main(String[] args) {
        // Create an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        // Use the withdraw method to withdraw $2,500
        account.withdraw(2500);

        // Use the deposit method to deposit $3,000
        account.deposit(3000);

        // Print the balance, monthly interest, and the date when this account was created
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterest());
        System.out.println("This account was created at " + account.getDateCreated());
    }
}
