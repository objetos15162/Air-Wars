import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase representa la imagen de menu y en ella se agregan sus botones
 * de opciones del juego.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 06/05/2016
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500,500, 1); 
        prepare();
    }
    
    /**
     * agrega los objetos (botones) que tiene el menu por defecto.
     * jugar - ayuda - record - salir
     */
    private void prepare()
    {
        Jugar jugar = new Jugar();
        Ayuda ayuda = new Ayuda();
        Creditos record = new Creditos();
        Salir salir = new Salir();
        int x = getWidth() / 2;
        addObject(jugar,x,140);
        addObject(ayuda,x,210);
        addObject(record,x,280);
        addObject(salir,x,350);
    }
    
}


