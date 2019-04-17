import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Erin Harrington
 *
 */
public class DrawFrame extends JFrame
{
    private static DrawPanel drawPanel;
    
    public DrawFrame(String title) {
        super(title);
    }
    
    public static void main(String[] args) throws IOException {
        DrawFrame appFrame = new DrawFrame("Panda");
        drawPanel = new DrawPanel();
        appFrame.setSize(900,700);
        
        Rectangle sky = new Rectangle(new Point(0,450), 900, 450, Color.CYAN, true);
        Rectangle ground = new Rectangle(new Point(0,900), 900, 450, Color.GREEN, true);
        Oval body = new Oval(new Point(350, 300), 170, 220, Color.WHITE, true);
        Circle arm = new Circle(new Point(330, 450), 75, Color.BLACK, true);
        Circle arm2 = new Circle(new Point(460, 450), 75, Color.BLACK, true);
        Circle arm3 = new Circle(new Point(485, 330), 65, Color.BLACK, true);
        Circle arm4 = new Circle(new Point(310, 330), 65, Color.BLACK, true);
        Circle head = new Circle(new Point(360, 200), 150, Color.WHITE, true);
        IsoscelesTriangle ear1 = new IsoscelesTriangle(new Point(370, 225), 50, -50, Color.BLACK, true);
        IsoscelesTriangle ear2 = new IsoscelesTriangle(new Point(450, 225), 50, -50, Color.BLACK, true);
        Diamond flower = new Diamond(new Point(600, 600), 45, Color.MAGENTA, true);
        Diamond flower2 = new Diamond(new Point(50, 500), 30, Color.ORANGE, true);
        Diamond flower3 = new Diamond(new Point(200, 600), 35, Color.RED, true);
        Circle sun = new Circle(new Point(750, 10), 200, Color.YELLOW, true);
        Oval cloud = new Oval(new Point(60, 50), 220, 50, Color.WHITE, true);
        Oval cloud2 = new Oval(new Point(-10, 300), 150, 50, Color.WHITE, true);
       
        
        appFrame.add(drawPanel);
        
        
        drawPanel.addShape(sky);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(ground);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(body);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(arm);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(arm2);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(arm3);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(arm4);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(head);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(ear1);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(ear2);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(flower);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(flower2);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(flower3);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(sun);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(cloud);
        drawPanel.setVisible(true);
        
        drawPanel.addShape(cloud2);
        drawPanel.setVisible(true);
        
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
        
        PanelToImage.makePanelPNGImage(drawPanel, "Lab10, panda");
    }
}
