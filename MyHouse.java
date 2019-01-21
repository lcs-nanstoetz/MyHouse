
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
    private hill hill1;
    private hill hill2;
    private door door;
    private Bird bird1;
    private Bird bird2;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    private Tree tree6;
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
        hill1 = new hill();
        hill2 = new hill();
        door = new door();
        bird1 = new Bird();
        bird2 = new Bird(); 
        tree1 = new Tree(0,0);
        tree2 = new Tree(0,0);
        tree3 = new Tree(0,0);
        tree4 = new Tree(0,0);
        tree5 = new Tree(0,0);
        tree6 = new Tree(0,0);
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
        
        //draw hill1
        hill1.drawHill(-350,120);
        
        //draw hill2
        hill2.drawHill(-50,170);
        
        
        //draw base
        base.changeColor("red");
        base.changeSize(80);
        base.moveHorizontal(50);
        base.moveVertical(80);
        base.makeVisible();
        
        //draw roof
        roof.changeColor("magenta");
        roof.changeSize(50,130);
        roof.moveHorizontal(100);
        roof.moveVertical(75);
        roof.makeVisible();
        
        //draw door
        door.drawDoor(0,0);
        
        //draw bird1
        bird1.drawBird(300,0);
        
        //draw bird2
        bird2.drawBird(250,50);
        
        //draw Tree1
        tree1.drawTree(300,300);
        
        //draw Tree2
        tree2.drawTree(325,325);
        
        //draw Tree3
        tree3.drawTree(350,275);
        
        //draw Tree4
        tree4.drawTree(375,350);
        
        //draw Tree5
        tree5.drawTree(400,250);

        //draw Tree6
        tree6.drawTree(425,300);
    }
}
