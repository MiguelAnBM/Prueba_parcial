package poo.abstractas;

/**
 * TEMA: Herencia — Clases Abstractas — Sobreescritura (@Override)
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:  Circulo ──▷ FiguraGeometrica
 *
 * INSTRUCCIONES:
 *
 * 1. Indica que Circulo HEREDA de FiguraGeometrica.
 *
 * 2. Declara el atributo PRIVADO:
 *       radio (double)
 *
 * 3. Crea el CONSTRUCTOR CON PARÁMETROS (String color, double radio):
 *       - Llama a super("Círculo", color)
 *       - Asigna el radio.
 *
 * 4. Crea el GET y el SET para radio.
 *    setRadio() debe validar que radio > 0.
 *
 * 5. SOBREESCRIBE calcularArea() con @Override:
 *       Fórmula: PI * radio * radio
 *       (PI está disponible desde la interfaz Calculable)
 *
 * 6. SOBREESCRIBE calcularPerimetro() con @Override:
 *       Fórmula: 2 * PI * radio
 *
 * 7. SOBREESCRIBE dibujar() con @Override:
 *       Imprime un mensaje indicando que se dibuja un círculo
 *       de radio <radio> y muestra una figura ASCII.
 */
public class Circulo {

}
