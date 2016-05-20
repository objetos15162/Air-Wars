import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
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
        
        if(super.timeAddFinal(75) && !super.getAmbiente()){
            super.addLiderEnemigo(150);
            super.addLiderEnemigo(350);
            super.setAmbiente(true);
        }
        
        if(super.getEnemigoFinal() == 2 ){
            super.addTextoNivel("Juego Terminado",35);
            Greenfoot.delay(200);
            Menu menu = new Menu();
            Greenfoot.setWorld(menu);
        }
        super.scroll();
    }
}
