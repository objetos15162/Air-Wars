import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonificaciones here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class Bonificacion extends Actor
{
    /**
     * Metodo constructor
     */
    public Bonificacion()
    {
        
    }
    
    /**
     * Act - do whatever the Bonificaciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Mueve el objeto de la parte superior a la parte inferior
     */
    public void mueve()
    {
        setRotation(90);
        move(3);
    }
    
    /**
     * Elimina el objeto en los dos casos.
     */
    public void eliminaObjeto()
    {
       if(eliminaObjetoTouching()){ 
           //incrementVida();
           Mar m = (Mar)getWorld();
           Greenfoot.playSound("chunk.wav");
           getWorld().removeObject(this);
           //System.out.println("Lo atrapo");
       }
       else{
           eliminaObjetoBorde();
       }
    }
    
    /**
     * @return  regresa true si se elemino el objeto si el jugador lo toca
     */
    public boolean eliminaObjetoTouching()
    {
       Actor Avion = getOneObjectAtOffset(0,0,Avion.class);
       if(Avion != null){
            return true;
       }
       else{
           return false;
       }
    }
    
    /**
     * @Elimina el objeto si de la pantalla de juego
     */
    public void eliminaObjetoBorde()
    {
        if(getY() >= getWorld().getHeight()-5 || getY() <= 5){
            getWorld().removeObject(this);
            //System.out.println("Salio del area de juego");
        }
    }
}
