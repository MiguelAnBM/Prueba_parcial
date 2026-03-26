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
        super("Circulo", color);
        this.radio = radio;
    }

    // ── Getter y Setter ──────────────────────────────────────────────────────
    public double getRadio() { return radio; }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Radio invalido: " + radio);
        }
    }

    /**
     * TODO #8 — calcularArea() - HECHO
     *
     * Completa este método sobreescrito:
     *   Fórmula: PI * radio * radio
     *   (PI está disponible desde la interfaz Calculable)
     */
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("\n  Dibujando Circulo de radio " + radio + ":");
        System.out.println("      ***      ");
        System.out.println("   *       *   ");
        System.out.println("  *         *  ");
        System.out.println("   *       *   ");
        System.out.println("      ***      ");
    }
}
