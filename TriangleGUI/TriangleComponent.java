import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int BOX_WIDTH = 1;
    private static final int BOX_HEIGHT = 1;

    private Rectangle dot;
    private Rectangle dot2;
    private Rectangle dot3;

    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
        // initialise instance variables
        dot=new Rectangle (-1,-1, 10, BOX_HEIGHT);
        dot2=new Rectangle (-1,-1, BOX_WIDTH, BOX_HEIGHT);
        dot3=new Rectangle (-1,-1, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D) g;
        g2.draw(dot);
        g2.draw(dot2);
        g2.draw(dot3);
    }

    public void moveDotTo(int x, int y)
    {
        int clicks=0
        if (clickCount==1)
        {
            dot.setLocation(x, y);
            repaint();
            clickCount++;
        }
        else if (clickCount==2)
        {
            dot2.setLocation(x, y);
            repaint();
        }
            
    }

}
