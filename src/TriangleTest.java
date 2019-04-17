import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest
{

   

    @Test
    public void testRightTriangle()
    {
        RightTriangle rt1 = new RightTriangle(new Point(100, 100), 50, 50, Color.BLACK, true);
        Point starterPoint1 = new Point(100, 100);
        Point topPoint1 = new Point(100, 50);
        Point basePoint1 = new Point(150, 100);
        
        
        RightTriangle rt2 = new RightTriangle(new Point(100, 100), 50, -50, Color.CYAN, true);
        Point starterPoint2 = new Point(100, 100);
        Point topPoint2 = new Point(100, 150);
        Point basePoint2 = new Point(150, 100);
        
        
        RightTriangle rt3 = new RightTriangle(new Point(100, 100), 50, 50, Color.BLACK, false);
        Point starterPoint3 = new Point(100, 100);
        Point topPoint3 = new Point(100, 50);
        Point basePoint3 = new Point(150, 100);
        
        RightTriangle rt4 = new RightTriangle(new Point(100, 100), 50, -50, Color.CYAN, false);
        Point starterPoint4 = new Point(100, 100);
        Point topPoint4 = new Point(100, 150);
        Point basePoint4 = new Point(150, 100);
        
        //Test to see if all points are present
        Point[] pts1 = rt1.getLocation();
        Assert.assertEquals(3, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, starterPoint1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, topPoint1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, basePoint1));
        
        Point[] pts2 = rt2.getLocation();
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, starterPoint2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, topPoint2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, basePoint2));
        
        //Check if right triangle is filled
        Assert.assertTrue(rt1.isFilled());
        Assert.assertTrue(rt2.isFilled());
        Assert.assertFalse(rt3.isFilled());
        Assert.assertFalse(rt4.isFilled());
        
        //Check if right triangle has correct color
        Color rect1 = rt1.getColor();
        Color rect2 = rt2.getColor();
        Assert.assertEquals(Color.BLACK, rect1);
        Assert.assertEquals(Color.CYAN, rect2);
        
        
    }
    
    @Test
    public void testIsoTriangle()
    {
        IsoscelesTriangle rt1 = new IsoscelesTriangle(new Point(100, 100), 50, 50, Color.BLACK, true);
        Point starterPoint1 = new Point(100, 100);
        Point topPoint1 = new Point(125, 150);
        Point basePoint1 = new Point(150, 100);
        
        
        IsoscelesTriangle rt2 = new IsoscelesTriangle(new Point(100, 100), 50, -50, Color.CYAN, true);
        Point starterPoint2 = new Point(100, 100);
        Point topPoint2 = new Point(125, 50);
        Point basePoint2 = new Point(150, 100);
        
        
        IsoscelesTriangle rt3 = new IsoscelesTriangle(new Point(100, 100), 50, 50, Color.BLACK, false);
        Point starterPoint3 = new Point(100, 100);
        Point topPoint3 = new Point(125, 150);
        Point basePoint3 = new Point(150, 100);
        
        IsoscelesTriangle rt4 = new IsoscelesTriangle(new Point(100, 100), 50, -50, Color.CYAN, false);
        Point starterPoint4 = new Point(100, 100);
        Point topPoint4 = new Point(125, 50);
        Point basePoint4 = new Point(150, 100);
        
        //Test to see if all points are present
        Point[] pts1 = rt1.getLocation();
        Assert.assertEquals(3, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, starterPoint1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, topPoint1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, basePoint1));
        
        Point[] pts2 = rt2.getLocation();
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, starterPoint2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, topPoint2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, basePoint2));
        
        //Check if right triangle is filled
        Assert.assertTrue(rt1.isFilled());
        Assert.assertTrue(rt2.isFilled());
        Assert.assertFalse(rt3.isFilled());
        Assert.assertFalse(rt4.isFilled());
        
        //Check if right triangle has correct color
        Color rect1 = rt1.getColor();
        Color rect2 = rt2.getColor();
        Assert.assertEquals(Color.BLACK, rect1);
        Assert.assertEquals(Color.CYAN, rect2);
        
        
    }
    
}
