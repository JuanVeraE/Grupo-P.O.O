package unal.registros;

import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Registros {
    public static void main(String[] args) {
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
        
        //Creo la ventana
        frmRegistros principal= new frmRegistros();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
