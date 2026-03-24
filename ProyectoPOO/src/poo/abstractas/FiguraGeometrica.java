package poo.abstractas;

import poo.interfaces.Calculable;
import poo.interfaces.Dibujable;

/**
 * TEMA: Clases Abstractas — Interfaces — Herencia — Abstracción
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:
 *   FiguraGeometrica ─ ─ ─▷ Calculable   (implementa)
 *   FiguraGeometrica ─ ─ ─▷ Dibujable    (implementa)
 *   Circulo    ──▷ FiguraGeometrica       (hereda)
 *   Rectangulo ──▷ FiguraGeometrica       (hereda)
 *   Triangulo  ──▷ FiguraGeometrica       (hereda)
 *
 * INSTRUCCIONES:
 *
 * 1. Declara la clase como ABSTRACTA e indica que IMPLEMENTA
 *    las interfaces Calculable y Dibujable.
 *
 * 2. Declara 2 atributos PRIVADOS:
 *       nombre (String), color (String)
 *
 * 3. Crea el CONSTRUCTOR CON PARÁMETROS (String nombre, String color).
 *
 * 4. Crea los GET y SET para nombre y color.
 *
 * 5. Crea el método concreto describir() que imprima:
 *       "\n[<nombre>] Color: <color>"
 *    y luego llame a mostrarResultados()
 *    (método default heredado de la interfaz Calculable).
 *
 * 6. Declara los siguientes métodos como ABSTRACTOS (las subclases
 *    concretas estarán obligadas a implementarlos):
 *       public abstract double calcularArea()
 *       public abstract double calcularPerimetro()
 *       public abstract void dibujar()
 *
 * NOTA: Una clase abstracta NO puede instanciarse directamente.
 *       Solo se puede instanciar a través de sus subclases concretas.
 */
public class FiguraGeometrica {

}
