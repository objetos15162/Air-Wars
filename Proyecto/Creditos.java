import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se crean un Objeto de la Clase tipo LeeTexto pasándole como parámetro (“creditos”)
 * el Texto que va leer y mostrar en pantalla. También se le da una imagen a esta clase, que es la
 * imagen que muestra de fondo cuando agrega el texto.
 * 
 * @author Sergio Abraham Galarza
 * @version 23/Mayo/2016
 */
public class Creditos extends Boton
{
    /**
     * Metodo constructor
     */
    
    public Creditos()
    {
        super();
    }
    
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
     if(super.click()){
        LeeTexto ayuda = new LeeTexto("creditos");
        getWorld().addObject(ayuda,getWorld().getHeight()/2,getWorld().getHeight()/2);
     }    
    }
}
