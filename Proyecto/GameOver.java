import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
    }
    
    @Override
    public  void act()
    {
        regresaMenu();
    }
    
    /**
     * regresa crea un Objeto de tipo menu y y te regresa al menu principal
     */
    private void regresaMenu()
    {
        Greenfoot.delay(150);
        Greenfoot.setWorld(new Menu());
    }
}
