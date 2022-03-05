package com.estructurasDD.manejadorapuestas.reportes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elvis_agui
 */
public class Reporte {

    private double timpoPormedioVerificacion;
    private double timpoPormedioOrdenamientoN;
    private double timpoPormedioOrdenamientoP;
    private double timpoPormedioCalculoResultados;

    public double getTimpoPormedioVerificacion() {
        return timpoPormedioVerificacion;
    }

    public void setTimpoPormedioVerificacion(double timpoPormedioVerificacion) {
        this.timpoPormedioVerificacion = timpoPormedioVerificacion;
    }

    public double getTimpoPormedioOrdenamientoN() {
        return timpoPormedioOrdenamientoN;
    }

    public void setTimpoPormedioOrdenamientoN(double timpoPormedioOrdenamientoN) {
        this.timpoPormedioOrdenamientoN = timpoPormedioOrdenamientoN;
    }

    public double getTimpoPormedioOrdenamientoP() {
        return timpoPormedioOrdenamientoP;
    }

    public void setTimpoPormedioOrdenamientoP(double timpoPormedioOrdenamientoP) {
        this.timpoPormedioOrdenamientoP = timpoPormedioOrdenamientoP;
    }

    

    public double getTimpoPormedioCalculoResultados() {
        return timpoPormedioCalculoResultados;
    }

    public void setTimpoPormedioCalculoResultados(double timpoPormedioCalculoResultados) {
        this.timpoPormedioCalculoResultados = timpoPormedioCalculoResultados;
    }

    /**
     * enlista los datos de la apuesta en un tabla en la interfaz
     *
     * @param apuestas
     * @param table
     */
    public void reporteTabla(JTable table) {
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("T.P. calculo Resultados");
        modelo.addColumn("T.P. Verificacion");
        modelo.addColumn("T.P. Ordenamiento Nom");
        modelo.addColumn("T.P. Ordenamiento Punt");
        modelo.addRow(new Object[]{"NanoS "+this.timpoPormedioCalculoResultados, "NanoS "+this.timpoPormedioVerificacion, "NanoS "+this.timpoPormedioOrdenamientoN, "NanoS "+this.timpoPormedioOrdenamientoP});
        modelo.addRow(new Object[]{"Seg "+(this.timpoPormedioCalculoResultados/(9*Math.pow(10, 9))), "Seg "+(this.timpoPormedioVerificacion/(9*Math.pow(10, 9))), "Seg "+(this.timpoPormedioOrdenamientoN/(9*Math.pow(10, 9))), "Seg "+(this.timpoPormedioOrdenamientoP/(9*Math.pow(10, 9)))});

    }
}
