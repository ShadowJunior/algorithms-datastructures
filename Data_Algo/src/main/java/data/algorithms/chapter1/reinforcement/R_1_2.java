package data.algorithms.chapter1.reinforcement;

import java.time.LocalDate;

public class R_1_2 {
    /*
    Modify the CreditCard class from Code Fragment 1.5
    to charge interest on each payment.
     */

    //Refer to CreditCard class for code change

    // constants
    final double TIME = 12;
    //instance variables



    // r1.2
    public  double chargeInterest() {
        double chargedInterest = 0.0;
        /*Formula: Simple Interest = (P * R * T)/100 -> divide rate by 100 to get decimal version of percent
            P = Principal Amount (amount/balance),
             R = Rate (interest),
              T = time (interest period, usually per month)
        */
        //Algorithm
        /*
            1. Define principal,interest, time
            2. Apply formula
            3. Charge interest
         */
//        double interestRate = (limit * rate * time)/100;
        //1
        double principalAmount = 1000;
        double annualInterestRate = 10.0;
        double monthlyInterestRate = annualInterestRate / 12;

        chargedInterest = (principalAmount * monthlyInterestRate );

        return chargedInterest;
    }


}
