package data.algorithms.chapter1;

public class CreditCard {

    //instance variables
    private String number;
    private String name;

    private String bank;

    private double balance;

    private int limit;

    //constructor
    CreditCard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    //accessor methods
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    //Action methods:
    public boolean chargeIt(double price) { //Make a charge
        if (price + balance > (double) limit)
            return false; // there is not enough money left to charge it
        balance += price;
        return true; // The charge goes through in this case
    }

    public void makePayment(double payment) { //Make a payment
        balance -= payment + chargeInterest(getLimit(),12.0, 1); // added interest
    }

    //R_1_2
    public double chargeInterest(int limit, double rate, int time ) {
        /*Formula: Simple Interest = (P * R * T)/100
            P = Principal Amount, R = Rate, T = time
        */
        //Algorithm
        /*
            1. Define principal,interest, time
            2. Apply formula
            3. Charge interest
         */
        double interestRate = (limit * rate * time)/100;
        return interestRate;
    }

    public static void printCard(CreditCard c) { //print card info
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); //implicit cast
        System.out.println("Limit = " + c.getLimit()); // implicit cast
    }
}
