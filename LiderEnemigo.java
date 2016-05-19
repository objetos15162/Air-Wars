import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LiderEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LiderEnemigo extends Actor
{
    private int x;
    private boolean movimiento;
    private boolean isShot;
    int vida;
    /**
     * Metodo Constructor iniciliza la variable de la posicion
     * en X para moverse
     */
    public LiderEnemigo()
    {
        x = 50;
        vida = 15;
        movimiento = false;
        isShot = false;
    }
    
    /**
     * Act - do whatever the LiderEnemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        mueve();
        /*if(0 == Greenfoot.getRandomNumber(2)){
            setShot(1);
        }*/
        int x1 = Greenfoot.getRandomNumber(50);//75
        if(x1 == 25){
            setShot(1);
        }
        
        if(isTouching(ShotJugador.class)){
            vida--;
            if(vida == 0){
                   
            }
        }
        
    }  
    
    /**
     * Mueve el objeto de un lado para otro cierta distancia
     */
    private void mueve()
    {
        //mueveAdelante();
        if(!movimiento){
            move(1);
            x++;
            if(x == 100){
                movimiento = true;
            }
        }
        
        if(movimiento){
            move(-1);
            x--;
            if(x == 0){
                movimiento = false;
            }
        }
    }
    
    /**
     * Mueve el objeto hacia adelante(para simular que aparece de adelante)
     */
    private void mueveAdelante()
    {
        if(getY() < 40)
        {
         setLocation(getX(),getY() + 2);
        }
    }
    
    /**
     * @param direction indica direccion de disparo
     */
    public void setShot(int direction)
    {
        if(isShot){
            ShotLider s2 = new ShotLider(direction);
            getWorld().addObject(s2,getX(),getY() + 30);
            isShot = false;
            Greenfoot.playSound("shot3.wav");
        }
        
        if(!isShot){
            isShot = true;
        }
    }
    }

