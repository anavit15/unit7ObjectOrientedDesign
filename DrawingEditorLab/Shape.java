import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color drawingColor;
    
    public Shape(double x, double y, double r, Color color)
    {
        center=new Point2D.Double(x,y);
        radius=r;
        drawingColor=color;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        center.setLocation((center.getX()-x),(center.getY()-y));
    }
    
    public void setRadius(double r)
    {
        radius=r;
    }
    
    public abstract boolean isInside(Point2D.Double point);
    //public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
  
    
}
