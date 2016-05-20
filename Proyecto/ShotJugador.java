import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShotJugador here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class ShotJugador extends Shot
{   
    /**
     * metodo constructor
     * @param direction es un entero que asigna la direccion de diparo.
     */
    public ShotJugador(int direction)
    {
        super(direction);
    }
    
    /**
     * Act - do whatever the ShotJugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.mueveShot();
        int i;
        Actor Enemigo = getOneObjectAtOffset(0,0,Enemigo.class);
        if(Enemigo != null){
            Mar m = (Mar)getWorld();
            incrementScore();
            for(i = 1; i <= 5 ;i++ ){
                setImage("Explosion" +i+ ".png");
            }
            getWorld().removeObject(Enemigo);
            getWorld().removeObject(this);
            Greenfoot.playSound("explosion.wav");
            
        }
        else{
            super.eliminaObjetoBorde();
        }
    } 
    
    /**
     * Incrementa la puntuacion del jugador cuando destruye un enemigo
     */
    public void incrementScore()
    {
        World mundo = getWorld();
        Mar myWorld = (Mar)mundo;
        myWorld.getJugador().incrementDesctruccion();
        int x = myWorld.getJugador().getScore();
        myWorld.getScoreCounter().setValue(x);
        //myWorld.getWormsEaten().setValue(super.getWormsEaten());
    }
}
