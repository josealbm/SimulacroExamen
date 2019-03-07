/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Tarjeta {
    protected String nif;
    protected int pin;
    protected String nombre;
    protected String apellido;

    public Tarjeta() {
    }

    public Tarjeta(String nif, int pin, String nombre, String apellido) {
        this.nif = nif;
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void mostrarTarjeta(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("NIF : " + this.nif);
    }
    public static boolean buscarNif(ArrayList<Tarjeta> listaTarjetas, 
            String nif){
        boolean encontrado = false;
        int i = 0;
        while (encontrado==false && i<listaTarjetas.size()){
            if (listaTarjetas.get(i).getNif().equals((nif))){
                 listaTarjetas.get(i).getNif();
                 encontrado = true;
                 i++;
            }else{
                System.out.println("No existe el DNI");
                encontrado = false;
                i++;
                
                
            }
        }return encontrado;
    }
    public static boolean buscarPin(ArrayList<Tarjeta> listaTarjetas, 
            int pin){
        boolean encontrado = false;
        int i = 0;
        while (encontrado==false && i<listaTarjetas.size()){
            if (listaTarjetas.get(i).getPin() == pin){
                 listaTarjetas.get(i).getPin();
                 encontrado = true;
                 i++;
            }else{
                System.out.println("No existe el DNI");
                encontrado = false;
                i++;
                
            } 
        }return encontrado;
    }
    
    public void sacarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indícame tu DNI");
        String dni = sc.nextLine();
        System.out.println("Por favor, escribe tu PIN");
        int pincliente = sc.nextInt();
        if (buscarNif(listaTarjetas, dni) && buscarPin(listaTarjetas, pincliente)
                == true){
            System.out.println("¿Qué importe quieres sacar?");
            int reintegro = sc.nextInt();
        }else{
            if (buscarNif(listaTarjetas, dni)==false){
                System.out.println("DNI incorrecto, por favor, "
                        + "vuélvelo a intentar");
            }else if (buscarPin(listaTarjetas, pincliente)==false){
                System.out.println("PIN incorrecto, vuélvelo a introducir");
            }else{
                System.out.println("Has introducido mal ambos campos, "
                        + "vuélvelo a intentar, por favor");
            }
            
        }
            
        
        
        
    }
}