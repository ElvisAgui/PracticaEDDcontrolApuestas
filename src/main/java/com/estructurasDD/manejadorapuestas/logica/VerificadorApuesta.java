package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class VerificadorApuesta {

    private String rechazadas = "APUESTAS RECHAZADAS:     \n";
    private int tamaño = 0;
    private long tiempoEjecucion = 0;
    private long tiempoPromedioVerificacion = 0;

    /**
     * el primer For es de complejidad O(n) y el for anidado es constante de 10
     * maximo por lo tanto es O(1)
     * @param apuestas
     * @return apuestas verificadas
     */
    public Apuesta[] verficadorApuestas(Apuesta[] apuestas) {
        this.tamaño = apuestas.length;
        for (int i = 0; i < apuestas.length; i++) {                                 //O(n)                                          //O(1)
            long tiempoInicial = System.nanoTime();
            int[] posTem = new int[10];                                             //O(1)
            for (int j = 0; j < 10; j++) {                                          //O(1) ya que no depende de n
                if (!posCorrecta(apuestas[i].getOrdenLlegada()[j], posTem)) {       //O(1)
                    rechazadas += apuestas[i].toString();                           //O(1)
                    apuestas[i] = null;                                             //O(1)
                    tamaño--;
                    break;
                }
            }
            tiempoEjecucion += (System.nanoTime() - tiempoInicial);
        }
        tiempoPromedioVerificacion = tiempoEjecucion / apuestas.length;
        return apuestas;
    }

    /**
     * verifica que la posicion no este repetida en un arreglo donde solo puede
     * existir 10 valores
     * @param index
     * @param pos
     * @return
     */
    public boolean posCorrecta(int index, int pos[]) {                  //O(1)
        if (index > 0 && index <= 10 && pos[index - 1] == 0) {
            pos[index - 1] = index;
            return true;
        } else {
            return false;
        }
    }

    public String getRechazadas() {
        return rechazadas;
    }

    /**
     * quita los nullos del arreglo que ya fue verificado este mismo no afecta
     * al algoritmo de verificacion como tal
     * @param apuestasConNull
     * @return
     */
    public Apuesta[] limpiarApuestas(Apuesta[] apuestasConNull) {
        Apuesta[] apuestas = new Apuesta[tamaño];
        int index = 0;
        for (int i = 0; i < apuestasConNull.length; i++) {
            if (null != apuestasConNull[i]) {
                apuestas[index] = apuestasConNull[i];
                index++;
            }

        }
        return apuestas;
    }

    public long getTiempoPromedioVerificacion() {
        return tiempoPromedioVerificacion;
    }

}
 