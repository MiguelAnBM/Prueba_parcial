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
     * TODO #6 — mostrarResultados()
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
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────

    }
}
