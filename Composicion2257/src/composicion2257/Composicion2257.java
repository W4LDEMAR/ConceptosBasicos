/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author Saul
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Muro muroNorte = new Muro();
        muroNorte.setPuerta(new Puerta("Madera", Color.white, true));
        Ventana[] tmpVentana = new Ventana[2];
        tmpVentana[0] = new Ventana("Madera", Color.yellow, 0.5f, 1.0f);
        tmpVentana[1] = new Ventana("Madera", Color.green, 0.5f, 1.0f);
        muroNorte.setVentanas(tmpVentana);
        
        System.out.println(muroNorte);
        System.out.println(muroNorte.getVentanas()[0]);
        System.out.println(muroNorte.getVentanas()[1]);
        muroNorte.getPuerta().setMaterial("Aluminio");
        System.out.println(muroNorte);
        muroNorte.getVentanas()[1].setMaterial("Aluminio");
        System.out.println(muroNorte.getVentanas()[1]);
        
        Muro muroSur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, 
                new Puerta("Aluminio", Color.white, false), null);
        System.out.println("Ejemplo de herencia:" );
        PuertaDeSeguridad puer1 = new PuertaDeSeguridad();
        System.out.println(puer1);
        puer1.abrir();
        puer1.cerrar();
        puer1.setColor(Color.gray);
        System.out.println("El color de la puerta de sefuridad es:" + puer1.getColor());
        
        PuertaDeSeguridad puer2 = new PuertaDeSeguridad("Chapa electronica", "1234dios", "metal", Color.gray, false);
        System.out.println(puer2.toString());
    }
    
}
