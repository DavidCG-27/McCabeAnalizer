package view;

/**
 * Clase que representa la vista y se encarga de mostrar los resultados al usuario.
 */
public class ComplexityView {
    /**
     * Muestra la complejidad ciclomatica calculada.
     * 
     * @param complejidad Valor de la complejidad ciclomatica.
     */
    public void mostrarResultado(int complejidad) {
        System.out.println("La complejidad ciclomatica del código es: " + complejidad);
    }
}
