package data.algorithms.chapter1.reinforcement;

import java.time.LocalDate;

public class R_1_3 {

    /*
     * Modify the CreditCard class from Code Fragment 1.5
     * to charge a late fee for any payment that is past its due date.
     *
     */
    //Refer to CreditCard class for code change
    public boolean checkLatePayment() {
        //store current date
        LocalDate now = LocalDate.now();

        //store dueDate
        LocalDate dueDate = now.minusDays(2);

        //check if current date is after due date
        if (now.isAfter(dueDate)) {
            //charge late fee if yes
            System.out.println("Payment is late");
            return true;
        } {
            //no late fee if not
            System.out.println("You will not be charged a late fee");
            return false;
        }
    }
}
