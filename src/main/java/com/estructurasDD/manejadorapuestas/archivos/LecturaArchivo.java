package com.estructurasDD.manejadorapuestas.archivos;

import com.estructurasDD.manejadorapuestas.logica.Apuesta;
import com.estructurasDD.manejadorapuestas.logica.ControlIngreso;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author elvis_agui
 */
public class LecturaArchivo {

    public Apuesta[] leerFichero(File archivo, JTextArea text, Apuesta[] apuestas, ControlIngreso ingreso) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            if (!linea.equalsIgnoreCase("")) {
                apuestas = ingreso.aumentarTamañoArreglo(apuestas);
                ingreso.ingresarApuesta(nuevaApuesta(apuestasString(linea)), apuestas);
                text.append(linea + "\n");
            }
        }
        fr.close();
        return apuestas;
    }

    private String[] apuestasString(String linea) {
        return linea.split(",");
    }

    private int[] separarPos(String[] apuestaString) {
        int posiciones[] = new int[10];
        for (int i = 0; i < posiciones.length; i++) {
            try {
                posiciones[i] = Integer.parseInt(apuestaString[i + 2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "esta posicion de entrada es invalida" + posiciones[i]);
            }
        }
        return posiciones;
    }

    /**
     * genera una nueva apuesta con base al arreglo de atributos
     *
     * @param apuestaString arreglo de atributos
     * @return
     */
    private Apuesta nuevaApuesta(String[] apuestaString) {
        return new Apuesta(Double.parseDouble(apuestaString[1]), separarPos(apuestaString), apuestaString[0]);
    }

}
