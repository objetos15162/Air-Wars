import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es para mover el jugador aliado dentro de la clase le asigna el lado del que aparecera
 * 
 * @author Sergio Abraham Galarza 
 * @version 30/04/2016
 */
public class Aliado extends Actor
{
    /**
     * Act - do whatever the Aliado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int lado;
    private boolean vida;
    private boolean vidaExiste;
    
    /**
     * metodo constructor asigna el lado de donde saldra el aliado
     */
    public Aliado(boolean vidaExiste)
    {
        lado = Greenfoot.getRandomNumber(2);
        vida = false;
        this.vidaExiste = vidaExiste;
    }
    
    public void act() 
    {
        // Add your action code here...
        if(vidaExiste){
            addVida();
        }
        
        if(getX() > getWorld().getWidth() / 2){
            if(getY() > (getWorld().getHeight() / 6) * 4){
                movimientoIzquierdo();
            }
            else{
                setLocation(getX(),getY() - 1);
                movimientoDerecho();
            }
        }
        else{
            if(getY() > (getWorld().getHeight() / 6 * 4)){
                movimientoDerecho();
            }
            else{
                setLocation(getX(),getY() - 1);
                movimientoIzquierdo();
            }
        }
        eliminaObjectoBorde();
    }    
    
    /**
     * Elimina el objeto en sus dos casos en caso de ser destriudo por el jugador
     * y si sale del area de juego.
     */
    public void elinimaObjeto()
    {
        int i=1;
        Actor ShotJugador = getOneObjectAtOffset(0,0,ShotJugador.class);
        if(ShotJugador != null){
            Mar m = (Mar)getWorld();
            for(i = 1;i <= 5;i ++){
                setImage("Explosion" +i+ ".png");
            }
            getWorld().removeObject(ShotJugador);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion1.wav");
        }
        else{
            eliminaObjectoBorde();
        }
    }
    
    /**
     * Elimina el objeto si sale del borde de juego.
     */
    public void eliminaObjectoBorde()
    {
        if(getX() >= getWorld().getWidth() - 5 || getX() <= 5){
            getWorld().removeObject(this);
        }
        else{
             if(getY() >= getWorld().getHeight() - 5 || getY() <= 5){
                getWorld().removeObject(this);
             }
        }
    }
    
    /**
     * Mueve el avion aliado hacia el lado izquierdo
     */
    public void movimientoIzquierdo()
    {
        move(-2);
        setRotation(-90);
        move(2);
        setRotation(0);
    }
    
    /**
     * mueve el avion aliiado hacia el lado derecho.
     */
    public void movimientoDerecho()
    {
        move(2);
        setRotation(90);
        move(-2);
        setRotation(0);
    }
    
    /**
     * agrega una vida al escenario
     */
    public void addVida()
    {
        if(vida  && getY() == getWorld().getHeight()/2 + 1){
            Vida v = new Vida();
            getWorld().addObject(v,getX(),getY() - 35);
            vida = false;
        }
        
        if(!vida){
            vida = true;
        }
    }
}
