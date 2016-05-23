import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase es usada para el scroll del juego la cual tiene una imagen que es centrada tanto en x como
 * en y del área de juego. La imagen es usada como un Objeto que se mueve de la parte superior a la
 * parte inferior de la pantalla. Para hacer la simulación del scroll en el Mundo se agregan dos Objetos
 * de este tipo, una imagen es centrada y la segunda imagen esta por la parte superior del área del
 * juego (esta no es visible por primera vez) y entonces estas dos imágenes se mueven una detrás de
 * otra.
 * 
 * @author Kavin Rowan modificado por Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class Background extends Actor
{
    /**
     * Metodo constructor
     */
    public Background()
    {
        
    }
    
    /**
     * 
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * En el metodo se mueve la imagen con respecto a las cordenadas en Y
     */
    public void scroll()
    {
        if(getY() > 3 * getImage().getHeight() / 2){
            setLocation(getX() ,0 - (250 - 2));
        }
        setLocation(getX(),getY() + 2);
        /*System.out.println("getY: "+getY());
        System.out.println("getImage: "+(3*getImage().getHeight()/2));*/
    }
}
