package foundations.gpt;

import java.util.Scanner;

public class ControlFlow {
    /**
     * Control Flow:
     *
     * Exercise 1: Write a program that takes an integer as input and determines whether it is positive,
     * negative, or zero.
     * Exercise 2: Create a program that asks the user for their age and determines if
     * they are eligible to vote (considering the legal voting age in your country).
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        //Ex: 1
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        isPositiveOrNegativeOrZero(num);

        // Ex: 2
        System.out.println("How old are you: ");
        int age = input.nextInt();
        canVote(age);
    }

    public static void isPositiveOrNegativeOrZero(int num) {
        if (num == 0) {
            System.out.println(0);
        } else {
          String charge =  num > 0 ? "Positive" : "Negative";
            System.out.printf("The number %d is " + charge, num);
            System.out.println();

        }
    }

    public static void canVote(int age) {
     String voteEligibility =   age >= 18
             ? "Yes, you are eligible to vote"
             : "No, you are too young to vote";

        System.out.println(voteEligibility);
    }
}
