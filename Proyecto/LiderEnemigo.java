import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LiderEnemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LiderEnemigo extends Nave
{
    private int x;
    private boolean movimiento;
    //private boolean isShot;
    int vida; //Instancia para la vida que tiene el jugador
    /**
     * Metodo Constructor iniciliza la variable de la posicion
     * en X para moverse
     */
    public LiderEnemigo()
    {
        super();
        x = 50;
        vida = 30;
        movimiento = false;
        //isShot = false;
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
        if(x1 == 30){
            setShot(1);
        }
        
        if(isTouching(ShotJugador.class)){
            vida--;
            incrementScore();
            removeTouching(ShotJugador.class);
            if(vida == 0){
                  increEliminacionLiderFinal();
                  getWorld().removeObject(this);
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
     * @param direction indica direccion de disparo
     */
    private void setShot(int direction)
    {
        if(super.getIsShot()){
            ShotLider s2 = new ShotLider(direction);
            getWorld().addObject(s2,getX(),getY() + 30);
            super.setIsShot(false);
            Greenfoot.playSound("shot3.wav");
        }
        
        if(!super.getIsShot()){
            super.setIsShot(true);
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
    
    /**
     * incrementa la variable del mundo que guarda cuantos enemigos
     * finales elimina el jugador
     */
    public void increEliminacionLiderFinal()
    {
        World mundo = getWorld();
        Mar myWorld = (Mar)mundo;
        myWorld.incrementEnemigoFinal();
    }
   
    }

