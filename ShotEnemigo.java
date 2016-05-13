import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShotEnemigo here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class ShotEnemigo extends Shot
{
    
    /**
     * Contructor
     * @param direction es un entero que asigna la direccion de disparo
     */
    public ShotEnemigo(int direction)
    {
        super(direction);
    }
    
    
    /**
     * Act - do whatever the ShotEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.mueveShot();
        int i = 0;
        Actor Avion = getOneObjectAtOffset(0,0,Avion.class);
        if(Avion!= null)
        {
            Mar m = (Mar)getWorld();
           
            for(i = 1; i <= 5 ; i ++ )
            {
                setImage("Explosion"+i+".png");
            }
            getWorld().removeObject(Avion);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion1.wav");
        }
        else
        {
            super.eliminaObjetoBorde();
        }
    } 
    
    
}
