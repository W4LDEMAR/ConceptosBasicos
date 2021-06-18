/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;
import ico.fes.inegi.EncuestadorInegi;

/**
 *
 * @author Waldemar
 */
public class PruebaEncuestas {
    public static void main(String[] args) {
        EncuestadorInegi e1= new EncuestadorInegi();
        e1.setNombre("Saul");
        e1.setDispositivo(new SmartPhone("LG", "MT1", "Gris", 6.0f));
        System.out.println(e1.getNombre());
        e1.setNombre("Mario");
        System.out.println(e1.getNombre());
        System.out.println(e1.getDispositivo().getColor());
        e1.getDispositivo().setModelo("LTT23");
        System.out.println(e1.getDispositivo().getModelo());
    }
}
