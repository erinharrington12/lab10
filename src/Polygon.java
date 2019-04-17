import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author Erin Harrington
 *
 */
public abstract class Polygon extends Shape 
{
    public Polygon(Color color, boolean filled) {
        super(color, filled);
    }
    
    @Override
    public void draw(Graphics graphics) {
        
        int[] x = new int[location.length];
        int[] y = new int[location.length];
        
        
        for (int j = 0; j < location.length; j++) {
            x[j] = (int) location[j].getX();
            y[j] = (int) location[j].getY();
        }
        
        graphics.setColor(this.getColor());
        graphics.fillPolygon(x, y, location.length);
        
        
    }
}
