package data.algorithms.chapter1;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        CreditCard wallet[] = new CreditCard[3];
        LocalDate testDueDate = LocalDate.now().minusDays(3);

        wallet[0] = new CreditCard("5391 0375 9387 5309",
                "John Bowman", "California Savings",
                0.0, 1000, 0.18, testDueDate, 10.00);

        wallet[1] = new CreditCard("3485 0399 3395 1954",
                "Andy Bowman", "California Federal",
                0.0, 3500,0.18, LocalDate.now(), 10.00);

        wallet[2] = new CreditCard("6011 4902 3294 2994",
                "Eric Bowman", "California Finance",
                0.0, 5000,0.18, LocalDate.now(), 10.00);

        for (int i = 1; i <= 45; i++) {
            wallet[0].chargeIt((double) i);
            wallet[1].chargeIt(2.0 * i); //implicit cast
            wallet[2].chargeIt((double) 3 * i); //explicit cast
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            CreditCard.printCard(wallet[i]);
            while (wallet[i].getBalance() > 100.0) {
                wallet[i].makePayment(100.0);
                System.out.printf("New balance = %.2f\n", wallet[i].getBalance());
            }
        }
    }
}
