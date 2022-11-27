/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unal.ultimate;

import javax.swing.JFrame;

/**
 *
 * @author sebastian
 */
public class Ultimate {

    public static void main(String[] args) {
        //Creo la ventana
        ventana principal= new ventana();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
