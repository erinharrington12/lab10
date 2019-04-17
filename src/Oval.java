import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 
 * @author Erin Harrington
 *
 */
public class Oval extends Shape
{
    private int diameter1;
    private int diameter2;

    /**
     * 
     * @param pointUL Upper left corner of the bounding box
     * @param d1      Diameter from left to right
     * @param d2      Diameter from top to bottom
     * @param color   Desired color of the oval
     * @param filled  Whether or not the oval should be filled
     */
    public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
    {
        super(color, filled);

        location = new Point[1];
        location[0] = pointUL;

        diameter1 = d1;
        diameter2 = d2;

    }

    /**
     * 
     * @return diameter left to right
     */
    public int getDiameter1()
    {
        return diameter1;
    }

    /**
     * 
     * @return diameter top to bottom
     */
    public int getDiameter2()
    {
        return diameter2;
    }

    /**
     * Draw Oval
     */
    public void draw(Graphics graphics)
    {
        graphics.setColor(this.getColor());
        graphics.fillOval((int) location[0].getX(), (int) location[0].getY(), diameter1, diameter2);

    }
}
