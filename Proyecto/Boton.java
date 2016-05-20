import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 18/Mayo/2016
 */
public class Boton extends Actor
{
    /**
     * Metodo Constructor
     */
    public Boton()
    {
    }
    
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * Este metodo checa si clickea en la imagen de este Objeto
     * en caso de que sea clickeado con el mouse retorna true
     * de lo contrario un false
     */
    public boolean click()
    {
        if(Greenfoot.mouseClicked(this)){
            return true;
        }
        else{
            return false;
        }
    }
}
