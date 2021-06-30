/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamulltiple;

import ico.fes.programacion.ProfesorProgramacion;

/**
 *
 * @author Saul
 */
public class HerenciaMulltiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorProgramacion profe = new ProfesorProgramacion(20, "Java");
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probrarCodigo();
        profe.dormir();
        System.out.println(profe);
        
    }
    
}
