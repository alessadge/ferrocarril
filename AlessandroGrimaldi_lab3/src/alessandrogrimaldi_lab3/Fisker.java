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
public class Fisker extends Carro {
    private String convert;
    private String camion;

    public Fisker(String convert, String camion, String numeroSerie, int velocidad, int kilometros, int precio, Color colorr, Date fecha, String marcaLlanta, String polarizado) {
        super(numeroSerie, velocidad, kilometros, precio, colorr, fecha, marcaLlanta, polarizado);
        setVelocidad(velocidad);
        setKilometros(kilometros);
        setPrecio(precio);
        this.convert = convert;
        this.camion = camion;
    }

    public String isConvert() {
        return convert;
    }

    public void setConvert(String convert) {
        this.convert = convert;
    }

    public String getCamion() {
        return camion;
    }

    public void setCamion(String camion) {
        this.camion = camion;
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
        if(velocidad>159&&velocidad<166){
        this.velocidad = velocidad;
        }
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        if(kilometros<61&&kilometros>54){
        this.kilometros = kilometros;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio>=450000&&precio<=650000){
        this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Fisker{" + "convert=" + convert + ", camion=" + camion + '}';
    }
    
    
}
