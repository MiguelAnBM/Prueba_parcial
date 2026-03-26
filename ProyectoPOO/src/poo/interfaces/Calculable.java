package poo.interfaces;

/**
 * TEMA: Interfaces — Abstracción
 */
public interface Calculable {

    // Constante (implícitamente public static final)
    double PI = Math.PI;

    // Métodos abstractos que toda figura DEBE implementar
    double calcularArea();
    double calcularPerimetro();

    /**
     * TODO #6 — mostrarResultados() - HECHO
     *
     * Completa este método default. Debe imprimir:
     *   "  Área       : <área con 2 decimales>"
     *   "  Perímetro  : <perímetro con 2 decimales>"
     *
     * Pista: usa String.format("%.2f", calcularArea())
     *        y    String.format("%.2f", calcularPerimetro())
     *
     * Los métodos default llevan la palabra reservada "default" antes del tipo.
     */
    default void mostrarResultados() {
        String areaDecimales = String.format("%.2f", calcularArea());
        String perimetroDecimales = String.format("%.2f", calcularPerimetro());
        
        System.out.println("Area       : " + areaDecimales);
        System.out.println("Perimetro  : " + perimetroDecimales);
    }
}
