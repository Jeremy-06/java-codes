import java.util.Scanner;

public class day24 {
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
    static class BankAccount {
        private double accountBalance;

        BankAccount(double accountBalance) {
            this.accountBalance = accountBalance;
        }

        public double getAccountBalance() { return accountBalance; }

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
        public void setWithdraw(double Withdraw) throws InsufficientFundsException {
            if (Withdraw <= accountBalance) {
                accountBalance -= Withdraw;
            } else {
                throw new InsufficientFundsException("Insufficient funds.");
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

        BankAccount bankAccount = new BankAccount(0);
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
                    try {
                        bankAccount.setWithdraw(Withdraw);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Exception thrown: " + e.getMessage());
                    } 
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
                    System.out.println("Invalid choice!!!");
                    break;
            }
        } while (!exit);
        scan.close();
    }
}
