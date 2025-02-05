package controller;

import model.ComplexityModel;
import view.ComplexityView;
import java.io.IOException;

/**
 * Clase que representa el controlador y gestiona la interacción entre el modelo y la vista.
 */
public class McCabeController {
    private McCabeModel modelo;
    private McCabeUI vista;

    /**
     * Constructor del controlador.
     * 
     * @param modelo Instancia del modelo.
     * @param vista Instancia de la vista.
     */
    public McCabeController(McCabeModel modelo, McCabeUI vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    /**
     * Analiza el código fuente en la ruta proporcionada y muestra la complejidad ciclomatica.
     * 
     * @param rutaArchivo Ruta del archivo de código fuente.
     */
    public void analizarCodigo(String rutaArchivo) {
        try {
            int complejidad = modelo.calcularComplejidad(rutaArchivo);
            vista.mostrarResultado(complejidad);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
