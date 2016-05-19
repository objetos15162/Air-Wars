import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author Abraham Galarza Montiel 
 * @version 16/Mayo/2016
 */
public class Nivel1 extends Mar
{

    /**
     * Constructor for objects of class Nivel1.
     * @param vidas se le pasa el numero de vidas actuales al nivel
     * @param score se le pasa la puntuacion actual al jugador
     */
    public Nivel1(int vidas,int score)
    {
        super(vidas,score);
    }
    
    @Override
    public void act()
    {
        if(super.timeAddEnemigo(1) && !super.getAmbiente()){
            super.addEnemigo();
        }
        
        if(super.timeAddAliado(7) && !super.getAmbiente()){
            super.addAliado();// agrega aliado
        }
        
        if(super.timeAddPunto(8) && !super.getAmbiente()){
            super.addPunto();
        }
        
        if(super.timerAddNube(10) && !super.getAmbiente()){
            super.addNube();
            
        }
        
        if(super.timeAddFinal(15) && !super.getAmbiente()){
            super.addLiderEnemigo(250);
            super.setAmbiente(true);
        }
        
        if(super.getEnemigoFinal() == 1 ){
            super.addTextoNivel("Nivel 2",35);
            Greenfoot.delay(200);
            Mar m = new Nivel2(super.getVidasJugador(),super.getScoreJugador());
            Greenfoot.setWorld(m);
        }
        super.terminaJuego();
        super.Scroll();
    }
}
