import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Estas clases agregan los Objetos del juego basados en ciertos tiempos para cada Objeto, todo esto
 * implementado con los Métodos de su súper clase (Mar) también valida si el Objeto destruyo a su
 * enemigo para pasar al siguiente nivel. En caso de terminar el Tercer el juego esta clase te regresa al
 * menú principal del juego.
 * 
 * @author Sergio Abraham Galarza 
 * @version 16/Mayo/2016
 */
public class Nivel3 extends Mar
{

    /**
     * Constructor for objects of class Nivel3.
     * @param vidas se le pasa el numero de vidas actuales al nivel
     * @param score se le pasa la puntuacion actual al jugador
     */
    public Nivel3(int vidas,int score)
    {
        super(vidas,score);
    }
    
    @Override
    public void act()
    {
        if(super.timeAddEnemigo(1)){
            super.addEnemigo();
        }
        
        if(super.timeAddAliado(4) && !super.getAmbiente()){
            super.addAliado();// agrega aliado
        }
        
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addPunto();
        }
        
        if(super.timerAddNube(7) && !super.getAmbiente()){
            super.addNube();
            
        }
        
        if(super.timeAddFinal(70) && !super.getAmbiente()){
            super.addLiderEnemigo(150);
            super.addLiderEnemigo(350);
            super.setAmbiente(true);
        }
        
        if(super.getEnemigoFinal() == 2 ){
            super.addTexto("Juego Terminado",35,getWidth() / 2, getHeight() / 2);
            int x = super.getScoreJugador();
            String cade = ""+x;
            super.addTexto(cade,35,getWidth() / 2, (getHeight() / 2) + 50);
            Greenfoot.delay(200);
            Menu menu = new Menu();
            Greenfoot.setWorld(menu);
        }
        super.terminaJuego();
        super.scroll();
    }
}
