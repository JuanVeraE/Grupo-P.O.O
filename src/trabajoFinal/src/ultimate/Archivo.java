package unal.registros;

import java.io.*;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Archivo {
    
    File archivo;
    
    public void crearArchivo(){
        //Creo el archivo
        try{
            //"C:\\Users\\sebastian\\OneDrive\\Documentos\\GitHub\\Grupo-P.O.O\\src\\trabajoFinal\\src\\finalpoo\\registro.csv";
            String direccion="C:\\Users\\sebastian\\OneDrive\\Documentos\\GitHub\\Grupo-P.O.O\\src\\trabajoFinal\\src\\finalpoo\\registro.csv";
            File archivo=new File(direccion);
            if(archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "Archivo Creado");
            }
        }catch(IOException e){
                System.out.println(e);
        }
    }
    
    public void escribirArchivo(Persona persona){
        try{
            FileWriter escritura= new FileWriter("C:\\Users\\sebastian\\OneDrive\\Documentos\\GitHub\\Grupo-P.O.O\\src\\trabajoFinal\\src\\finalpoo\\registro.csv", true);
            escritura.write(persona.getNombre()+","+persona.getApellido()+","+persona.getCedula()+"\r\n");
            escritura.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
       
       public void borrarPersona(Persona persona){
           
        File inputFile = new File("");
        File tempFile = new File("myTempFile.txt");
        //capturo los datos de la persona
        String nombre=persona.getNombre();
        String apellido=persona.getApellido();
        String cedula=persona.getCedula();
        try{
            FileReader fr = new FileReader(archivo);
            FileWriter fw = new FileWriter(archivo);
            BufferedReader br = new BufferedReader(fr);
            String[] tempArr;
            //FileWriter escritor= new FileWriter(archivo, true);
            String texto = br.readLine();
            while(texto != null) {
                tempArr = texto.split(",");
                //String de los registros
                String nombreRegistro=tempArr[0];
                String apellidoRegistro=tempArr[1];
                String cedulaRegistro=tempArr[2];
                //si los registros coinciden
                if( nombre.equals(nombreRegistro) &&
                    apellido.equals(apellidoRegistro)&&
                    cedula.equals(cedulaRegistro)){
                    //Borrar
                    
                    //
                }
                texto = br.readLine();
            }
            //escritor.write(persona.getNombre()+","+persona.getApellido()+","+persona.getCedula()+"\r\n");
            //escritor.close();
        }catch(IOException e){
            System.out.println(e);
        }
            
    }
}
