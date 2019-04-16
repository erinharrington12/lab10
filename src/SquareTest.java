import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest
{

    @Test
    public void testSquare()
    {
        Square sq1 = new Square(new Point(100, 100), 50, Color.BLACK, true);

        Point upperLeft1 = new Point(100, 100);
        Point upperRight1 = new Point(150, 100);
        Point lowerLeft1 = new Point(100, 50);
        Point lowerRight1 = new Point(150, 50);

        // Test if the points are there

        Point[] pts1 = sq1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperLeft1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperRight1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerLeft1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerRight1));

        // Verify if the rectangle is properly filled
        Assert.assertTrue(sq1.isFilled());

        // Verify if the diamond has the right color

        Color s1 = sq1.getColor();
        Assert.assertEquals(Color.BLACK, s1);
    }

}
