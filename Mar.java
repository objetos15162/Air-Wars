import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Mar here.
 * 
 * @author Sergio Abraham Galarza
 * @version 30/04/2016
 */
public class Mar extends World
{
    private SimpleTimer timer;
    private SimpleTimer timerAliado;
    private SimpleTimer timerPunto;
    private SimpleTimer timerNube;
    private SimpleTimer timerFinal;
    private Background ima0;
    private Background ima1;
    private int vida;
    private Counter vidas;
    private Counter score;
    private Avion avion;
    private int enemigoFinal;
    /**
     * Constructor for objects of class Mar.
     * 
     */
    public Mar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1,false); 
        ima0 = new Background();
        addObject(ima0,getWidth()/2,getHeight()/2);
        
        ima1 = new Background();
        addObject(ima1,getWidth()/2,0 - getHeight()/2);
        
        avion = new Avion();
        addObject(avion,250,getHeight()-35);
        
        timer = new SimpleTimer();//tiempo para agragar enemgos
        timerAliado = new SimpleTimer();//tiempo para agregar aliados
        timerPunto = new SimpleTimer();//timepo para agregar puntos
        timerNube = new SimpleTimer();
        timerFinal = new SimpleTimer(); 
        vida = 0;
        enemigoFinal = 0;
        prepare();
    }

    @Override
    public void act()
    {
        if(timeAddEnemigo(3) && !timeAddFinal(12)){
            addEnemigo();
        }
        
        if(timeAddAliado(3) && !timeAddFinal(12)){
            addAliado();// agrega aliado
        }
        
        if(timeAddPunto(12) && !timeAddFinal(12)){
            addPunto();
        }
        
        if(timerAddNube(4) && !timeAddFinal(12)){
            addNube();
            
        }
        
        if(timeAddFinal(4)){
            addLiderEnemigo();
            System.out.println("Si se agrego el final");
        }
        
        /*ima0.scroll();
        ima1.scroll();*/
        Scroll();
       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        vidas = new Counter("Vidas: ");
        score = new Counter("Score: ");
        vidas.setValue(3);
        addObject(vidas,50,15);
        addObject(score,150,15);
    }
    
    /**
     * Agrega un enemigo el metodo genera la posicion y lo agrega al mundo
     */
    public void addEnemigo()
    {
     int x;
     x = Greenfoot.getRandomNumber(15+(getWidth()-15));
     Enemigo e = new Enemigo();
     addObject(e,x,0);
    }
    
    /**
     * Agrega un aliado el metodo asigna su posicion y lo agrega al  mundo
     */
    public void addAliado()
    {
     int x;
     int agrega = Greenfoot.getRandomNumber(2);
     int posicion = Greenfoot.getRandomNumber(2);
     if(posicion == 0)
     {
         x = 0+5;
     }
     else
     {
         x = getWidth()-5;
     }
     
     if(vida == 0 && agrega == 1){
         Aliado a = new Aliado(true);
         vida = 1;
         addObject(a,x,getHeight() - 8);
     }
     else{
         Aliado a =  new Aliado(false);
         addObject(a,x,getHeight() - 8);
     }
     
    }
    
    /**
     * Crea y agrega un enemigo final
     * genera su posicion en x.
     */
    public void addLiderEnemigo(){
        int x = Greenfoot.getRandomNumber(50 + (getWidth() - 100));
        LiderEnemigo liderEnemigo = new LiderEnemigo();
        addObject(liderEnemigo ,x, 55);
    }
    
    /**
     * Agrega un punto el metodo genera su posicion y lo agrega al  mundo
     */
    public void addPunto()
    {
        int x =  Greenfoot.getRandomNumber((getWidth() - 20) + 10);
        Punto p = new Punto();
        addObject(p,x,5);
    }
    
    /**
     * agrega una nube el metodo genera su posicion y la agrega la mundo
     */
    public void addNube()
    {
        int x = Greenfoot.getRandomNumber((getWidth() - 20) + 10);
        Nube n = new Nube();
        addObject(n,x,5);
    }
    
    /**
     * metodo usado chechar tiempo de agregar enemigo.
     * @parama segundo es el tiempo en segundos para agregar enemigos
     * @return boolean regresa un true si a pasado un segundo.
     */
    public boolean timeAddEnemigo(int segundo)//3
    {
        if(timer.millisElapsed() > (segundo * 1000)){
            timer.mark();
            return true;
        } 
        else{
            return false;
        }
    }
    
    /**
     * Metodo usadado para checar el tiempo de agregar el enemigo final
     * @parama segundo es el tiempo en segundos para agregar enemigoFinal
     * @return boolean regresa true si a pasado el tiempo indicado
     */
    public boolean timeAddFinal(int segundo)//4
    {
        if(timerFinal.millisElapsed() > (segundo * 1000) ){ 
           timerFinal.mark();
           return true;
        }
        else{
            return false;
        }
        
    }
    
    /**
     * metodo usado chechar tiempo de agregar un aliado.
     * @parama segundo es el tiempo en segundos para agregar aliados
     * @return boolean regresa un true si a pasado el tiempo indicado
     */
    public boolean timeAddAliado(int segundo )//7
    {
        if(timerAliado.millisElapsed() > (segundo * 1000)){
            timerAliado.mark();
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * metodo usado chechar tiempo de agregar un puntos extra.
     * @parama segundo es el tiempo en segundos para agregar puntos extra
     * @return boolean regresa un true si a pasado el tiempo indicado
     */
    public boolean timeAddPunto(int segundo)//12
    {
        if(timerPunto.millisElapsed() > (segundo * 1000)){
            timerPunto.mark();
            //System.out.println("agregar punto");
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * metodo usado chechar tiempo de agregar una nube.
     * @param segundo es el tiempo en segundos para agregar Nubes Radiocativas
     * @return boolean regresa un true si a pasado el tiempo indicado
     */
    public boolean timerAddNube(int segundo)//7
    {
        if(timerNube.millisElapsed() > (segundo * 1000) ){
            timerNube.mark();
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * @return regresa un objeto de tipo Counter que representa
     * las vidas del jugador.
     */
    public Counter getVidaCunter()
    {
        return vidas;
    }
    
    /**
     * @return regresa un objeto de tipo Counter que representa 
     * la puntuacion(score) del jugador.
     */
    public Counter getScoreCounter()
    {
        return score;
    }
    
    /**
     * @return regresa un objeto de tipo jugador.
     */
    public Avion getJugador()
    {
        return avion;
    }
    
    /**
     * mueve las imagenes de Scroll
     */
    public void Scroll()
    {
        ima0.scroll();
        ima1.scroll();
    }
}
