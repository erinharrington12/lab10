import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon
{
    /**
     * 
     * @param pointUL   The start point of the first line defining the PolyLine
     *                  (parallelogram).
     * @param pointUR   The end point of the first line defining the PolyLine
     *                  (parallelogram).
     * @param thickness The number of pixels below the first line that the second
     *                  line appears. Note that if a negativevalue is given, the
     *                  second line will be above the first line.
     * @param color     The color of the PolyLine.
     * @param fill      Whether or not the PolyLine is filled.
     */
    public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean fill)
    {
        super(color, fill);

        location = new Point[4];

        location[0] = pointUL;
        location[1] = pointUR;
        location[2] = new Point(pointUR.x, pointUR.y + thickness);
        location[3] = new Point(pointUL.x, pointUL.y + thickness);
    }
}
