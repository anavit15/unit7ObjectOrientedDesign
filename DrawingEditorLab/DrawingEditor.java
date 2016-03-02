import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 700;
    private static final int FRAME_HEIGHT = 700;
    private DrawingPanel canvas;
    private ControlPanel controls;

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        // initialise instance variables
        setLayout(new BorderLayout());
        
        canvas=new DrawingPanel();
        add(canvas, BorderLayout.CENTER);
        
        controls=new ControlPanel(canvas);
        add(controls, BorderLayout.SOUTH);
        
        setTitle("Drawing Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(canvas.getPreferredSize());
        
        
        
    }

    public static void main (String [] args)
    {
        JFrame frame=new DrawingEditor();
    }

}
