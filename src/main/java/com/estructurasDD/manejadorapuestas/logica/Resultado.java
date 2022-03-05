package com.estructurasDD.manejadorapuestas.logica;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elvis_agui
 */
public class Resultado {

    public Apuesta[] calcularPuntaje(int[] orden, Apuesta[] apuestas) {
        for (int i = 0; i < apuestas.length; i++) {//n
            int ganado = 0;
            int[] temp = apuestas[i].getOrdenLlegada();
            Apuesta apuestaT = apuestas[i];
            for (int j = 0; j < 10; j++) {// 1 
                if (orden[j] == temp[j]) {
                    ganado = ganado + (10 - j);
                }
            }
            apuestaT.setPuntaje(ganado);
        }
        return apuestas;
    }

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

}
