class InsufficientBalanceException extends java.lang.Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 6000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}