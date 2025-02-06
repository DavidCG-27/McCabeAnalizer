package main;

import controller.CCController;
import model.CCModel;
import view.CCUI;

/**
 * Clase principal que inicia el programa y gestiona la ejecución.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Main <ruta_archivo.java>");
            return;
        }

        CCModel modelo = new CCModel();
        CCUI vista = new CCUI();
        CCController controlador = new CCController(modelo, vista);

        controlador.analizarCodigo(args[0]);
    }
}
