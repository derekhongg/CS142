// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
  String name;
  double balance;
  double transactionFee;

  public void deposit(double amount) {
      balance = balance + amount;
  }

  public void withdraw(double amount) {
      double totalWithdrawal = amount + transactionFee;
      if(totalWithdrawal <= balance) {
          balance = balance - totalWithdrawal;
      }
  }

  public String toString() {
      return name + ", $" + String.format("%.2f", balance);
  }

  public void transfer (BankAccount otherAccount, double amount) {
      if(amount > 0 && balance >= 5.00) {
          double transferAmount = amount + 5.00;
          if(transferAmount > balance) {
              transferAmount = balance;
          }
          balance -= transferAmount;
          otherAccount.balance += amount;
      }
  }
}
