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
public class Yate extends Barco {
    private int numeroCamarotes, cv;

    public Yate() {
    }

    public Yate(int nCamarotes, int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.numeroCamarotes = nCamarotes;
        this.cv = cv;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public int getCv() {
        return cv;
    }

    
    @Override
    public void CalcularPrecio() {
        float precio=10*super.getEslora()*super.getDias()+2*cv+25*numeroCamarotes;
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString()+"Numero de camarotes es de " + numeroCamarotes + 
                "\ncv son " + cv;
    }  
}
