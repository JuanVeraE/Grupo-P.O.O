package trabajofinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrabajoFinal {
    
    File archivo;
    
    public void crearArchivo() {
        archivo = new File("formulario.txt");
    }
    
    public void escribirArchivo(persona Persona) {
        try {
            FileWriter escrito = new FileWriter(archivo,true);
            escrito.write(Persona.getNombre() + ", " + Persona.getApellido() + ", " + Persona.getCedula() + ". \n" );
        } catch (IOException ex) {
            Logger.getLogger(TrabajoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
