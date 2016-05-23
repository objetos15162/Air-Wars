import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase tiene la responsabilidad de mostrar una imagen indicando al jugador si ha perdido en el
 * juego y después dentro de ella misma llama al menú para regresar a las opciones de menú del juego.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 06/05/2016
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
