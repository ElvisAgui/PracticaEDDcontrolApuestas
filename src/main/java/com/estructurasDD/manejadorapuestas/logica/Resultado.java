package com.estructurasDD.manejadorapuestas.logica;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elvis_agui
 */
public class Resultado {

    private long tiempoEjecucion = 0;
    private long tiempoPromedioResutados = 0;

    /**
     * algoritmo que calcula el puntaje de cada apuesta dependiendo el oreden de
     * entrada de caballos
     * @param ordenLlegada
     * @param apuestas
     * @return
     */
    public Apuesta[] calcularPuntaje(int[] ordenLlegada, Apuesta[] apuestas) {      //O(n)
        this.tiempoEjecucion = 0;
        this.tiempoPromedioResutados = 0;
        for (int i = 0; i < apuestas.length; i++) {                                 //O(n)
            long tiempoI = System.nanoTime();                                       //O(1)
            int puntajeAcumulado = 0;                                               //O(1)
            int[] temp = apuestas[i].getOrdenLlegada();                             //O(1)
            for (int j = 0; j < 10; j++) {                                          //O(1) ya que el for no depende de n
                if (ordenLlegada[j] == temp[j]) {
                    puntajeAcumulado = puntajeAcumulado + (10 - j);                 //O(1)
                }
            }
            apuestas[i].setPuntaje(puntajeAcumulado);
            tiempoEjecucion += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioResutados = tiempoEjecucion / apuestas.length;
        return apuestas;
    }

    /**
     * enlista los datos de la apuesta en un tabla en la interfaz
     * @param apuestas
     * @param table
     */
    public void reporteTabla(Apuesta[] apuestas, JTable table) {
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("Apostador");
        modelo.addColumn("Puntaje");
        modelo.addColumn("Aposto");
        modelo.addColumn("C.Ganador");
        modelo.addColumn("2do Lugar");
        modelo.addColumn("3er Lugar");
        for (int i = 0; i < apuestas.length; i++) {
            Apuesta apuesta = apuestas[i];
            if (apuesta != null) {
                modelo.addRow(new Object[]{apuesta.getApostador(), apuesta.getPuntaje(), apuesta.getCantidadApostada(), apuesta.getOrdenLlegada()[0], apuesta.getOrdenLlegada()[1], apuesta.getOrdenLlegada()[2]});
            }
        }
    }

    public long getTiempoPromedioResutados() {
        return tiempoPromedioResutados;
    }

}
