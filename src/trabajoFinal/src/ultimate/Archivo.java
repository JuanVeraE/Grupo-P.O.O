package unal.ultimate;

import java.io.*;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Archivo {
    
    File archivo;
    //"C:\\Users\\";
    String direccion="./";
    String name="registro.csv";
    
    public void crearArchivo(){
        //Creo el archivo
        try{
            File archivo=new File(direccion+name);
            if(archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "Archivo Creado");
            }
        }catch(IOException e){
                System.out.println(e);
        }
    }
    
    public void escribirArchivo(Persona persona){
        try{
            FileWriter escritura= new FileWriter(direccion+name, true);
            escritura.write(persona.getNombre()+","+persona.getApellido()+","+persona.getCedula()+"\r\n");
            escritura.close();
            JOptionPane.showMessageDialog(null, "Persona Agregada");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    
    public void editarPersona(Persona persona,String cedulaVieja){
        
        String cedula=persona.getCedula();
        String apellido=persona.getApellido();
        String nombre=persona.getNombre();
        
        try{
            
            File inputFile = new File(direccion+name);//archivo
            File tempFile = new File(direccion+"temp_"+name);//newArchivo

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String cedulaToRemove = cedulaVieja;
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String[] datos = currentLine.trim().split(",");
                
                if(datos[2].trim().equals(cedulaToRemove.trim())) continue;
                    writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.write(nombre+","+apellido+","+cedula+"\n");
            writer.close(); 
            reader.close();
            
            inputFile.delete();
            boolean flag = tempFile.renameTo(inputFile);
            JOptionPane.showMessageDialog(null, "Se edito"); 
            
            
    
        }catch(IOException e){
            System.out.println(e);
        }
    }
       
    public void borrarPersona(String cedula){
        try{

            File inputFile = new File(direccion+name);//archivo
            File tempFile = new File(direccion+"temp_"+name);//newArchivo

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String cedulaToRemove = cedula;
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String[] datos = currentLine.trim().split(",");
                if(datos[2].trim().equals(cedulaToRemove.trim())) continue;
                    writer.write(currentLine + System.getProperty("line.separator"));
                    
            }
            writer.close(); 
            reader.close(); 
            inputFile.delete();
            boolean flag = tempFile.renameTo(inputFile);
            
            JOptionPane.showMessageDialog(null, "Registro editado"); 
    
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public String mostrarPersonas(){
        String totalAnswer="";
        try {
            File inputFile = new File(direccion+name);//archivo
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String currentLine;
            
            // Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero

            while((currentLine = reader.readLine()) != null) {
                totalAnswer=totalAnswer+"\n"+currentLine;
            }
            reader.close();

        }catch(IOException e){
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, "Refrescado");
        return totalAnswer;
    }
}
