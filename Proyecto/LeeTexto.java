import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.awt.Color;
/**
 * Esta clase Lee dos archivos de texto del juego, los dos archivos que lee esta clase son los archivos
 * para mostrar la ayuda y los créditos (“ayuda.txt & “creditos.txt”). La Clase recibe como parámetro
 * una cadena usada para establecer cuál de los dos archivos leerá. Cuando va leyendo el archivo para
 * mostrarlo en pantalla se crean Objetos de la clase Label y se agregan para ser visualizados en
 * pantalla.
 * 
 * @author Sergio Abraham Galarza Montiel
 * @version 07/05/2016
 */
public class LeeTexto extends Actor
{
    private File archivo;
    private Scanner entrada;
    private boolean archivoOk;
    private boolean show;
    
    /**
     * metodo constructor inicializa las variables para leer el archivo
     * @param tipoDeTexto se le pasa el nombre del archivo que leera para
     * mostrar su informacion solo puede ser de dos tipos
     */
    public LeeTexto(String tipoDeTexto){
        if(tipoDeTexto.equals("ayuda")){
            archivo = new File("ayuda.TXT");
        }
        else if(tipoDeTexto.equals("creditos")){
            archivo = new File("creditos.TXT");
        }
        
        //archivo = new File("Ayuda.TXT");
        Scanner entrada = null;
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
      //File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
     
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("ayuda.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         // Lectura del fichero
         String linea;
         int y = 50;
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            Label l = new Label(linea,25);
            l.setFillColor(Color.GREEN);
            l.setLineColor(Color.GREEN);
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


