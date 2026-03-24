package poo.abstractas;

import poo.interfaces.Calculable;
import poo.interfaces.Dibujable;

/**
 * TEMA: Clases Abstractas — Interfaces — Herencia — Abstracción
 *
 * Diagrama:
 *   FiguraGeometrica ─ ─ ─▷ Calculable   (implementa)
 *   FiguraGeometrica ─ ─ ─▷ Dibujable    (implementa)
 *   Circulo    ──▷ FiguraGeometrica
 *   Rectangulo ──▷ FiguraGeometrica
 *   Triangulo  ──▷ FiguraGeometrica
 *
 * NOTA: Una clase abstracta NO puede instanciarse directamente.
 */
public abstract class FiguraGeometrica implements Calculable, Dibujable {

    // Atributos privados
    private String nombre;
    private String color;

    // ── Constructor ──────────────────────────────────────────────────────────
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color  = color;
    }

    // ── Getters y Setters ────────────────────────────────────────────────────
    public String getNombre()          { return nombre; }
    public void   setNombre(String n)  { this.nombre = n; }
    public String getColor()           { return color; }
    public void   setColor(String c)   { this.color = c; }

    /**
     * TODO #7 — describir()
     *
     * Completa este método concreto. Debe:
     *   1. Imprimir: "\n[<nombre>] Color: <color>"
     *   2. Llamar a mostrarResultados()
     *      (método default heredado de la interfaz Calculable)
     */
    public void describir() {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────

    }

    // ── Métodos abstractos: las subclases ESTÁN OBLIGADAS a implementarlos ───
    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract void dibujar();
}
