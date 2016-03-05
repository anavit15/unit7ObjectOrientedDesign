import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Point2D;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    Color drawingColor;
    ArrayList<Shape> shapes;
    boolean activeShape;
    JColorChooser colorChooser;
    private Shape active;

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        drawingColor=Color.BLACK;

        MousePressListener listener=new MousePressListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        shapes= new ArrayList<Shape>();
        
        
    }

    public Color getColor()
    {
        return drawingColor;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension d=new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
        return d;
    }
    
    public void pickColor()
    {
        Color newColor= JColorChooser.showDialog(this, "Choose Your Color", drawingColor);
        
        if (newColor!=null)
        {
            drawingColor=newColor;
        }
        
    }
    
    public void addCircle()
    {
        Circle circle=new Circle(FRAME_WIDTH/2,FRAME_HEIGHT/2, 25, drawingColor);
        shapes.add(circle);
        repaint();
    }
    
    public void addSquare()
    {
        Square square=new Square(FRAME_WIDTH/2,FRAME_HEIGHT/2, 45, drawingColor);
        shapes.add(square);
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        System.out.println(activeShape);
        
        
        if (activeShape==true)
        {
           shapes.remove(active);
           for (int i=0; i<shapes.size();i++)
           {
               shapes.get(i).draw(g2,true);
               
            }
            active.draw(g2,false);
            shapes.add(active);
            
        }
        else if (activeShape==false)
        {
            for (int i=0; i<shapes.size();i++)
           {
               
               shapes.get(i).draw(g2,true);
               
            }
        }
    }
        
    
    class MousePressListener implements MouseListener, MouseMotionListener
    {
        //mouse listener
        public void mousePressed(MouseEvent event)
        {
            for (int i=shapes.size()-1; i>=0; i--)
            //for (int i=0; i<shapes.size();i++)
            {
                if (shapes.get(i).isInside(new Point2D.Double(event.getX(), event.getY()))==true)
                {
                    activeShape=true;
                    active=shapes.get(i);
                    //System.out.println(activeShape);
                    
                }
                else
                {
                    activeShape=false;
                }
            }
            repaint();
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event) 
        {
        }

        //mouse motion listener
        public void mouseMoved(MouseEvent event)
        {
        }

        public void mouseDragged (MouseEvent event)
        {
            activeShape=true;
            active.move(event.getX(), event.getY());
            activeShape=true;
            repaint();
        }

    }
}
