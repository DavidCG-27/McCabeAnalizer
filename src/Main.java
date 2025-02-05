package main;

import model.ComplexityModel;
import view.ComplexityView;
import controller.ComplexityController;

/**
 * Clase principal que inicia el programa y gestiona la ejecución.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Main <ruta_archivo.java>");
            return;
        }

        McCabeModel modelo = new McCabeModel();
        McCabeUI vista = new McCabeUI();
        McCabeController controlador = new McCabeController(modelo, vista);

        controlador.analizarCodigo(args[0]);
    }
}
