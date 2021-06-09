/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

/**
 *
 * @author Waldemar
 */
public class SmartPhone {
    private String marca;
    private String modelo;
    private String color;
    private float tamano;

    public SmartPhone() {
    }

    public SmartPhone(String m, String mod, String c, float t) {
        this.marca = m;
        this.modelo = mod;
        this.color = c;
        this.tamano = t;
    }

    public SmartPhone(String m) {
        this.marca = m;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamano=" + tamano + '}';
    }
    
    public boolean encender(){
        System.out.println("Encendiendo el equipo " + this.marca);
        return true;
    }
    
    public int llamar(int numeroDestino){
        System.out.println("Llamando al numero " + numeroDestino);
        return 60;
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto...");
    }
    
}
