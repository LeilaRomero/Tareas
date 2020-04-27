/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_7;

/**
 *
 * @author Leila
 */
public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int nMastiles, float eslora, int dias,String matricula) {
        super(eslora, dias, matricula);
        this.numeroMastiles = nMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }
    
    @Override
    public void CalcularPrecio() {
        float precio=10*super.getEslora()*super.getDias()+8*numeroMastiles;
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString()+"Numero de mastiles es de " + numeroMastiles;
    } 
}
