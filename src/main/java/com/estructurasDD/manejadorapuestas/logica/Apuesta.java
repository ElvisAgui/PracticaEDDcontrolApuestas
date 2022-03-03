
package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class Apuesta {
    private double cantidadApostada;
    private int [] ordenLlegada;
    private String Apostador;
    
    
    public Apuesta(double cantidadApostada, int[] ordenLlegada, String Apostador) {
        this.cantidadApostada = cantidadApostada;
        this.ordenLlegada = ordenLlegada;
        this.Apostador = Apostador;
    }
    
    public Apuesta(){
        
    }
    
    
    
}
