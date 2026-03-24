package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:  Rectangulo ──▷ FiguraGeometrica
 *
 * INSTRUCCIONES:
 *
 * 1. Indica que Rectangulo HEREDA de FiguraGeometrica.
 *
 * 2. Declara los atributos PRIVADOS:
 *       base (double), altura (double)
 *
 * 3. Crea el CONSTRUCTOR CON PARÁMETROS (String color, double base, double altura):
 *       - Llama a super("Rectángulo", color)
 *       - Asigna base y altura.
 *
 * 4. Crea los GET y SET para base y altura.
 *    Ambos setters deben validar que el valor sea > 0.
 *
 * 5. SOBREESCRIBE calcularArea() con @Override:
 *       Fórmula: base * altura
 *
 * 6. SOBREESCRIBE calcularPerimetro() con @Override:
 *       Fórmula: 2 * (base + altura)
 *
 * 7. SOBREESCRIBE dibujar() con @Override:
 *       Imprime un mensaje y una figura ASCII rectangular.
 */
public class Rectangulo {

}
