package poo.interfaces;

/**
 * TEMA: Interfaces — segunda interfaz (implementación múltiple)
 */
public interface Dibujable {

    // Método abstracto: cada figura concreta define cómo se dibuja
    void dibujar();

    // Método default: comportamiento común a todas las figuras dibujables
    default void mostrarTipo() {
        System.out.println("  [Figura dibujable]");
    }
}
