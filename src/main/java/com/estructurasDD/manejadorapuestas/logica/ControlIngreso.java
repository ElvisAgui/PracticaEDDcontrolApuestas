
package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class ControlIngreso {
    
     /**
     * Ingreso de apuesta O(1) al arreglo de apuestas
     * @param apuesta
     * @param apuestas
     * @param pos
     */
    public void ingresarApuesta(Apuesta apuesta, Apuesta[] apuestas) {
        apuestas[apuestas.length-1] = apuesta;
    }

    /**
     * aumenta el tamaño del arreglo en un valor +
     * @param apuestas
     * @return
     */
    public Apuesta[] aumentarTamañoArreglo(Apuesta[] apuestas) {
        if (apuestas == null) {
            return new Apuesta[1];
        } else {
            Apuesta[] aumentado = new Apuesta[apuestas.length + 1];
            System.arraycopy(apuestas, 0, aumentado, 0, apuestas.length);
            return aumentado;
        }

    }
    
}
