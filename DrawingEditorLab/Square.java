import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle2D.Double rectangle;
    private Color drawingcolor;
    /**
     * Default constructor for objects of class Square
     */
    public Square(double x, double y, double r, Color color)
    {
        super(x, y, r, color);
        drawingcolor=color;
        
    }
    
    public boolean isInside(Point2D.Double point)
    {
        rectangle=new Rectangle2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius()); 
        return rectangle.contains(point.getX(), point.getY());
    }
    
    
    public void draw(Graphics2D g, boolean filled)
    {
        rectangle=new Rectangle2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius()); 
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(drawingcolor);
        g2.draw(rectangle);
        if (filled)
        {
            g2.fill(rectangle);
        }
    }
    
}
