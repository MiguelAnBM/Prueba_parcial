package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * Diagrama:  Rectangulo ──▷ FiguraGeometrica
 */
public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    // ── Constructor ──────────────────────────────────────────────────────────
    public Rectangulo(String color, double base, double altura) {
        super("Rectangulo", color);
        this.base   = base;
        this.altura = altura;
    }

    // ── Getters y Setters ────────────────────────────────────────────────────
    public double getBase()   { return base; }
    public double getAltura() { return altura; }

    public void setBase(double base) {
        if (base > 0) this.base = base;
        else System.out.println("Base invalida: " + base);
    }

    public void setAltura(double altura) {
        if (altura > 0) this.altura = altura;
        else System.out.println("Altura invalida: " + altura);
    }

    // ── Métodos sobreescritos ────────────────────────────────────────────────
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("\n  Dibujando Rectangulo de base " + base + " y altura " + altura + ":");
        System.out.println("  +------------+");
        System.out.println("  |            |");
        System.out.println("  |            |");
        System.out.println("  +------------+");
    }
}
