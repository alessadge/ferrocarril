/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandrogrimaldi_lab3;

/**
 *
 * @author adgri_001
 */
public class Empleado extends Personas {
    private int horas;
    private Cliente cliente;

    public Empleado(int horas, Cliente cliente, String nombre, String ID, int edad, double altura, int peso) {
        super(nombre, ID, edad, altura, peso);
        this.horas = horas;
        this.cliente = cliente;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "horas=" + horas + ", cliente=" + cliente + '}';
    }
    
}
