package data.algorithms.chapter1.reinforcement;

/**
 * Write a short Java function that takes an integer n
 * and returns the sum of all the odd integers smaller than n.
 */
public class R_1_11 {
    public static void main(String[] args) {
        System.out.println(recursiveOdd(3));
        System.out.println(recursiveOdd(6));
        System.out.println(recursiveOdd(11));
        System.out.println(recursiveOdd(10));
        System.out.println(recursiveOdd(13));

    }

    static int recursiveOdd(int n) {
        int sum = 0; // placeholder for odd sums

        //start the index at 1 to consider only odd numbers
        //keep check at less than to exclude n value
        //increment by 2 for odd count continuation
        for (int i = 1; i < n; i+=2) {
            sum+=i; // add i to sum since it's increasing by odd numbers
        }
        return sum;
    }
}
