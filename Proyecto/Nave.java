import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author Sergio Abraham Galarza
 * @version 19/Mayo/2016
 */
public class Nave extends Actor
{
    private boolean isShot;
    
    /**
     * metodo construtor unicializa la instancia de disparo en false
     * que indica que la nave no esta disparando.
     */
    public Nave()
    {
        isShot = false;
    }
        
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * @return la variable para saber si se disparo
     */
    public boolean getIsShot()
    {
        return isShot;
    }
    
    /**
     * @return cambia el estado de disparo
     */
    public void setIsShot(boolean shot)
    {
        isShot = shot;
    }
}
