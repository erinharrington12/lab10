import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest
{
    
    //Set up
    
    private Circle c1 = new Circle(new Point(200, 300), 60, Color.BLUE, true);
    private Circle c2 = new Circle(new Point(200, 300), 75, Color.RED, false);

    @Test
    public void testCircle()
    {
        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c2.getLocation().length);

        Assert.assertEquals("Incorrect location for the Circle", new Point(200, 300), c1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Circle", new Point(200, 300), c2.getLocation()[0]);
        
        Assert.assertEquals("Incorrect color for the Circle", Color.BLUE, c1.getColor());
        Assert.assertEquals("Incorrect color for the Circle", Color.RED, c2.getColor());
        
        Assert.assertTrue("Incorrect flag for filled for the Circle", c1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Circle", c2.isFilled());
        
        
    }

    @Test
    public void testGetDiameter()
    {
        
        Assert.assertEquals("Incorrect diameter for the Cirlce", 60, c1.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 60, c1.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 60, c1.getDiameter2());
        
        Assert.assertEquals("Incorrect diameter for the Circle", 75, c2.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 75, c2.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 75, c2.getDiameter2());
    }

}
