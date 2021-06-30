/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;


import java.awt.HeadlessException;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Saul
 */
public class miVentana extends JFrame implements WindowListener{

    public miVentana() throws HeadlessException {
        super("Mi ventana");
        setSize(600,400);
        setVisible(true);
        addWindowListener(this);
    }

    
}
