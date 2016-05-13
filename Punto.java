import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punto here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 * 
 */
public class Punto extends Bonificacion
{
    /**
     * Metodo Constructor
     */
    public Punto()
    {
        super();
    }
    
    /**
     * Act - do whatever the Punto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       super.mueve();
       super.eliminaObjeto();
    }    
}
