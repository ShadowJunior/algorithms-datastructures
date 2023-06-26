package foundations.gpt;

public class MethodsAndFunctions {
    /**
     * Methods and Functions:
     *
     * Exercise 1: Write a method that takes two integers as parameters and returns their sum.
     * Exercise 2: Create a function that calculates the factorial of a given number recursively.
     *
     */

    public static int sumTwoNums(int a, int b) {
        return a + b;
    }

    //factorial using loop, factorial is n(n-1)
    public static void factorialNumLoop() {

        int num = 5; // decide the num you want factorial
        int base = 1; // start with base number

        /*
            as you loop fact will be
            multiplied by the index
            up until the factorial number
         */
        for (int i = 1; i <= num; i++) {
            base *=i;

        }
        System.out.printf("The factorial of %d is %d", num, base);
    }

     static int recursiveFactorial(int n) {

        if (n == 0 ){
            return 1;
        } else {
            System.out.println(n);
            /*
                algo
                4 * fn(4-1), n = 3 for next input
                fn(3-1), n = 2
                fn(2-1), n = 1
                fn(1-1), n = 0
                4 * 3 * 2 * 1 = 24
             */
            return (n * recursiveFactorial(n-1));
        }

    }
    public static void main(String...a) {
//        factorialNumLoop();
        System.out.println(recursiveFactorial(4));

    }
}
