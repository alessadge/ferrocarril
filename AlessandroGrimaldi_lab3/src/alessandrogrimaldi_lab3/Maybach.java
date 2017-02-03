/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandrogrimaldi_lab3;

import java.awt.Color;
import java.util.Date;


public class Maybach extends Carro {
    protected int repuesto;

    public Maybach(int repuesto) {
        this.repuesto = repuesto;
    }

    public Maybach(int repuesto, String numeroSerie, int velocidad, int kilometros, int precio, Color colorr, Date fecha, String marcaLlanta, String polarizado) {
        super(numeroSerie, velocidad, kilometros, precio, colorr, fecha, marcaLlanta, polarizado);
        setVelocidad(velocidad);
        setKilometros(kilometros);
        setPrecio(precio);
        this.repuesto = repuesto;
    }

    public int getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(int repuesto) {
        this.repuesto = repuesto;
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
        if(velocidad<161&&velocidad>154){
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
        if(precio>=400000&&precio<=600000){
        this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Maybach{" + "repuesto=" + repuesto + '}';
    }
    
    
}
