package data.algorithms.chapter1.reinforcement;

/**
 * Write a short Java function that takes an integer n
 * and returns the sum of all the integers smaller than n.
 */
public class R_1_10 {
    public static void main(String[] args) {
        System.out.println(recursiveSum(2));
        System.out.println(recursiveSum(5));

    }

    static int recursiveSum(int n) {
        if (n == 0)
            return n;
        return n + recursiveSum(n - 1);
    }


}
