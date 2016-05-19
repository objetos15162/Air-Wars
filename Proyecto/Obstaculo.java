import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstaculo here.
 * 
 * @author Sergio Abraham Galarza
 * @version 03/Mayo/2016
 */
public class Obstaculo extends Actor
{
    /**
     * Metodo constructor
     */
    public Obstaculo()
    {
        
    }
    
    /**
     * Act - do whatever the Obstaculo wants to do. This method is called whenever
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
     * @return  regresa true si se elemino el objeto si el jugador lo toca
     */
    public boolean eliminaObjetoTouching()
    {
       Actor Avion = getOneObjectAtOffset(0,0,Avion.class);
       if(Avion!= null){
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
        }
    }
    
    /**
     * Elimina el objeto en los dos casos.
     */
    public void eliminaObjeto()
    {
       if(eliminaObjetoTouching()){ 
           Mar m = (Mar)getWorld();
           getWorld().removeObject(this);
       }
       else{
           eliminaObjetoBorde();
       }
    }
}
