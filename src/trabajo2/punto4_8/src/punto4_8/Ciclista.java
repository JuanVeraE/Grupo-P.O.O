package punto4_8;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcum = 0;
    
    public Ciclista(int identificador, String nombre){
        this.identificador = identificador;
        this.nombre = nombre;    
    }
    
    abstract String imprimirTipo();

    protected void setIdentificador() {
        this.identificador = identificador;
    }
    
    protected int getIdentificador(){
        return identificador;
    }
    
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosiciónGeneral(int posiciónGeneral) {
        return posiciónGeneral;
    }

    protected void setPosicionGeneral(int posicionGeneral) {
        posicionGeneral = posicionGeneral;
    }

    protected int getTiempoAcum() {
        return tiempoAcum;
    }
    
    protected void setTiempoAcum(int tiempoAcum) {
        this.tiempoAcum = tiempoAcum;
    }
    
    protected void imprimir() {
        System.out.println("ID: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcum);
    }
}
