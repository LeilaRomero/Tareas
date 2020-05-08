/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_8_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Tarea_8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[][] array1 = {{15, 8, 20}, {2, 19, 13}};
        JOptionPane.showMessageDialog(null, "Número mínimo: " + Operaciones.numeroMinimo(array1) + "\nNúmero máximo: " + Operaciones.numeroMaximo(array1));
        Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a buscar: "));
        JOptionPane.showMessageDialog(null, Operaciones.numeroABuscar(array1, valor));
        Integer valor2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a borrar: "));
        JOptionPane.showMessageDialog(null, Operaciones.borrarValor(array1, valor2));
    }
    
}
