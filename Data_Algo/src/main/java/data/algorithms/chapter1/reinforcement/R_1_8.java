package data.algorithms.chapter1.reinforcement;

/**
 * Write a short Java function, isMultiple,
 * that takes two long values, n and m, and
 * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class R_1_8 {

    public static void main(String...args) {
        isMultiple(21L, 7L);
        isMultiple(20L, 4L);
        isMultiple(25L, 6L);
    }

    static boolean isMultiple(long n, long m) {
        if (n % m == 0) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
