/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Tarea_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Barco>listaBarcos=new ArrayList<>();
        Yate yate=new Yate(12,6000,36,15,"Xexabel");
        Deportivo deportivo=new Deportivo(10000,100,15,"Logan");
        Velero velero=new Velero(7,30,10,"Lillies");
        yate.CalcularPrecio();
        velero.CalcularPrecio();
        deportivo.CalcularPrecio();
        listaBarcos.add(yate);
        listaBarcos.add(velero);
        listaBarcos.add(deportivo);
        for(Barco l:listaBarcos){
            JOptionPane.showMessageDialog(null,l);
        }
    }
    
}
