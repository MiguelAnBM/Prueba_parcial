package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:  Triangulo ──▷ FiguraGeometrica
 *
 * INSTRUCCIONES:
 *
 * 1. Indica que Triangulo HEREDA de FiguraGeometrica.
 *
 * 2. Declara los atributos PRIVADOS:
 *       ladoA (double), ladoB (double), ladoC (double)
 *
 * 3. Crea el CONSTRUCTOR CON PARÁMETROS
 *    (String color, double ladoA, double ladoB, double ladoC):
 *       - Llama a super("Triángulo", color)
 *       - Asigna los tres lados.
 *
 * 4. Crea los GET y SET para los tres lados.
 *
 * 5. SOBREESCRIBE calcularArea() con @Override usando la Fórmula de Herón:
 *       Paso 1 — calcula el semiperímetro: s = (ladoA + ladoB + ladoC) / 2.0
 *       Paso 2 — retorna: Math.sqrt(s * (s-ladoA) * (s-ladoB) * (s-ladoC))
 *
 * 6. SOBREESCRIBE calcularPerimetro() con @Override:
 *       Fórmula: ladoA + ladoB + ladoC
 *
 * 7. SOBREESCRIBE dibujar() con @Override:
 *       Imprime un mensaje y una figura ASCII triangular.
 */
public class Triangulo {

}
