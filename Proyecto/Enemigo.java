import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase tiene la responsabilidad de representar al Objeto enemigo que se mueve de la parte
 * superior a la inferior, también su reposabilidad es crear un disparo y agregarlo al mundo. Este
 * disparo es generado aleatoriamente por la clase.
 * 
 * @author Sergio Abraham Galarza 
 * @version 30/04/2016
 */
public class Enemigo extends Nave
{
    //private boolean isShot;
    /**
     * En el metodo constructor se inicializa la variable para disparo
     */
    public Enemigo()
    {
        super();
        //isShot = false;
        
    }
    
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setRotation(90);
        move(4);
        //Codigo para eliminar objeto cuando llegue a borde de pantalla
        //setShot(1);
        int x = 0;
        x = Greenfoot.getRandomNumber(80);//75
        if(x == 25){
            setShot(1);
        }
        
        //eliminaObjetoBorde();
        eliminaObjeto();
    }  
    
    /**
     * Elimina el Objeto en sus dos opciones porque lo mate el jugador o 
     * porque salga del area de juego
     */
    private void eliminaObjeto()
    {
        int i = 1;
        Actor ShotJugador = getOneObjectAtOffset(0,0,ShotJugador.class);
        if(ShotJugador != null){
            Mar m = (Mar)getWorld();
            for(i = 1;i <= 5;i++ ){
                setImage("Explosion"+i+".png");
            }
            getWorld().removeObject(ShotJugador);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion1.wav");
        }
        else{
            eliminaObjetoBorde();
        }
    }
    
    /**
     * Elimina el objeto si del area de juego
     */
    private void eliminaObjetoBorde()
    {
        if(getX() >= getWorld().getWidth() - 5){
            getWorld().removeObject(this);
        }
        else{
             if(getY() >= getWorld().getHeight() - 5){
                getWorld().removeObject(this);
             }
        }
    }
    
    /**
     * @param direction indica direccion de disparo
     */
   private void setShot(int direction)
    {
        if(super.getIsShot()){
            ShotEnemigo s2 = new ShotEnemigo(direction);
            getWorld().addObject(s2,getX(),getY() - 15);
            super.setIsShot(false);
            Greenfoot.playSound("Disparo1.wav");
        }
        
        if(!super.getIsShot()){
            super.setIsShot(true);
        }
    }
    
}
