import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Esta clase es la super clase para los Objetos implementados como Obstáculos. Tiene dos métodos,
 *uno para el movimiento del objeto y otro para eliminar el objeto del mundo si lo sale del área de
 *juego.
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
     * @Elimina el objeto si de la pantalla de juego
     */
    public void eliminaObjetoBorde()
    {
        if(getY() >= getWorld().getHeight()-5 || getY() <= 5){
            getWorld().removeObject(this);
        }
    }
    
}
