
/**
 * Write a description of class hill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hill
{
    // instance variables - replace the example below with your own
    private Circle hill;

    /**
     * Constructor for objects of class hill
     */
    public hill()
    {
        // initialise instance variables
        hill = new Circle();
    }
    public void drawHill(int x, int y)
    {
        // put your code here
        //draw hill
        hill.changeColor("green");
        hill.changeSize(1000);
        hill.moveHorizontal(x);
        hill.moveVertical(y);
        hill.makeVisible();
    }
}
