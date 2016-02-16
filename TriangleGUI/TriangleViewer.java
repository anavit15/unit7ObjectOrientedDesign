
import javax.swing.JFrame;

/**
 * Write a description of class TriangleViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleViewer 
{
    
    /**
     * Default constructor for objects of class TriangleViewer
     */
    public TriangleViewer()
    {
        // initialise instance variables
       
    }

    
    public static void main (String [] args)
    {
        JFrame frame=new TriangleFrame();
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
