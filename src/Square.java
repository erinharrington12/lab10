import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle
{

    /**
     * 
     * @param pointUL Upper left corner of the square
     * @param width Width (and height) of the square
     * @param color Desired color for the square
     * @param filled True if the square should be filled solid
     */
    public Square(Point pointUL, int width, Color color, boolean filled) {
        super(pointUL, width, width, color, filled);
       
    }
}
