package punto4_8;

import java.util.*;

public class Equipo {
    private static double tiempoTotal;
    private String pais, nombre;
    Vector ciclistas;
    
    public Equipo(String nombre, String pais) {
        this.pais = pais;
        this.nombre = nombre;
        tiempoTotal = 0;
        ciclistas = new Vector();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getPaís() {
        return pais;
    }

    private void setPaís(String país) {
        this.pais = pais;
    }

    void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }
    
   
    void calcularTotalTiempo() {
    for (int i = 0; i < ciclistas.size(); i++) {
        Ciclista c = (Ciclista) ciclistas.elementAt(i);
        tiempoTotal += c.getTiempoAcum();
        }
    }
 
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); 
        String nombreCiclista = sc.next();
        
        for (int i = 0; i < ciclistas.size(); i++) { 
            Ciclista c = (Ciclista) ciclistas.elementAt(i); 
            if (c.getNombre().equals(nombreCiclista)) { 
                System.out.println(c.getNombre());
            } else {
                System.out.println("Ciclista no encontrado");
            }
        }
    }  
    
    void listarEquipo(){
        for(int i = 0; i < ciclistas.size(); i++){
            Ciclista c =(Ciclista) ciclistas.elementAt(i);
            System.out.println(c.getNombre());           
        }
    }
    
    void imprimir(){
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotal);
    }
}
