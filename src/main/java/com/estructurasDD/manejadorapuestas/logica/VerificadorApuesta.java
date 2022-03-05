
package com.estructurasDD.manejadorapuestas.logica;

/**
 *
 * @author elvis_agui
 */
public class VerificadorApuesta {
    private String rechazadas = "APUESTAS RECHAZADAS:     \n";
    int tamaño=0;
    
    
    public Apuesta[] verficadorApuestas(Apuesta[] apuestas){
        for (int i = 0; i < apuestas.length; i++) {
            int [] posTem = new int[10];
            for (int j = 0; j < 10; j++) {
                if (!posCorrecta(apuestas[i].getOrdenLlegada()[j], posTem)) {
                    rechazadas += apuestas[i].toString();
                    apuestas[i] = null;
                   break; 
                } else{
                     tamaño++;
                } 
            }
        }
        return apuestas;
    }
    
    
    public boolean posCorrecta(int index, int pos[]){
        if (index > 0 && index <= 10  && pos[index-1]==0 ) {
            pos[index-1] = index;
            return true;
        }else{
            return false;
        }
    }

    public String getRechazadas() {
        return rechazadas;
    }
    
    public Apuesta[] limpiarApuestas(Apuesta[] apuestasConNull){
        Apuesta[] apuestas = new Apuesta[tamaño];
        int index =0;
        for (Apuesta apuestasConNull1 : apuestasConNull) {
            if (apuestasConNull != null) {
                apuestas[index] = apuestasConNull1;
                index++;
            } 
        }
        return apuestas;
    }
    
    
    
    
    
    
}
