package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * Diagrama:  Triangulo ──▷ FiguraGeometrica
 */
public class Triangulo extends FiguraGeometrica {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    // ── Constructor ──────────────────────────────────────────────────────────
    public Triangulo(String color, double ladoA, double ladoB, double ladoC) {
        super("Triángulo", color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // ── Getters y Setters ────────────────────────────────────────────────────
    public double getLadoA() { return ladoA; }
    public double getLadoB() { return ladoB; }
    public double getLadoC() { return ladoC; }
    public void setLadoA(double ladoA) { this.ladoA = ladoA; }
    public void setLadoB(double ladoB) { this.ladoB = ladoB; }
    public void setLadoC(double ladoC) { this.ladoC = ladoC; }

    /**
     * TODO #9 — calcularArea() con Fórmula de Herón
     *
     * Completa este método sobreescrito:
     *   Paso 1: calcula el semiperímetro → s = (ladoA + ladoB + ladoC) / 2.0
     *   Paso 2: retorna Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC))
     */
    @Override
    public double calcularArea() {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────
        return 0;   // ← reemplaza esta línea con los dos pasos indicados
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public void dibujar() {
        System.out.println("\n  Dibujando Triángulo de lados "
                + ladoA + ", " + ladoB + ", " + ladoC + ":");
        System.out.println("        *        ");
        System.out.println("       * *       ");
        System.out.println("      *   *      ");
        System.out.println("     *     *     ");
        System.out.println("    ***********  ");
    }
}
