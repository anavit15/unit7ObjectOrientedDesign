import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Line2D;

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
    private Line2D.Double line;
    private int status;

    /**
     * Default constructor for objects of class TriangleComponent
     */
    public TriangleComponent()
    {
       status=-1;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D) g;
        if (status==0)
        {
            g2.draw(dot);
        }
        else if(status==1)
        {
            g2.draw(dot2);
            g2.draw(new Line2D.Double(dot.getX(), dot.getY(), dot2.getX(), dot2.getY()));
        }
        else if (status==2)
        {
            g2.draw(dot3);
            g2.draw(new Line2D.Double(dot.getX(), dot.getY(), dot2.getX(), dot2.getY()));
            g2.draw(new Line2D.Double(dot.getX(), dot.getY(), dot3.getX(), dot3.getY()));
            g2.draw(new Line2D.Double(dot2.getX(), dot2.getY(), dot3.getX(), dot3.getY()));
        }
        else if (status==3)
        {
            status=-1;
        }
        status++;
        
        
    }

    public void moveDotTo(int x, int y)
    {
        if (status==0)
        {
            dot=new Rectangle (x,y, BOX_HEIGHT, BOX_HEIGHT);
        }
        else if (status==1)
        {
            dot2=new Rectangle (x,y, BOX_HEIGHT, BOX_HEIGHT);
        }
        else if (status==2)
        {
            dot3=new Rectangle (x,y, BOX_HEIGHT, BOX_HEIGHT);
        }
        repaint();
    }

}
