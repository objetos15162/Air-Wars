import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es usada para cuando el enemigo dispara se crea un Objeto de este tipo que se mueve de
 * la parte superior a la inferior a diferencia del shotEnemigo la imagen es cambiada mientras el Objeto
 * de esta clase se mantiene en el área de juego.
 * 
 * @author Sergio Abraham Galarza  
 * @version 04/Mayo/2016
 */
public class ShotLider extends Shot
{
    private int imagShot;
    
    /**
     * Metodo constructor
     * @param direction es un entero que asigna la ddireccion de disparo
     */
    public ShotLider(int direction)
    {
        super(direction);
        imagShot = 1;
    }
    
    
    /**
     * Act - do whatever the ShotLider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("ShotLider"+imagShot+".png");
        super.mueveShot();
        if(imagShot < 5){
            imagShot ++ ;
        }
        else{
            imagShot = 1;
        }
        super.eliminaObjetoBorde();
    }
}    

