import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase tiene la reposabilidad de mover el Objeto de la parte superior a la inferior al igual que
 * eliminarlo del mundo si sale del área de juego. Actúa como punto extra en el juego.
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
