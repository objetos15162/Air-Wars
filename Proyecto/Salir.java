import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta tiene la tarea de cerrar la aplicación, la cual cumple con el método exit (Syste.exit()) del
 * sistema
 * 
 * @author Sergio Abraham Galarza
 * @version 23/Mayo/2016
 */
public class Salir extends Boton
{
    /**
     * Metodo constructor
     */
    public Salir()
    {
        super();
    }
    
    /**
     * Act - do whatever the Salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    if(super.click()){
        System.exit(1);
    } 
    }
}
