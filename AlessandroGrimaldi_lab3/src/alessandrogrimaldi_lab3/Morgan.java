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
public class Morgan extends Carro {
    private String convert;

    public Morgan() {
    }

    public Morgan(String convert, String numeroSerie, int velocidad, int kilometros, int precio, Color colorr, Date fecha, String marcaLlanta, String polarizado) {
        super(numeroSerie, velocidad, kilometros, precio, colorr, fecha, marcaLlanta, polarizado);
        setVelocidad(velocidad);
        setKilometros(kilometros);
        setPrecio(precio);
        this.convert = convert;
    }

    public String isConvert() {
        return convert;
    }

    public void setConvert(String convert) {
        this.convert = convert;
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
        if(velocidad>139&&velocidad<146){
        this.velocidad = velocidad;
        }
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        if(kilometros>34&&kilometros<41){
        this.kilometros = kilometros;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio<=700000&&precio>=500000){
        this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Morgan{" + "convert=" + convert + '}';
    }
    
    
}
