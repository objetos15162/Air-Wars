import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class AyudaTexto here.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 07/05/2016
 */
public class AyudaTexto extends Actor
{
    private File archivo;
    private Scanner entrada;
    private boolean archivoOk;
    private boolean show;
    
    /**
     * metodo constructor inicializa las variables para leer el archivo
     */
    public AyudaTexto(){
        archivo = new File("Ayuda.TXT");
        Scanner entrda = null;
        archivoOk = false;
        show = false;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(!show){
        leeArchivo2();
        show = true;
       }
       
       if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Menu());
       }
    }  
    
   /**
    * Lee un archivo de Texto (TXT) que contiene la ayuda de juego
    */ 
    private void leeArchivo2()
   {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
     
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("ayuda.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         // Lectura del fichero
         String linea;
         int y = 100;
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            Label l = new Label(linea,25);
            getWorld().addObject(l,getWorld().getWidth()/2,y);
            y += 25;
        }
    }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
 
  }


