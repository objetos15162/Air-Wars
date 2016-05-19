import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author Kavin Rowan modificado por Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class Background extends Actor
{
    /**
     * Metodo constructor
     */
    public Background()
    {
        
    }
    
    /**
     * 
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * En el metodo se mueve la imagen con respecto a las cordenadas en Y
     */
    public void scroll()
    {
        if(getY() > 3 * getImage().getHeight() / 2){
            setLocation(getX() ,0 - (250 - 2));
        }
        setLocation(getX(),getY() + 2);
        /*System.out.println("getY: "+getY());
        System.out.println("getImage: "+(3*getImage().getHeight()/2));*/
    }
}
