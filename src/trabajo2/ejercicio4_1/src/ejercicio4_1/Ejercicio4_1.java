package ejercicio4_1;

import java.util.*;
/**
* Esta clase prueba diferentes acciones realizadas por cuentas bancarias
* de tipo Cuenta de ahorros y Cuenta corriente
* @version 1.2/2020
*/
public class Ejercicio4_1{
/**
* Método main que crea una cuenta de ahorros con un saldo inicial
* y una tasa de interés solicitados por teclado, a la cual se realiza una
* consignación y un retiro, y luego se le genera el extracto mensual
*/
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        
        System.out.print("Ingrese tasa de interes= ");
        float tasaAhorros = input.nextFloat();
        
        CuentaCorriente cuenta1 = new
        CuentaCorriente(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");

        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $");

        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        
        input.close();
    }
}
