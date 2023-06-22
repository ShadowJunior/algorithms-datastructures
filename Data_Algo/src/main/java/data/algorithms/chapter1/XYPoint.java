package data.algorithms.chapter1;

/**
 * This class defines an immutable (x,y) point in the plane.
 *
 * @author juniorjoseph
 */
public class XYPoint {
    private double x,y;

    /**
     * Construct an (x,y) point at a specified location
     * @param xCoor The x-coordinate of the point
     * @param yCoor the y-coordinate of a point
     */
    public XYPoint(double xCoor, double yCoor) {
        x = xCoor;
        y = yCoor;
    }

    /**
     * Return x coordinate value
     * @return x-coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Return y coordinate value
     * @return y-coordinate
     */
    public double getY() {
        return y;
    }
}
