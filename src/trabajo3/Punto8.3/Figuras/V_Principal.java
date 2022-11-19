package Figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_Principal extends JFrame implements ActionListener {
    
private Container contenedor;
private JButton cilindro, esfera, pirámide;

public V_Principal(){
    inicio();
    setTitle("Figuras"); 
    setSize(350,160); 
    setLocationRelativeTo(null); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void inicio() {
    
    contenedor = getContentPane(); 
    contenedor.setLayout(null); 
    
    cilindro = new JButton();
    cilindro.setText("Cilindro");
    cilindro.setBounds(20, 50, 80, 23);
    cilindro.addActionListener(this);
    
    esfera = new JButton();
    esfera.setText("Esfera");
    esfera.setBounds(125, 50, 80, 23); 
    esfera.addActionListener(this);
    
    pirámide = new JButton();
    pirámide.setText("Pirámide");
    pirámide.setBounds(225, 50, 100, 23); 
    pirámide.addActionListener(this);
    
    contenedor.add(cilindro);
    contenedor.add(esfera);
    contenedor.add(pirámide);
}

public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == esfera) { 
        V_Esfera esfera = new V_Esfera(); 
        esfera.setVisible(true); 
     }
    if (evento.getSource() == cilindro) { 
        V_Cilindro cilindro = new V_Cilindro(); 
        cilindro.setVisible(true);

    }
    if (evento.getSource() == pirámide) { 
        V_Piramide pirámide = new V_Piramide(); 
        pirámide.setVisible(true); 
    }
}

}
