import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Boton
{
    /**
     * Metodo constructor
     */
    
    public Ayuda()
    {
        super();
    }
    
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(super.click()){
            LeeTexto ayuda = new LeeTexto("ayuda");
            getWorld().addObject(ayuda,getWorld().getHeight()/2,getWorld().getHeight()/2);
        }
    }    
}
