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
public class Cajero_automatico {
    private int idcajeroult;
    private int idcajero;
    private int [][] billetes;
    private Tarjeta tarjetas;

    public Cajero_automatico() {
    }

    

    public int getIdcajeroult() {
        return idcajeroult;
    }

    public Cajero_automatico(int idcajeroult, int idcajero, int[][] billetes, Tarjeta tarjetas) {
        this.idcajeroult = idcajeroult;
        this.idcajero = idcajero;
        this.billetes = billetes;
        this.tarjetas = tarjetas;
    }

    public void setIdcajeroult(int idcajeroult) {
        this.idcajeroult = idcajeroult;
    }

    public int getIdcajero() {
        return idcajero;
    }

    public void setIdcajero(int idcajero) {
        this.idcajero = idcajero;
    }

    public int[][] getBilletes() {
        return billetes;
    }

    public void setBilletes(int[][] billetes) {
        this.billetes = billetes;
    }

    public Tarjeta getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Tarjeta tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    public static void mostarCaixer(int [][] billetes) {
        billetes = new int [7][2];
        for (int i = 0; i < billetes.length; i++) {
            for (int j = 0; j < billetes.length; j++) {
                System.out.println(billetes[j] + " billetes de " + billetes[j+1]);
                               
                
            }
            
        }
    
    }
    
    
}
