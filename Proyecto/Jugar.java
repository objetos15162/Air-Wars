import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se llama al método de su súper clase (Boton) si es clickeado crea un mundo De Nivel 1
 * con tres vidas por defecto.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 23/Mayo/2016
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
