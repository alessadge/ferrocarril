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
public class Carro {
    protected int velocidad, kilometros, precio;
    private Color colorr;
    private Date fecha;
    protected String marcaLlanta,numeroSerie;
    private String polarizado;

    public Carro() {
    }

    public Carro(String numeroSerie, int velocidad, int kilometros, int precio, Color colorr, Date fecha, String marcaLlanta, String polarizado) {
        this.numeroSerie = numeroSerie;
        this.velocidad = velocidad;
        this.kilometros = kilometros;
        this.precio = precio;
        this.colorr = colorr;
        this.fecha = fecha;
        this.marcaLlanta = marcaLlanta;
        this.polarizado = polarizado;
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
        this.velocidad = velocidad;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Color getColorr() {
        return colorr;
    }

    public void setColorr(Color colorr) {
        this.colorr = colorr;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMarcaLlanta() {
        return marcaLlanta;
    }

    public void setMarcaLlanta(String marcaLlanta) {
        this.marcaLlanta = marcaLlanta;
    }

    public String isPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    @Override
    public String toString() {
        return "Carro{" + "numeroSerie=" + numeroSerie + ", velocidad=" + velocidad + ", kilometros=" + kilometros + ", precio=" + precio + ", colorr=" + colorr + ", fecha=" + fecha + ", marcaLlanta=" + marcaLlanta + ", polarizado=" + polarizado + '}';
    }
    
    
}
