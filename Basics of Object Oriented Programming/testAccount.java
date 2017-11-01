
public class testAccount {
    public static void main(String args[]){

        // Create a new class for a bank account.
        // Create fields for the account number, balance, customer name, email, and phone number.
        // Create getters and setter for each.
        // Create two additional methods.
        // 1. To allow the customer to deposit funds (this would increment the balance field).
        // 2. To allow the customer to withdraw funds. (this should deduct from the balance field,
        // but not allow the withdrawal to complete if the balance is not sufficient.
        // You will want to create various code in the main class to conform your code is working.
        // add some System.out.println's in the two methods above as well.

        // Account myAccount = new Account();
        // myAccount.setNumber("1234");
        // myAccount.setBalance(0.00);
        // myAccount.setCustomerName("Nazir");
        // myAccount.setCustomerEmailAddress("example@yahoo.com");
        // myAccount.setCustomerPhoneNumber("(018) 123-4567");

        // myAccount.deposit(200);
        // myAccount.withdrawl(100.0);


        Account myAccount = new Account("12345", 0.00, "John", "example@yahoo.com", "(018) 123-4567");
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());
        myAccount.deposit(200);
        myAccount.withdrawl(100.0);

        Account timsAccount = new Account("Tim", "Tim@email.com","12345678");

        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());


        vipCustomer vip1 = new vipCustomer();
        System.out.println(vip1.getName());

        vipCustomer vip2 = new vipCustomer("Bob", 25000.0);
        System.out.println(vip2.getName());

        vipCustomer vip3 = new vipCustomer("Tim", 100.0, "tim@email.com");
        System.out.println(vip3.getEmailAddress());


    }
}
