import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Boton
{
    /**
     * Metodo constructor
     */
    
    public Jugar()
    {
        super();
    }
    
    /**
     * Act - do whatever the Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(super.click()){
            Mar m = new Nivel2(3,0);
            Greenfoot.setWorld(m);
        }
        
    }    
}
