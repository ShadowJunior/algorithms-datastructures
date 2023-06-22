package data.algorithms.chapter1;

public class DatTripper {
    public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};

    public static void main(String[] args) {
        Day d = Day.MON;
        System.out.println("Initially d is " + d);
        d = Day.WED;
        System.out.println("Then it is " + d);
        Day t = Day.valueOf("WED");
        System.out.println("I say d and t are the same: " + (d == t));


        switch (d) {
            case MON:
                System.out.println("This is tough.");
                break;
            case TUE:
                System.out.println("This is getting better.");
                break;
            case WED:
                System.out.println("Half way there.");
                break;
            case THU:
                System.out.println("I can see the light.");
                break;
            case FRI:
                System.out.println("Now we are talking.");
                break;
            default:
                System.out.println("Day off!");
                break;
        }
    }
}
