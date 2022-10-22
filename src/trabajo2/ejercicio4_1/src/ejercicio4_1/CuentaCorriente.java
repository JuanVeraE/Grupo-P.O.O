package ejercicio4_1;

public class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }
    
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo = saldo - cantidad;
            numRetiros = numRetiros + 1;
        } else {
            sobregiro = (sobregiro + cantidad - saldo);
            saldo = 0;
        }
    }
    public void consignar(float cantidad){
        super.consignar(cantidad);
        float nuevoSaldoCon = sobregiro - cantidad;
        if (sobregiro != 0){
            if (nuevoSaldoCon >= 0){
                sobregiro = sobregiro - cantidad;
            }else{
                saldo = (saldo + cantidad - sobregiro);
                sobregiro = 0;
            }

        }
    }
    public void extractoMensual(){
        super.extractoMensual();
    }
    public void imprimir(){
        int numTrans = numConsignaciones + numRetiros; 
        System.out.println("Saldo de la cuenta: $" + saldo);
        System.out.println("Comision mensual: $" + comMensual);
        System.out.println("Número de transacciones: " + numTrans);
        System.out.println("Valor sobregiro: $" + sobregiro);
    }
    
}
