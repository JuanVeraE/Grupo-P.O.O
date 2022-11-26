package unal.finalpoo;

public class Persona {
    private String nombre, apellido, cedula;

    public Persona(String nombre, String apellido, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
