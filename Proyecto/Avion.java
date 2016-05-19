import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avion here.
 * 
 * @author Sergio Abraham Galarza 
 * @version 30/04/2016
 */
public class Avion extends Actor
{
    private boolean isShot;   //Variable para disparo.
    private int score;        //Puntos del jugador
    int vida;
    /**
     * Metodo constructor inicializa la variable para disparo
     * @param vida se le pasa el numero de vidas actuales del jugsdor
     * @param score se le pasa la puntacion actual del jugsdor
     */
    public Avion(int vida,int score)
    {
        isShot = false;
        this.score = score;
        this.vida = vida;
    }
    
    /**
     * Act - do whatever the Avion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("Right") && getX() < getWorld().getWidth() - 8){
            move(4);
        }
        
        if(Greenfoot.isKeyDown("Left") && getX() > 8){
            move(-4);
        }
       
        if(isTouching(Aliado.class)){
            World mundo = getWorld();
            Mar myWorld = (Mar)mundo;
            decrementScoreAliadoWorld();
            int x = myWorld.getJugador().getVida();
            myWorld.getVidaCunter().setValue(x);
            removeTouching(Aliado.class);
            Greenfoot.playSound("Explosion1.wav");
        }
        
        if(isTouching(Punto.class)){
            incrementBonusWorld();
            removeTouching(Punto.class);
        }
        
        if(isTouching(Vida.class)){
            incrementVidaWorld();
            removeTouching(Vida.class);
        }
        
        if(isTouching(Nube.class)){
            decrementaVidaWorld();
            removeTouching(Nube.class);
        }
        
        if(isTouching(ShotEnemigo.class)){
            decrementaVidaWorld();
            removeTouching(ShotEnemigo.class);
        }
        
        if(isTouching(ShotLider.class)){
            decrementaVidaWorld();
            removeTouching(ShotLider.class);
        }
        
        setShot(0);//0 -> Disparo hacia arriba.   
    }
    
    /**
     * @param direction indica direccion de disparo
     */
    public void setShot(int direction)
    {
        if(isShot && Greenfoot.isKeyDown("space")){
            ShotJugador s1 = new ShotJugador(direction);
            getWorld().addObject(s1,getX(),getY() - 15);
            isShot = false;
            Greenfoot.playSound("shot1.wav");
        }
        
        if(!isShot && !Greenfoot.isKeyDown("space")){
            isShot = true;
        }
    } 
    
    /**
     * Este metodo es usado para incrementar puntos cuando se mata
     * a el enemigo. incrementa una determinda puntuacion
     */
    public void incrementDesctruccion()
    {
        score += 10;
    }
    
    /**
     * Este metodo es utilizado para incrementar puntos cuando se
     * atrapa un bonus. incrementa una determinada puntuacion
     */
    public void incrementBonus()
    {
        score += 5;
    }
    
    /**
     * @return regresa los puntos del jugador
     */
    public int getScore()
    {
       return score;
    }
    
    /**
     * incrementa una vida.
     */
    public void incrementVida()
    {
        vida ++;
    }
    
    /**
     * decrementa la puntuacion del juagador con un numero Random
     * Este metodo es utilizado para quitar restar score cuando el jugador
     * choque con su aliado
     */
    public void decrementScoreAliado()
    {
        int x = Greenfoot.getRandomNumber( 5 ) + 1;
        if(score >= x){
        score -= x;
    }
    }
    
    /**
     * decrementa una vida
     */
    public void decrementVida()
    {
        vida --;
    }
    
    /**
     * @return regresa el numero de vidas.
     */
    public int getVida()
    {
        return vida;
    }
    
    /**
     * Incrementa la puntuacion del jugador cuando destruye un enemigo
     */
    public void incrementBonusWorld()
    {
        soundBonus();
        World mundo = getWorld();
        Mar myWorld = (Mar)mundo;
        incrementBonus();
        int x = myWorld.getJugador().getScore();
        myWorld.getScoreCounter().setValue(x);
        //myWorld.getWormsEaten().setValue(super.getWormsEaten());
    }
    
    /**
     * incrementa la vida del jugador cuando atrapa un vida 
     * actualizando los marcadores en el mundo
     */
    public void incrementVidaWorld()
    {
       soundBonus();
       World mundo = getWorld();
       Mar myWorld = (Mar)mundo;
       incrementVida();
       int x = myWorld.getJugador().getVida();
       myWorld.getVidaCunter().setValue(x);
    }   
    
    /**
     * decrementa la puntiacion del jugador cuando choca con su aliado
     * actualizado los marcadores en el mundo
     */
    public void decrementScoreAliadoWorld()
    {
       World mundo = getWorld();
       Mar myWorld = (Mar)mundo;
       decrementScoreAliado();
       int x = myWorld.getJugador().getScore();
       myWorld.getScoreCounter().setValue(x);
    }
    
    /**
     * Decrementa una vida cuando el enemigo destruye con un disparo al jugador
     */
    public void decrementaVidaWorld()
    {
        World mundo = getWorld();
        Mar myWorld = (Mar)mundo;
        myWorld.getJugador().decrementVida();
        int x = myWorld.getJugador().getVida();
        myWorld.getVidaCunter().setValue(x);
        //myWorld.getWormsEaten().setValue(super.getWormsEaten());
    }
    
    /**
     * Este metodo reproduce el sonido de bonificacion.
     */
    private void soundBonus()
    {
        Greenfoot.playSound("chunk.wav");
    }
}
