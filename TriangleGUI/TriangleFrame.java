import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * Write a description of class TriangleFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private TriangleComponent scene;

    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            int clickCount= event.getClickCount();
            scene.moveDotTo(x, y, clickCount);
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseClicked(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }
    }

    /**
     * Default constructor for objects of class TriangleFrame
     */
    public TriangleFrame()
    {
        // initialise instance variables
        scene=new TriangleComponent();
        add(scene);
        
        MouseListener listener=new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

}
