import java.util.Scanner;

public class day15 {
    static class BankAccount {
        private double accountBalance;
        private double Deposit;
        private double Withdraw;

        BankAccount(double accountBalance, double Deposit, double Withdraw) {
            this.accountBalance = accountBalance;
            this.Deposit = Deposit;
            this.Withdraw = Withdraw;
        }

        public double getAccountBalance() { return accountBalance; }
        public double getDeposit() { return Deposit; }
        public double getWithdraw() { return Withdraw; }

        public void setAccountBalance(double accountBalance) {
            this.accountBalance = accountBalance;
        }
        public void setDeposit(double Deposit) {
            if (Deposit > 0) {
                accountBalance += Deposit;
            } else {
                System.out.println("Deposit amount must greater than zero");
            }
        }
        public void setWithdraw(double Withdraw) {
            if (Withdraw < accountBalance) {
                accountBalance -= Withdraw;
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        
    }
    public static void Menu() {
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Account Balance");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount(0, 0, 0);
        System.out.println("\nSimple Bank Account");
        boolean exit = false;
        do{
            Menu();
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nDeposit\n");
                    System.out.print("Enter amount: ");
                    double Deposit = scan.nextDouble();
                    bankAccount.setDeposit(Deposit);
                    System.out.println("Current balance: " + bankAccount.getAccountBalance());
                    break;
                case 2:
                    System.out.println("\nWithdraw\n");
                    System.out.print("Enter amount: ");
                    double Withdraw = scan.nextDouble();
                    bankAccount.setWithdraw(Withdraw);
                    System.out.println("Current balance: " + bankAccount.getAccountBalance());
                    break;
                case 3:
                    System.out.println("\nCurrent balance: " + bankAccount.getAccountBalance());
                    break;
                case 4:
                    System.out.println("Thanks, lodi!!!\n");
                    exit = true;
                    break;
                default:
                    break;
            }
        } while (!exit);
        scan.close();
    }
}
