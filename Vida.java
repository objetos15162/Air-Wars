import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class Vida extends Bonificacion
{
    /**
     * Metodo constructor
     */
    public Vida()
    {
        super();
    }
    
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       super.mueve();
       super.eliminaObjeto();
    }    
    
}
