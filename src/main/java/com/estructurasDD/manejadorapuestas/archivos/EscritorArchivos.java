package com.estructurasDD.manejadorapuestas.archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author elvis_agui
 */
public class EscritorArchivos {

    JFileChooser seleccionar = new JFileChooser();
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
     private String escribirArchivo(String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "archivo guardado";
        } catch (IOException e) {
            System.out.println("error en guardar");
        }
        return mensaje;
    }

    public void guardar(String rechazados) {
        if (seleccionar.showDialog(null, "guaradar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = rechazados;
                String mensaje = escribirArchivo(documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, "Archivo guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guarda archivo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar texto");
            }
        }
    }
    
    

}
