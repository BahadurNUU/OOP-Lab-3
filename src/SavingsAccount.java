public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public double calculateMonthlyInterest() {
        double res = this.savingsBalance * annualInterestRate / 12;
        this.savingsBalance = res;
        return res;
    }

    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }

}
