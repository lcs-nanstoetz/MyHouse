
/**
 * Write a description of class bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private Circle bird1;
    private Circle bird2;
    private Circle background1;
    private Circle background2;
    private Circle background3;
    
    /**
     * Constructor for objects of class bird
     */
    public Bird()
    {
        // initialise instance variables
        bird1 = new Circle();
        bird2 = new Circle();
        background1 = new Circle();
        background2 = new Circle();
        background3 = new Circle();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawBird(int x, int y)
    {
       bird1.changeColor("black");
       bird1.changeSize(50);
       bird1.makeVisible();
       bird1.moveHorizontal(x);
       bird1.moveVertical(y);
        
       bird2.changeColor("black");
       bird2.changeSize(50);
       bird2.makeVisible();
       bird2.moveHorizontal(45);
       bird2.moveHorizontal(x);
       bird2.moveVertical(y);
       
       background2.moveHorizontal(50);      
       background2.changeColor("white");
       background2.changeSize(50);
       background2.makeVisible();
       background2.moveVertical(10);
       background2.moveHorizontal(x);
       background2.moveVertical(y);
            
       background1.changeColor("white");
       background1.changeSize(45);
       background1.makeVisible();
       background1.moveHorizontal(-5);
       background1.moveVertical(10);
       background1.moveHorizontal(x);
       background1.moveVertical(y);
       
       background3.changeColor("white");
       background3.changeSize(45);
       background3.makeVisible();
       background3.moveVertical(25);
       background3.moveHorizontal(23);
       background3.moveHorizontal(x);
       background3.moveVertical(y);
    }
}
