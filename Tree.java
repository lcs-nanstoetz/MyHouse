
/**
 * Creates an instance of a Tree.
 *
 * @author N. Anstoetz
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle Tree1;
    private Triangle Tree2;
    private Triangle Tree3;
    private Square Tree4;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        Tree1 = new Triangle();
        Tree2 = new Triangle();
        Tree3 = new Triangle();
        Tree4 = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        Tree1.changeColor("green");
        Tree1.makeVisible();
        
        //
        Tree2.changeColor("green");
        Tree2.makeVisible();
        Tree2.moveVertical(10);
        
        //
        Tree3.changeColor("green");
        Tree3.moveVertical(20);
        Tree3.makeVisible();
        
        //
        Tree4.changeColor("black");
        Tree4.moveVertical(15);
        Tree4.makeVisible();
        Tree4.moveHorizontal(-15);
        Tree4.changeSize(10);
        
        
        // translate the tree to the specified location
        
        
    }
    
}
