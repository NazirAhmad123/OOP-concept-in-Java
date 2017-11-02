package Section_04_tuts;

public class TestAccount {
    public static void main(String args[]){


        Account myaccount = new Account("BC123",100.0,"Ali","ali@email.com","(123) 45678");

        System.out.println(myaccount.getCustomerName());
        myaccount.deposit(500);
        myaccount.withdrawal(400);
//        myaccount.deposit(1000.0);
//        myaccount.withdrawal(500);
//        myaccount.withdrawal(600);
//        myaccount.setCustomerName("Ali");
//        myaccount.setCustomerEmailAddress("Ali@emial.com");
//        myaccount.setCustomerPhoneNumber("(123) 456789");
//
//        System.out.println(myaccount.getCustomerName());
//        System.out.println(myaccount.getCustomerEmailAddress());
//        System.out.println(myaccount.getCustomerPhoneNumber());

    }
}
