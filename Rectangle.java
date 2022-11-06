import java.awt.*;

/**
 * This class represents a rectangle with sides parallel
 * to the axis; rectangle is given by two opposite corners.
 */
public class Rectangle extends GeometricObject {
    //begin and end are opposite corners; no guaranties which one
    private Point begin;
    private Point end;

    public Rectangle() {
        begin = new Point(0, 0);  //begin-upper corner = (0,0)
        end = new Point(1, 1);    //end-lower corner = (1,1)
    }

    public Rectangle(Point b, Point e) {
        begin = new Point(b.getX(), b.getY());
        end = new Point(e.getX(), e.getY());
    }

    public void draw(Graphics g) {
        int x = (int) smallestX(); //left x
        int y = (int) smallestY(); //top y
        int w = (int) width();
        int h = (int) height();
        g.setColor(getInteriorColor());
        g.fillRect(x, y, w, h);
        g.setColor(getBoundaryColor());
        g.drawRect(x, y, w, h);
    }

    /**
     * Determines the greatest x.
     */
    public double greatestX() {
        return begin.getX() > end.getX() ?
                begin.getX() : end.getX();
    }

    /**
     * Determines the greatest y.
     */
    public double greatestY() {
        return begin.getY() > end.getY() ?
                begin.getY() : end.getY();
    }

    /**
     * Calculates the height of this rectangle.
     */
    public double height() {
        return Math.abs(begin.getY() - end.getY());
    }

    /**
     * Determines the smallest x.
     */
    public double smallestX() {
        return begin.getX() < end.getX() ?
                begin.getX() : end.getX();
    }

    /**
     * Determines the smallest y.
     */
    public double smallestY() {
        return begin.getY() < end.getY() ?
                begin.getY() : end.getY();
    }

    public boolean pointInsideRectangle(Point p) {
    	
    	if(p.getX() > smallestX() && p.getX() < greatestX() && p.getY() > smallestY() && p.getY() < greatestY()) {
    		return true;
    	}

    	return false;
    }
    
    /**
     * Translates this rectangle by given vector.
     */
    public void translate(Vector v) {
        begin.translate(v);
        end.translate(v);
    }

    /**
     * Calculates the width of this rectangle.
     */
    public double width() {
        return Math.abs(begin.getX() - end.getX());
    }

//accessors, mutators and toString not shown here
}