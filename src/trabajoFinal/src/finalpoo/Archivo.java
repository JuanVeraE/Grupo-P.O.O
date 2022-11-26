package unal.finalpoo;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {
    
    File archivo;
    public void crearArchivo(){
        try{
            archivo=new File("Registro.csv");
            if(archivo.createNewFile()){
            JOptionPane.showMessageDialog(null, "Archivo Creado");}
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void escribirArchivo(Persona persona){
        try{
            FileWriter escritura= new FileWriter(archivo, true);
            escritura.write(persona.getNombre()+","+persona.getApellido()+","+persona.getCedula()+"\r\n");
            escritura.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
