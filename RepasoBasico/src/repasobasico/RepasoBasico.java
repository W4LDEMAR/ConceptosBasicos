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
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhone cel1 = new SmartPhone("Samsung");
        SmartPhone cel2 = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        System.out.println(cel1);
        System.out.println(cel2);
        
        //Uso de metodo de acceso
        cel1.setModelo("Galaxy Note 10");
        System.out.println(cel1);
        System.out.println("Marca del cel:" + cel1.getMarca());
        
        cel1.setTamano(5.6f);
        System.out.println(cel1);
        
        EncuestadorInegi enc1 = new EncuestadorInegi();
        enc1.setDispositivo(cel2);
        
    }    
}
