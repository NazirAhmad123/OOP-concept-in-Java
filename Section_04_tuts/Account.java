package Section_04_tuts;

public class Account {

    // account number, balance, customer name, email, and phone number.
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    Account(){
        //("nn"100,"name","email","ph");
    }
    Account(String newNumber, double newBalance, String newCustomerName,
            String newCustomerEmailAddress, String newCustomerPhoneNumber) {
        this.number = newNumber;
        this.balance = newBalance;
        this.customerName = newCustomerName;
        this.customerEmailAddress = newCustomerEmailAddress;
        this.customerPhoneNumber = newCustomerPhoneNumber;
    }

    public void deposit(double newAmount) {
        balance += newAmount;
        System.out.println("A deposit of " + newAmount + " was made." +
                " The new balance is " + balance);
    }

    public void withdrawal(double newWithdrawalAmount) {
        if (balance - newWithdrawalAmount <= 0) {
            System.out.println("Only " + balance + " is available. Can't do the transaction");
        } else {
            balance -= newWithdrawalAmount;
            System.out.println("A withdrawal of " + newWithdrawalAmount + " was made." +
                    " The remaining balance is " + balance);
        }
    }

    public String getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}
