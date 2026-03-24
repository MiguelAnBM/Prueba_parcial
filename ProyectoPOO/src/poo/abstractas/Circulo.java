package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * Diagrama:  Circulo ──▷ FiguraGeometrica
 */
public class Circulo extends FiguraGeometrica {

    private double radio;

    // ── Constructor ──────────────────────────────────────────────────────────
    public Circulo(String color, double radio) {
        super("Círculo", color);
        this.radio = radio;
    }

    // ── Getter y Setter ──────────────────────────────────────────────────────
    public double getRadio() { return radio; }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Radio inválido: " + radio);
        }
    }

    /**
     * TODO #8 — calcularArea()
     *
     * Completa este método sobreescrito:
     *   Fórmula: PI * radio * radio
     *   (PI está disponible desde la interfaz Calculable)
     */
    @Override
    public double calcularArea() {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────
        return 0;   // ← reemplaza esta línea con la fórmula correcta
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("\n  Dibujando Círculo de radio " + radio + ":");
        System.out.println("      ***      ");
        System.out.println("   *       *   ");
        System.out.println("  *         *  ");
        System.out.println("   *       *   ");
        System.out.println("      ***      ");
    }
}
