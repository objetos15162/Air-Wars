import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Boton
{
    /**
     * Metodo constructor
     */
    
    public Creditos()
    {
        super();
    }
    
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
     if(Greenfoot.mouseClicked(this)){
        LeeTexto ayuda = new LeeTexto("creditos");
            getWorld().addObject(ayuda,getWorld().getHeight()/2,getWorld().getHeight()/2);
     }    
    }
}
