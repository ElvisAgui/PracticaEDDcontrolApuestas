
package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class Apuesta {
    private double cantidadApostada;
    private int [] ordenLlegada;
    private String Apostador;
    private int puntaje;
    
    
    public Apuesta(double cantidadApostada, int[] ordenLlegada, String Apostador) {
        this.cantidadApostada = cantidadApostada;
        this.ordenLlegada = ordenLlegada;
        this.Apostador = Apostador;
    }
    
    public Apuesta(){
        
    }

    public double getCantidadApostada() {
        return cantidadApostada;
    }

    public void setCantidadApostada(double cantidadApostada) {
        this.cantidadApostada = cantidadApostada;
    }

    public int[] getOrdenLlegada() {
        return ordenLlegada;
    }

    public void setOrdenLlegada(int[] ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }

    public String getApostador() {
        return Apostador;
    }

    public void setApostador(String Apostador) {
        this.Apostador = Apostador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
