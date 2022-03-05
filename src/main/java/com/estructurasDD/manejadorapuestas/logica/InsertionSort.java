package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class InsertionSort {

    private long tiempoEjecucionPunaje = 0;
    private long tiempoEjecucionNombre = 0;
    private long tiempoPromedioOrdenamientoNombre = 0;
    private long tiempoPromedioOrdenamientoPuntaje = 0;
    
    
    /**
     * algoritmo para ordenamiento por puntaje O(n^2) metodo de insersion, Puntajes
     * @param apuestas
     * @return 
     */
    public Apuesta[] ordenarPorPuntaje(Apuesta[] apuestas) {            //O(n^2)
        this.inicializarTiempos();
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {                                 //O(n)
            long tiempoI = System.nanoTime();                                       //O(1)
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getPuntaje() < aux.getPuntaje())) {  //O(n)
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoEjecucionPunaje += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioOrdenamientoPuntaje = tiempoEjecucionPunaje / apuestas.length;
        return apuestas;
    }

    
    /**
     * algoritmo para ordenamiento por puntaje O(n^2) metodo de insersion, NOmbre
     * @param apuestas
     * @return 
     */
    public Apuesta[] ordenarPorNombre(Apuesta[] apuestas) {
        this.inicializarTiempos();
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {
            long tiempoI = System.nanoTime();
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getApostador().compareTo(aux.getApostador()) > 0)) {
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoEjecucionNombre += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioOrdenamientoNombre = tiempoEjecucionNombre / apuestas.length;

        return apuestas;
    }
    
    /**
     * inicializa el tiempo por si se llegara usar mas de una ves el tiempo no se aumente con el anterior
     */
    private void inicializarTiempos() {
        this.tiempoEjecucionNombre = 0;
        this.tiempoEjecucionPunaje = 0;
        this.tiempoPromedioOrdenamientoNombre = 0;
        this.tiempoPromedioOrdenamientoPuntaje = 0;
    }

    public long getTiempoPromedioOrdenamientoNombre() {
        return tiempoPromedioOrdenamientoNombre;
    }

    public long getTiempoPromedioOrdenamientoPuntaje() {
        return tiempoPromedioOrdenamientoPuntaje;
    }

}
