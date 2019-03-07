/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

/**
 *
 * @author josea
 */
public class Tarjeta_debito extends Tarjeta{
    private int saldo;

    public Tarjeta_debito() {
    }

    public Tarjeta_debito(int saldo, String nif, int pin, String nombre, 
            String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
   
    @Override
    public void mostrarTarjeta(){
        super.mostrarTarjeta();
        System.out.println("Saldo: " + this.saldo);
        
    }
    
    @Override
    public void sacarDinero(){
        super.sacarDinero();
        if (reintegro>getSaldo()){
            
        }
        
    }
    
}
