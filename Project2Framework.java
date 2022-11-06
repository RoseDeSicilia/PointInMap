
import javax.swing.*;

/**
 * Project 2 code skeleton; shows how to add a background image.
 * 
 * @author Antonio Hernandez
 */
public class Project2Framework
{
    public static void main(String[] args)
    {
        new Project2Framework();
    }
    
    public Project2Framework()
    {        
        //Defining the geometric objects that represent the problem data
        //There will be 7 geometric objects, one for every country
        GeometricObject[] g = new GeometricObject[7];

        //definition of the first polygon (Avocado)
        Point[] AvocadoPoints = new Point[10];
        AvocadoPoints[0] = new Point(307, 177);
        AvocadoPoints[1] = new Point(273, 195);
        AvocadoPoints[2] = new Point(265, 231);
        AvocadoPoints[3] = new Point(288, 272);
        AvocadoPoints[4] = new Point(360, 306);
        AvocadoPoints[5] = new Point(384, 301);
        AvocadoPoints[6] = new Point(400, 292);
        AvocadoPoints[7] = new Point(387, 268);
        AvocadoPoints[8] = new Point(385, 236);
        AvocadoPoints[9] = new Point(355, 193);
        Polygon AvocadoPolygon = new Polygon(AvocadoPoints);

        //definition of the second polygon (Brussels Sprouts)
        Point[] BrusselsPoints = new Point[10];
        BrusselsPoints[0] = new Point(309, 132);
        BrusselsPoints[1] = new Point(273, 175);
        BrusselsPoints[2] = new Point(266, 200);
        BrusselsPoints[3] = new Point(303, 176);
        BrusselsPoints[4] = new Point(336, 181);
        BrusselsPoints[5] = new Point(386, 231);
        BrusselsPoints[6] = new Point(401, 203);
        BrusselsPoints[7] = new Point(416, 193);
        BrusselsPoints[8] = new Point(399, 163);
        BrusselsPoints[9] = new Point(353, 142);
        Polygon BrusselsPolygon = new Polygon(BrusselsPoints);

        //definition of the third polygon (Blueberry)

        //definition of the fourth polygon (Almonds)
        //definition of the fifth polygon (Apple)


        



        
        //graphing
        FrameDisplay frame = new FrameDisplay(g);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
