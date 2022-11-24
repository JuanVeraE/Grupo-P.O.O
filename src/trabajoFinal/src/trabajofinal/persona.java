package trabajofinal;

public class persona {
    String cedula, nombre, apellido;
    public persona (String nombre, String apellido, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    void agregar(String elemento){
        
    }
}
