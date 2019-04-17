import java.awt.Color;
import java.awt.Point;

/**
 * 
 * @author Erin Harrington
 *
 */
public class RightTriangle extends Triangle
{
    /**
     * 
     * @param pointRA The vertex of the right triangle that has the right angle.
     * @param base    The width of the base. Positive widths correspond to 2nd
     *                vertex being to the rightof this vertex; negative widths
     *                correspond to the 2nd vertex being to the left.
     * @param height  The height at the apex of the triangle. Positive heights
     *                correspond to the vertexbeing placed below the base; negative
     *                heights correspond to the vertex beingplaced above the base.
     * @param color Desired color of the triangle.
     * @param fill Whether or not the triangle should be filled.
     */
    public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill)
    {
        super(pointRA, color, fill);

        // Determines the position of the points based on the sign of the height
        if (height > 0)
        {
            location[1] = new Point(pointRA.x, pointRA.y - height); // Highest point
            location[2] = new Point(pointRA.x + base, pointRA.y); // Base point
        }
        else if (height < 0)
        {
            location[1] = new Point(pointRA.x, pointRA.y + (-height));
            location[2] = new Point(pointRA.x + base, pointRA.y);
        }

    }
}
