
/**
 * It draws a complete house on screen unsing individual shapes
 *
 * @author Nick Anstoetz
 * @version January 11 19
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    //ACCESS_MODIFIER TYPERNAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square background;
    private Circle hill;
    private Square door1;
    private Square door2;
    
    /**
     * the job of a instructor is to initialize all the instance variables
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        background = new Square();
        hill = new Circle();
        door1 = new Square();
        door2 = new Square();
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        //draw blue background
        background.changeColor("blue");
        background.changeSize(1000);
        background.moveVertical(-300);
        background.moveHorizontal(-300);
        background.makeVisible();
        
        // Put the sun in position
        sun.moveHorizontal(-60);
        sun.moveVertical(-80);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.makeVisible();
        
        //draw hill
        hill.changeColor("green");
        hill.changeSize(1000);
        hill.moveHorizontal(-350);
        hill.moveVertical(120);
        hill.makeVisible();
        
        //draw base
        base.changeColor("red");
        base.changeSize(80);
        base.moveHorizontal(50);
        base.moveVertical(80);
        base.makeVisible();
        
        //draw roof
        roof.changeColor("magenta");
        roof.changeSize(30,130);
        roof.moveHorizontal(93);
        roof.moveVertical(90);
        roof.makeVisible();
        
        //draw first part of door
        door1.changeColor("black");
        door1.moveVertical(50);
        door1.moveHorizontal(50);
        door1.makeVisible();
    }
}
