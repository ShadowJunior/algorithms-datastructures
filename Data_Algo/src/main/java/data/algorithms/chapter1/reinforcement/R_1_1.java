package data.algorithms.chapter1.reinforcement;

public class R_1_1 {

    /*
    Suppose that we create an array A of GameEntry objects,
     which has an integer scores field,
      and we clone A and store the result in an array B.
       If we then immediately set A [4].score equal to 550,
        what is the score value of the GameEntry object referenced by B[4]?
     */
    public static void main(String[] args) {
        int[] A = new int[10]; // creates an array with default values
        int[] B;
        B = A.clone(); // clones default values (different reference obj
        A[4] = 550;  //set value at index 4

        System.out.println("Value of B at index 4" + B[4]); // 0 the default value b/c  diff ref
        System.out.println("Value of A at index 4" + A[4]); // 550 new value

    }
}
