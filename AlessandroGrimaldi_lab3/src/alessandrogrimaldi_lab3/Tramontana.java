/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandrogrimaldi_lab3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author adgri_001
 */
public class Tramontana extends Carro{
    private int peso;
    private int transmision;

    public Tramontana(int peso, int transmision, String numeroSerie, int velocidad, int kilometros, int precio, Color colorr, Date fecha, String marcaLlanta, String polarizado) {
        super(numeroSerie, velocidad, kilometros, precio, colorr, fecha, marcaLlanta, polarizado);
        this.peso = peso;
        this.transmision = transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso>1275&&peso<1377){            
        this.peso = peso;
                  }

    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        this.transmision = transmision;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad>174&&velocidad<181){
        this.velocidad = velocidad;
        }
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        if(kilometros>49&&kilometros<56){
        this.kilometros = kilometros;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio<=1000000&&precio>=800000){
        this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }
    
}
