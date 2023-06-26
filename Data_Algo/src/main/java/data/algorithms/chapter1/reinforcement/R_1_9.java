package data.algorithms.chapter1.reinforcement;

/**
 * Write a short Java function, isOdd,
 * that takes an int i and returns true if and only if i is odd.
 * Your function cannot use the multiplication, modulus, or division operators, however.
 */
public class R_1_9 {

    public static void main(String...args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(5));
        System.out.println(isOdd(10));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
