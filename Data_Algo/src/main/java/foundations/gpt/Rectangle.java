package foundations.gpt;

public class Rectangle {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public int calculatePerimeter(int length, int width) {
        return (length * 2) + (width * 2);
    }

    public static void main(String... args) {
        Rectangle rec = new Rectangle(4,2);
        System.out.println("Area: " + rec.calculateArea(rec.length, rec.width));
        System.out.println("Perimeter: " + rec.calculatePerimeter(rec.length, rec.width));
    }
}
