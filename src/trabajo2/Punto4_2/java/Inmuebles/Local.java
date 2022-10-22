package Inmuebles;

public class Local extends Inmueble{
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;
    
    public Local(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, área, dirección);
    this.tipoLocal = tipoLocal;
    }
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Tipo de local = " + tipoLocal);
    }
}
