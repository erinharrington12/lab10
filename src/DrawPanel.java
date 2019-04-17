import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * @author Erin Harrington
 *
 */
public class DrawPanel extends JPanel
{
    private ArrayList<Shape> shapeList;
    
    /**
     * Constructor for DrawPanel
     * creates a border layout
     * declares shapeList
     */
    public DrawPanel() {
        new BorderLayout();
        shapeList = new ArrayList<Shape>();
        
    }
    /**
     * 
     * @param shape The shape to be added to the set of shapes.
     */
    public void addShape(Shape shape) {
        
        shapeList.add(shape);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        
        for(int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).draw(graphics);
        }
    }
    
    
}
