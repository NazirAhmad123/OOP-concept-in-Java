public class vipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipCustomer(){
        this("John",0.00,"john@email.com");
    }

    public vipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }
    // The first two constructor call the third constructor.
    // The third constructor is the one that saves all the fields.
    // so we use that constructor each time we need it.
    public vipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
