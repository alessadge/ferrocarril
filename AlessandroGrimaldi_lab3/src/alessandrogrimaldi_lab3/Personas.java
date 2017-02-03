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
public class Personas {
    protected String nombre, ID;
    protected int  edad, peso;
    protected double altura;

    public Personas() {
    }

    public Personas(String nombre, String ID, int edad, double altura, int peso) {
        this.nombre = nombre;
        this.ID = ID;
        setEdad(edad);
        setAltura(altura);
        setPeso(peso);
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
        if(edad>17){
        this.edad = edad;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura>1.54){
        this.altura = altura;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso>119){
         this.peso = peso;   
        } 
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", ID=" + ID + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
            
}
