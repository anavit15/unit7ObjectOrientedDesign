import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton color;
    private JButton circle;
    private JButton square;
    private JLabel label;
    private DrawingPanel canvas;
    private JPanel colorPanel;
    
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel dPanel)
    {
        // initialise instance variables
        
        color= new JButton("Pick a Color");
        add(color);
        
        canvas=dPanel;
        colorPanel=new JPanel();
        colorPanel.setBackground(canvas.getColor());
        add(colorPanel);
        
        circle=new JButton("Add a Circle");
        add(circle);
        
        square=new JButton("Add a Square");
        add(square);
        
        ClickListener listener = new ClickListener();
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);
        
        label = new JLabel();
        add(label);
        
        
        

    }
    
    public class ClickListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            
            if (event.getActionCommand()== "Pick a Color")
            {
                canvas.pickColor();
                colorPanel.setBackground(canvas.getColor());
                //label.setText("Button "+event.getActionCommand()+" was clicked.");
            }
            if (event.getActionCommand()== "Add a Circle")
            {
                //canvas.addCircle();
            }
            if (event.getActionCommand()== "Add a Square")
            {
                //canvas.addSquare();
            }
        }
     
        
    }
   
}
