package tarea_1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Leila
 */
public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta1, etiqueta2;
    JTextField lineaDeTexto1, lineaDeTexto2;
    JTextArea area;
    
    public Componentes(){
        
        marco = new JFrame("componentes");
        panel = new JPanel();
        etiqueta1 = new JLabel();
        lineaDeTexto1 = new JTextField();
        etiqueta2 = new JLabel();
        lineaDeTexto2 = new JTextField();
        boton1 = new JButton("LIMPAR");
        boton2 = new JButton("PREMER");
        area = new JTextArea("Area de texto.");

        marco.setSize(600, 400);
        panel.setSize(600, 400);
        etiqueta1.setText("NOME");
        lineaDeTexto1.setSize(200, 200);
        lineaDeTexto1.setText("      ");
        etiqueta2.setText("PASSWORD");
        lineaDeTexto2.setSize(200, 200);
        lineaDeTexto2.setText("      ");
        area.setSize(200,500);
        
        panel.add(etiqueta1);
        panel.add(lineaDeTexto1);
        panel.add(etiqueta2);
        panel.add(lineaDeTexto2);
        panel.add(area);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
