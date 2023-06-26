package data.algorithms.chapter1;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class CreditCard {

    //instance variables
    private String number;
    private String name;

    private String bank;

    private double balance;

    private int limit;

    //R_1_2
    private double annualInterestRate;

    //R_1_3
    private LocalDate dueDate;
    private double lateFee;



    //constructor
    CreditCard(String no, String nm, String bk, double bal, int lim, double apr,
               LocalDate date, double fee) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
        annualInterestRate = apr;
        dueDate = date;
        lateFee = fee;
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //Action methods:
    public boolean chargeIt(double price) { //Make a charge
        if (price + balance > (double) limit) {
            System.out.println("YOU WENT OVER THE LIMIT " + getName() + " " + (price + balance)); //R_1.5
            System.out.println();
            return false; // there is not enough money left to charge it
        } else {
            balance += price;
            return true; // The charge goes through in this case
        }
    }

    public void makePayment(double payment) { //Make a payment

        //deduct payment amount from balance
        balance -= payment;
        chargeInterest(); // charge interest on balance when payment is made
        checkLatePayment(); // charge late fee if payment is late
    }

    //R_1_2
    public void chargeInterest() {
        //formatted the interest rate for cleaner look
        DecimalFormat df = new DecimalFormat("0.000");
        double monthlyInterestRate = Double.parseDouble(df.format(annualInterestRate / 12));
//        System.out.println("Monthly interest rate " + monthlyInterestRate);

        //calculate the interest that will be added
        double interest = balance * monthlyInterestRate;

        //add the interest
        balance += interest;

        //side effects
//        System.out.printf("Your interest is: %.2f", interest);
//        System.out.println();
//        System.out.printf("Your new balance is: %.2f\n", balance);
    }

    //R_1_3
    public void checkLatePayment() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(dueDate) && balance > 0) {
//            System.out.println("Payment is late, adding late fee");
            balance += lateFee;
        }
    }

    //modifier methods R_1.4
    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }


    //print card details
    public static void printCard(CreditCard c) { //print card info
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.printf("Balance = %.2f", c.getBalance()); //implicit cast
        System.out.println();
        System.out.println("Limit = " + c.getLimit()); // implicit cast
        System.out.println("Annual interest = " + c.getAnnualInterestRate());
        System.out.println("Balance history: ");
    }
}
