/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author Saul
 */
public class PuertaDeSeguridad extends Puerta {

    private String mecanismo;
    private String contrasenia;

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String mecanismo, String contraseña) {
        this.mecanismo = mecanismo;
        this.contrasenia = contraseña;
    }

    public PuertaDeSeguridad(String mecanismo, String contraseña, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.mecanismo = mecanismo;
        this.contrasenia = contraseña;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return super.toString() + "PuertaDeSeguridad{" + "mecanismo=" + mecanismo + ", contrasenia=" + contrasenia + '}';
    }

    public boolean verificar() {
        System.out.println("Verificando...");
        return this.contrasenia != null;
    }

    @Override
    public void abrir() {
        if (this.getContrasenia() == "1234dios") {

        }
        super.abrir(); //To change body of generated methods, choose Tools | Templates.
    }

}
