/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtarea1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author afernandezfontenla
 */
public class main {
    
    JFrame marco;
    JButton boton,boton2;
    JLabel etiqueta,etiqueta2;
    JPanel panel;
    JTextField texto,texto2;
    JTextArea area;
    
    public main(){
        
        marco = new JFrame( "componentes: ");
        panel = new JPanel();
        etiqueta = new JLabel();
        etiqueta2 = new JLabel();
        texto = new JTextField();
        texto2 = new JTextField();
        boton = new JButton(" botón 1 ");
        boton2 = new JButton(" botón 2 ");
        area = new JTextArea(" text area ");
        marco.setSize(900,600);
        panel.setSize(900,600);
        etiqueta.setText("nombre: ");
        texto.setSize(300,300);
        texto.setText(" ");
        etiqueta2.setText("edad: ");
        
        texto2.setSize(300,300);
        texto2.setText(" ");
        
        area.setSize(300,600);
        
        panel.add(etiqueta);
        panel.add(texto);
        panel.add(etiqueta2);
        panel.add(texto2);
        panel.add(area);
        panel.add(boton);
        panel.add(boton2);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
