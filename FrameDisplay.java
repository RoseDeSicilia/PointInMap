
import javax.swing.*;

public class FrameDisplay extends JFrame
{   
    int WIDTH = 800;
    int HEIGHT = 600;
    
    private GraphDisplay panel;

    /**
     * Creates an initializes the window frame.
     *
     * @param g geometric objects to be depicted in this frame
     */
    public FrameDisplay(GeometricObject[] g)
    {
        setTitle("Interactive Map");
        setSize(WIDTH, HEIGHT);
        setResizable(false);

        panel = new GraphDisplay(WIDTH, HEIGHT, g);        
        add(panel);

        pack(); //sizes the frame so that the panel is at, or above,
                //the preferred size
    }
}
