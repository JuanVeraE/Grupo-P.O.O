package ejercicio4_1;

public class CuentaAhorros extends Cuenta{
    private boolean activa;
    
    public CuentaAhorros(float saldo, float tasa){
        super(saldo,tasa);
        if (saldo >= 10000){
            activa = true;
        } else {
            activa = false;
        }
    }
       
    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }
    }
    public void extractoMensual(){  
        if (numRetiros > 4){
            comMensual = 4 *(numRetiros - 4);
        }
        super.extractoMensual();
        if (saldo < 10000){
            activa = false;
        }
    }
    public void imprimir(){
        int numTrans = numConsignaciones + numRetiros; 
        System.out.println("Saldo de la cuenta: $" + saldo);
        System.out.println("Comision mensual: $" + comMensual);
        System.out.println("Número de transacciones: " + numTrans);
    }
    
}
