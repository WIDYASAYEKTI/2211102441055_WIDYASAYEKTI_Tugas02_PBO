import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class langit extends World
{

    /**
     * Constructor for objects of class langit.
     * 
     */
    public langit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Random rnd = new Random();
        Boolean isRunning = false;
        for (int i=0; i<15; i++){
            int x = rnd.nextInt(this.getWidth()-1);
            int y = rnd.nextInt(this.getHeight()-1);
            awan awan1 = new awan();
            awan1.setRotation(75*rnd.nextInt(1));
            this.addObject(awan1, x, y);
        }
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FlappyBird flappyBird = new FlappyBird();
        addObject(flappyBird,88,137);
        FlappyBird flappyBird2 = new FlappyBird();
        addObject(flappyBird2,215,487);
        FlappyBird flappyBird3 = new FlappyBird();
        addObject(flappyBird3,332,279);
        FlappyBird flappyBird4 = new FlappyBird();
        addObject(flappyBird4,536,386);
        FlappyBird flappyBird5 = new FlappyBird();
        addObject(flappyBird5,650,38);
        FlappyBird flappyBird6 = new FlappyBird();
        addObject(flappyBird6,749,557);
    }
}
