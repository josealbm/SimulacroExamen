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
public class Tarjeta_credito extends Tarjeta{
    private int saldo;
    private int credito;

    public Tarjeta_credito() {
    }

    public Tarjeta_credito(int saldo, int credito, String nif, int pin, String nombre, String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
        this.credito = credito;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    @Override
    public void mostrarTarjeta(){
        super.mostrarTarjeta();
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Crédito: " + this.credito);
        
    }
    
}
