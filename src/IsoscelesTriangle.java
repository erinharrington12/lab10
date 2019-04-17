import java.awt.Color;
import java.awt.Point;
/**
 * 
 * @author Erin Harrington
 *
 */
public class IsoscelesTriangle extends Triangle
{
    /**
     * 
     * @param pointLB The point on the base of an isosceles triangle that is NOT the right angle
     * @param base The width of the base.
     * @param height The height at the apex of the triangle (negative to flip the orientation).
     * @param color Desired color of the triangle.
     * @param fill Whether or not the triangle should be filled.
     */
    public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill)
    {
        super(pointLB, color, fill);
        
     // Determines the position of the points based on the sign of the height
        if (height > 0)
        {
            location[1] = new Point(pointLB.x + (base/2), pointLB.y + height); // Highest point
            location[2] = new Point(pointLB.x + base, pointLB.y); // Base point
        }
        else if (height < 0)
        {
            location[1] = new Point(pointLB.x + (base/2), pointLB.y + height); //Highest point
            location[2] = new Point(pointLB.x + base, pointLB.y); // Base point
        }
    }
}
