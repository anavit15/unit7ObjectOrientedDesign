import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Shape;
import javax.swing.JColorChooser;
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
    JColorChooser colorChooser;
    
    class MousePressListener implements MouseListener, MouseMotionListener
    {
        //mouse listener
        public void mousePressed(MouseEvent event)
        {

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
        }

    }
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        drawingColor=Color.BLACK;

        MouseListener listener=new MousePressListener();
        addMouseListener(listener);

        shapes= new ArrayList<Shape>();
        
        
    }

    public Color getColor()
    {
        return drawingColor;
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
    }

}
