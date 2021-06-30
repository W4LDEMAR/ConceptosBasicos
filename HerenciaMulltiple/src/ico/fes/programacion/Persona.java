/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.programacion;

/**
 *
 * @author Saul
 */
public class Persona {
    private String nombre;
    private int eddad;

    public Persona() {
    }

    public Persona(String nombre, int eddad) {
        this.nombre = nombre;
        this.eddad = eddad;
    }

    public int getEddad() {
        return eddad;
    }

    public void setEddad(int eddad) {
        this.eddad = eddad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", eddad=" + eddad + '}';
    }
    
    public void dormir(){
        System.out.println(this.nombre + "esta durmiendo...");
    }
    
    public void comer(){
        System.out.println(this.nombre + "esta comiendo...");
    }
}
