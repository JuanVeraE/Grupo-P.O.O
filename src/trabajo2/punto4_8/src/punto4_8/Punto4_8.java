package punto4_8;

public class Punto4_8 {

    public static void main(String args[]) {
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas",320, 25);

        Escalador escalador1 = new Escalador(123980, "Egan Bernal",25, 10);

        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981,"Jonathan Castroviejo", 120);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcum(365);
        escalador1.setTiempoAcum(385);
        contrarrelojista1.setTiempoAcum(370);
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
}