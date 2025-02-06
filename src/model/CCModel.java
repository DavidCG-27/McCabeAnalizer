package model;

import java.io.*;
import java.util.regex.*;

/**
 * Clase que representa el modelo y realiza el cálculo de la complejidad ciclomatica.
 */
public class CCModel {
    /**
     * Calcula la complejidad ciclomatica de un archivo de código fuente en Java.
     * 
     * @param rutaArchivo Ruta del archivo a analizar.
     * @return Complejidad ciclomatica calculada.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public int calcularComplejidad(String rutaArchivo) throws IOException {
        int edges = 0, nodes = 0;
        Pattern pattern = Pattern.compile("\\b(if|for|while|case|catch|&&|\\|\\|)\\b");

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(linea);
                while (matcher.find()) {
                    edges++;
                }
                nodes++;
            }
        }

        return edges - nodes + 2; // Fórmula de McCabe: M = E - N + 2
    }
}
