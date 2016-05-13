import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author Sergio Abrahma Galarza 
 * @version 30/04/2016
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int position;//Direccion de bala
    private int speedShot = 6;//Velocidad de movimiento
    
    /**
     * @parama direction asigna la direccion de disparo
     */
    public Shot(int direction)
    {
        this.position = direction;
        speedShot =6;
    }
    
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * @return regresa la posicion de la bala
     */
    public int  getPosition()
    {
        return position;
    }
    
    /**
     * @param regresa la velocidad de la bala
     */
    public int getSpeedShot()
    {
        return speedShot;
    }
    
    /**
     *  Mueve la bala segun su direccion indicada
     */
    public void mueveShot()
    {
        switch(position)
        {
            case 0://Disparo hacia arriba
                setLocation(getX(),getY() - speedShot);
            break;
            case 1: //Disparo hacia abajo
                setLocation(getX(),getY() + speedShot);
            break;
            case 2://Disparo hacia la derecha
                setLocation(getX() + speedShot,getY());
            break;
            case 3://Diaparo hacia la izquierda
                setLocation(getX() - speedShot,getY());
            break;
        }
        
    }
    
    /**
     * Elimina el objeto si sale del area de juego
     */
    public void eliminaObjetoBorde()
    {
        if(getY() >= getWorld().getHeight() - 5 || getY() <= 5){
            getWorld().removeObject(this);
        }
    }
}
