/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import java.awt.Color;

/**
 *
 * @author Waldemar
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setModelo(1970);
        miBocho.setSubmarca("Sedan");
        miBocho.setColor(Color.blue);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setModelo(2010);
        miMustang.setSubmarca("Mustang");
        miMustang.setColor(Color.yellow);
        
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setModelo(2013);
        miAcura.setSubmarca("NSX");
        miAcura.setColor(Color.gray);
    }
}
