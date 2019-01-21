
/**
 * Write a description of class door here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class door
{
    // instance variables - replace the example below with your own
    private Square door1;
    private Square door2;

    /**
     * Constructor for objects of class door
     */
    public door()
    {
        // initialise instance variables
        door1 = new Square();
        door2 = new Square();
    }
     public void drawDoor(int x, int y)
    {
        //draw first part of door
        door1.changeColor("black");
        door1.moveVertical(130);
        door1.moveHorizontal(55);
        door1.makeVisible();
        
        //draw first part of door
        door2.changeColor("black");
        door2.moveVertical(120);
        door2.moveHorizontal(55);
        door2.makeVisible();
    }
}
