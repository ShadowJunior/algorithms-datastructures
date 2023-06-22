package data.algorithms.chapter1;

public class Counter {
    protected int count; //simple integer instance variable

    /**
     * Default constructor for a Counter object
     */
    Counter() { count = 0;}

    /**
     * An accessor method to get the current count
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * Modifier method for incrementing the count
     */
    public void incrementCount() {
        count++;
    }

    /**
     * Modifier method for decrementing the count
     */
    public void decrementCount() {
        count--;
    }


}
