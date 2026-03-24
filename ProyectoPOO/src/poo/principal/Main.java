package poo.principal;

import poo.fundamentos.Estudiante;
import poo.fundamentos.Persona;
import poo.fundamentos.Profesor;
import poo.abstractas.Circulo;
import poo.abstractas.FiguraGeometrica;
import poo.abstractas.Rectangulo;
import poo.abstractas.Triangulo;
import poo.polimorfismo.Calculadora;
import java.util.ArrayList;
import java.util.List;

/**
 * CLASE PRINCIPAL — Integración de todos los temas POO
 *
 * IMPORTANTE: Este archivo solo compilará correctamente una vez que hayas
 *             completado los 10 TODO distribuidos en las demás clases.
 */
public class Main {

    public static void main(String[] args) {

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 1 — Constructores y Objetos
        // ════════════════════════════════════════════════════════════════════
        System.out.println("══════════════════════════════════════════");
        System.out.println(" SECCIÓN 1 — Constructores y Objetos");
        System.out.println("══════════════════════════════════════════");

        Persona p1 = new Persona();                                      // constructor por defecto
        Persona p2 = new Persona("Ana", "Torres", 30, "CC-1001");       // constructor con parámetros

        p1.presentarse();
        p2.presentarse();

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 2 — GET y SET (Encapsulación)
        // ════════════════════════════════════════════════════════════════════
        System.out.println("\n══════════════════════════════════════════");
        System.out.println(" SECCIÓN 2 — GET y SET (Encapsulación)");
        System.out.println("══════════════════════════════════════════");

        p1.setNombre("Carlos");
        p1.setApellido("Ruiz");
        p1.setIdentificacion("CC-9999");
        p1.setEdad(250);     // edad inválida → debe imprimir advertencia
        p1.setEdad(45);      // edad válida
        System.out.println("Nombre completo : " + p1.getNombreCompleto());
        System.out.println("Edad asignada   : " + p1.getEdad());

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 3 — Herencia
        // ════════════════════════════════════════════════════════════════════
        System.out.println("\n══════════════════════════════════════════");
        System.out.println(" SECCIÓN 3 — Herencia");
        System.out.println("══════════════════════════════════════════");

        Estudiante est = new Estudiante("Luis", "Gómez", 20, "TI-555",
                                        "EST-2024", "Ingeniería de Sistemas", 4);
        est.setPromedio(4.2);
        est.presentarse();
        System.out.println("¿Está aprobado? " + est.estaAprobado());

        Profesor prof = new Profesor("María", "López", 42, "CC-777",
                                     "PROF-010", "Ciencias Básicas", "Magíster", 3500000);
        prof.presentarse();
        System.out.println("Salario anual: $" + prof.calcularSalarioAnual());

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 4 — Polimorfismo / Sobreescritura (tiempo de ejecución)
        // ════════════════════════════════════════════════════════════════════
        System.out.println("\n══════════════════════════════════════════");
        System.out.println(" SECCIÓN 4 — Sobreescritura (polimorfismo en tiempo de ejecución)");
        System.out.println("══════════════════════════════════════════");

        List<Persona> personas = new ArrayList<>();
        personas.add(p1);    // Persona
        personas.add(est);   // Estudiante  (es-un Persona)
        personas.add(prof);  // Profesor    (es-un Persona)

        for (Persona p : personas) {
            p.presentarse();   // el mismo método → resultado diferente según el objeto real
            System.out.println();
        }

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 5 — Polimorfismo / Sobrecarga (tiempo de compilación)
        // ════════════════════════════════════════════════════════════════════
        System.out.println("══════════════════════════════════════════");
        System.out.println(" SECCIÓN 5 — Sobrecarga (polimorfismo en tiempo de compilación)");
        System.out.println("══════════════════════════════════════════");

        Calculadora calc = new Calculadora();
        System.out.println("  → " + calc.sumar(3, 4));
        System.out.println("  → " + calc.sumar(1, 2, 3));
        System.out.println("  → " + calc.sumar(1.5, 2.5));
        System.out.println("  → " + calc.sumar("Hola, ", "mundo!"));
        System.out.println("  → " + calc.calcularArea(5.0));
        System.out.println("  → " + calc.calcularArea(4.0, 6.0));
        System.out.println("  → " + calc.calcularArea(3.0, true));

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 6 — Clases Abstractas e Interfaces
        // ════════════════════════════════════════════════════════════════════
        System.out.println("\n══════════════════════════════════════════");
        System.out.println(" SECCIÓN 6 — Clases Abstractas e Interfaces");
        System.out.println("══════════════════════════════════════════");

        // FiguraGeometrica fig = new FiguraGeometrica("rojo"); // ERROR: no se puede instanciar

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo("azul", 5));
        figuras.add(new Rectangulo("verde", 4, 6));
        figuras.add(new Triangulo("rojo", 3, 4, 5));

        for (FiguraGeometrica fig : figuras) {
            fig.describir();     // TODO #7 (nombre, color, área y perímetro)
            fig.dibujar();       // figura ASCII
            fig.mostrarTipo();   // método default de Dibujable
        }

        // ════════════════════════════════════════════════════════════════════
        // SECCIÓN 7 — Resumen de Pilares POO
        // ════════════════════════════════════════════════════════════════════
        System.out.println("\n══════════════════════════════════════════");
        System.out.println(" SECCIÓN 7 — Resumen de Pilares POO");
        System.out.println("══════════════════════════════════════════");
        System.out.println("  Encapsulación  → Persona         (atributos privados + get/set con validación)");
        System.out.println("  Herencia       → Estudiante, Profesor  (extends Persona, uso de super())");
        System.out.println("  Polimorfismo   → Sobreescritura: presentarse() en Estudiante/Profesor");
        System.out.println("                   Sobrecarga:     sumar()/calcularArea() en Calculadora");
        System.out.println("  Abstracción    → FiguraGeometrica (clase abstracta) + Calculable, Dibujable (interfaces)");
    }
}
