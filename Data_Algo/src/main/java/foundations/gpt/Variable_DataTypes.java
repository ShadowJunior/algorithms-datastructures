package foundations.gpt;

import java.util.Scanner;

public class Variable_DataTypes {
    /**
     * Variables and Data Types:
     *
     * Exercise 1: Write a program that prompts the user to enter two numbers,
     * adds them together, and displays the result.
     * Exercise 2: Create a program that calculates the area of a circle given its radius.
     * Display the result to the user.
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        //Exercise 1
        addTwoNumbers();

        //Ex 2
        calculateCircleArea();

    }

    public static void addTwoNumbers() {
        System.out.println("Enter 2 numbers to add in the console below: ");

        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.printf("User entered: %d and  %d\n",num1, num2 );
        System.out.printf("The result of your input is %d", num1 + num2);
    }

    public static void calculateCircleArea() {
        //formula: A = PI * radius^2
        System.out.println("\nEnter a radius value to calculate: ");
        int radius = input.nextInt();
        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of a circle with a radius of %d is %.2f\n", radius, area);

    }
}
