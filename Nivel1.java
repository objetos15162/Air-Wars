import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Mar
{

    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {
    }
    
    @Override
    public void act()
    {
        if(super.timeAddEnemigo(2))
        {
            super.addEnemigo();
        }
        super.Scroll();
    }
}
