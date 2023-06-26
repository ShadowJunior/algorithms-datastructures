package data.algorithms.chapter1.reinforcement;

import java.util.Scanner;

/**
 * Write a short Java function, inputAllBaseTypes,
 * that inputs a different value of each base type from the standard input device
 * and prints it back to the standard output device.
 */
public class R_1_6 {

    public static void main(String...args) {
       inputAllBaseTypes();

    }
    static void inputAllBaseTypes() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a boolean: ");
        System.out.println("boolean: " + input.nextBoolean());
        System.out.println("Enter a char: ");
        System.out.println("char: " + input.next());
        System.out.println("Enter a byte: ");
        System.out.println("byte: " + input.nextByte());
        System.out.println("Enter a short: ");
        System.out.println("short: " + input.nextShort());
        System.out.println("Enter a int: ");
        System.out.println("int: " + input.nextInt());
        System.out.println("Enter a long: ");
        System.out.println("long: " + input.nextLong());
        System.out.println("Enter a float: ");
        System.out.println("float: " + input.nextFloat());
        System.out.println("Enter a double: ");
        System.out.println("double: " + input.nextDouble());

    }
}
