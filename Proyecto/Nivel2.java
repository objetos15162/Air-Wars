import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Estas clases agregan los Objetos del juego basados en ciertos tiempos para cada Objeto, todo esto
 * implementado con los Métodos de su súper clase (Mar) también valida si el Objeto destruyo a su
 * enemigo para pasar al siguiente nivel. En caso de terminar el Tercer el juego esta clase te regresa al
 * menú principal del juego.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 16/Mayo/2016
 **/
public class Nivel2 extends Mar
{

    /**
     * Constructor for objects of class Nivel2.
     * @param vidas se le pasa el numero de vidas actuales al nivel
     * @param score se le pasa la puntuacion actual al jugador
     */
    public Nivel2(int vidas,int score)
    {
        super(vidas,score);
    }
    
    @Override
    public void act()
    {
        if(super.timeAddEnemigo(2) && !super.getAmbiente()){
            super.addEnemigo();
        }
        
        if(super.timeAddAliado(5) && !super.getAmbiente()){
            super.addAliado();// agrega aliado
        }
        
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addPunto();
        }
        
        if(super.timerAddNube(9) && !super.getAmbiente()){
            super.addNube();
            
        }
        
        if(super.timeAddFinal(70) && !super.getAmbiente()){
            super.addLiderEnemigo(150);
            super.addLiderEnemigo(350);
            super.setAmbiente(true);
        }
        
        if(super.getEnemigoFinal() == 2 ){
            super.addTexto("Nivel 3",35,getWidth() / 2,getHeight() / 2);
            Greenfoot.delay(200);
            Mar m = new Nivel3(super.getVidasJugador(),super.getScoreJugador());
            Greenfoot.setWorld(m);
        }
        super.terminaJuego();
        super.scroll();
    }
}
