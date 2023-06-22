package data.algorithms.chapter1;

public class Example {
    public static void main(String[] args) {
        Counter c; //declare a variable of type Counter

        //create new Counter object, returns reference to it
        Counter d = new Counter();

        c = new Counter();

        d = c;
    }
}
