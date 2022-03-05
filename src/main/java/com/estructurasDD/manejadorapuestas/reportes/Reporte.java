
package com.estructurasDD.manejadorapuestas.reportes;

/**
 *
 * @author elvis_agui
 */
public class Reporte {
   
    private double timpoPormedio;
    private double procesamientoPromedio;
    private int pasosMayor;
    private int pasosMenor;

    public Reporte(double timpoPormedio, double procesamientoPromedio, int pasosMayor, int pasosMenor) {
        this.timpoPormedio = timpoPormedio;
        this.procesamientoPromedio = procesamientoPromedio;
        this.pasosMayor = pasosMayor;
        this.pasosMenor = pasosMenor;
    }
    
    public Reporte(){
        
    }

    public double getTimpoPormedio() {
        return timpoPormedio;
    }

    public void setTimpoPormedio(double timpoPormedio) {
        this.timpoPormedio = timpoPormedio;
    }

    public double getProcesamientoPromedio() {
        return procesamientoPromedio;
    }

    public void setProcesamientoPromedio(double procesamientoPromedio) {
        this.procesamientoPromedio = procesamientoPromedio;
    }

    public int getPasosMayor() {
        return pasosMayor;
    }

    public void setPasosMayor(int pasosMayor) {
        this.pasosMayor = pasosMayor;
    }

    public int getPasosMenor() {
        return pasosMenor;
    }

    public void setPasosMenor(int pasosMenor) {
        this.pasosMenor = pasosMenor;
    }
    
    
    
    
}
