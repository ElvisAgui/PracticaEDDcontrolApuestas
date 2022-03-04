package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class InsertionSort {

    public Apuesta[] ordenarPorPuntaje(Apuesta[] apuestas) {
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getPuntaje() > aux.getCantidadApostada())) {
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
        }
        return apuestas;
    }

    public Apuesta[] ordenarPorNombre(Apuesta[] apuestas) {
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getApostador().compareTo(aux.getApostador()) > 0)) {
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
        }
        return apuestas;
    }

}
