package poo.polimorfismo;

/**
 * TEMA: Polimorfismo — SOBRECARGA de métodos (Overloading)
 *
 * La sobrecarga: mismo nombre, diferente firma, DENTRO de la misma clase.
 * Se resuelve en TIEMPO DE COMPILACIÓN (polimorfismo estático).
 */
public class Calculadora {

    // ── Versiones sobrecargadas de sumar() ───────────────────────────────────

    public int sumar(int a, int b) {
        System.out.println("  sumar(int, int)");
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        System.out.println("  sumar(int, int, int)");
        return a + b + c;
    }

    public double sumar(double a, double b) {
        System.out.println("  sumar(double, double)");
        return a + b;
    }

    /**
     * TODO #10 — sumar(String a, String b)
     *
     * Completa este método sobrecargado:
     *   1. Imprime: "  sumar(String, String)"
     *   2. Retorna la concatenación de los dos Strings (a + b).
     */
    public String sumar(String a, String b) {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────
        return "";   // ← reemplaza esta línea
    }

    // ── Versiones sobrecargadas de calcularArea() ────────────────────────────

    public double calcularArea(double lado) {
        System.out.println("  calcularArea(lado) → cuadrado");
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        System.out.println("  calcularArea(base, altura) → rectángulo");
        return base * altura;
    }

    public double calcularArea(double radio, boolean esCirculo) {
        System.out.println("  calcularArea(radio, bool) → círculo");
        return Math.PI * radio * radio;
    }
}
