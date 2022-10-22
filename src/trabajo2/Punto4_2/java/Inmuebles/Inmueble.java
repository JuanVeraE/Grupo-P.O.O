package Inmuebles;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;
    
    Inmueble(int identificadorInmobiliario, int área, String dirección) {
    this.identificadorInmobiliario = identificadorInmobiliario;
    this.area = área;
    this.direccion = dirección;
    }
    
    double calcularPrecioVenta(double valorArea) {
    precioVenta = area * valorArea;
    return precioVenta;
    }
    
    void imprimir() {
    System.out.println("Identificador inmobiliario =" +identificadorInmobiliario);
    System.out.println("Area = " + area);
    System.out.println("Dirección = " + direccion);
    System.out.println("Precio de venta = $" + precioVenta);
    }
    
}

