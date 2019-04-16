import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon
{

    /**
     * 
     * @param pointUL Upper left corner of the rectangle
     * @param width   width of the rectangle
     * @param height  height of the rectangle
     * @param color   Desired color of the rectangle
     * @param filled  Whether or not the rectangle should be filled
     */
    public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
    {
        super(color, filled);

        location = new Point[4];

        

        // Assemble 4 points
        location[0] = pointUL; // Upper left corner
        location[1] = new Point(pointUL.x + width, pointUL.y); // Upper right corner
        location[2] = new Point(pointUL.x, pointUL.y - height); // Lower left corner
        location[3] = new Point(location[1].x, location[1].y - height); // Lower right corner

    }
}
