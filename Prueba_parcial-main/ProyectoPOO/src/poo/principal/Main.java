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

        // ====================================================================
        // SECCION 1 — Constructores y Objetos
        // ====================================================================
        System.out.println("==========================================");
        System.out.println(" SECCION 1 - Constructores y Objetos");
        System.out.println("==========================================");

        Persona p1 = new Persona();                                      // constructor por defecto
        Persona p2 = new Persona("Ana", "Torres", 30, "CC-1001");       // constructor con parametros

        p1.presentarse();
        p2.presentarse();

        // ====================================================================
        // SECCION 2 — GET y SET (Encapsulacion)
        // ====================================================================
        System.out.println("\n==========================================");
        System.out.println(" SECCION 2 - GET y SET (Encapsulacion)");
        System.out.println("==========================================");

        p1.setNombre("Carlos");
        p1.setApellido("Ruiz");
        p1.setIdentificacion("CC-9999");
        p1.setEdad(250);     // edad invalida -> debe imprimir advertencia
        p1.setEdad(45);      // edad valida
        System.out.println("Nombre completo : " + p1.getNombreCompleto());
        System.out.println("Edad asignada   : " + p1.getEdad());

        // ====================================================================
        // SECCION 3 — Herencia
        // ====================================================================
        System.out.println("\n==========================================");
        System.out.println(" SECCION 3 - Herencia");
        System.out.println("==========================================");

        Estudiante est = new Estudiante("Luis", "Gomez", 20, "TI-555",
                                        "EST-2024", "Ingenieria de Sistemas", 4);
        est.setPromedio(4.2);
        est.presentarse();
        System.out.println("Esta aprobado? " + est.estaAprobado());

        Profesor prof = new Profesor("Maria", "Lopez", 42, "CC-777",
                                     "PROF-010", "Ciencias Basicas", "Magister", 3500000);
        prof.presentarse();
        System.out.println("Salario anual: $" + prof.calcularSalarioAnual());

        // ====================================================================
        // SECCION 4 — Polimorfismo / Sobreescritura (tiempo de ejecucion)
        // ====================================================================
        System.out.println("\n==========================================");
        System.out.println(" SECCION 4 - Sobreescritura (polimorfismo en tiempo de ejecucion)");
        System.out.println("==========================================");

        List<Persona> personas = new ArrayList<>();
        personas.add(p1);    // Persona
        personas.add(est);   // Estudiante  (es-un Persona)
        personas.add(prof);  // Profesor    (es-un Persona)

        for (Persona p : personas) {
            p.presentarse();   // el mismo metodo -> resultado diferente segun el objeto real
            System.out.println();
        }

        // ====================================================================
        // SECCION 5 — Polimorfismo / Sobrecarga (tiempo de compilacion)
        // ====================================================================
        System.out.println("==========================================");
        System.out.println(" SECCION 5 - Sobrecarga (polimorfismo en tiempo de compilacion)");
        System.out.println("==========================================");

        Calculadora calc = new Calculadora();
        System.out.println("  -> " + calc.sumar(3, 4));
        System.out.println("  -> " + calc.sumar(1, 2, 3));
        System.out.println("  -> " + calc.sumar(1.5, 2.5));
        System.out.println("  -> " + calc.sumar("Hola, ", "mundo!"));
        System.out.println("  -> " + calc.calcularArea(5.0));
        System.out.println("  -> " + calc.calcularArea(4.0, 6.0));
        System.out.println("  -> " + calc.calcularArea(3.0, true));

        // ====================================================================
        // SECCION 6 — Clases Abstractas e Interfaces
        // ====================================================================
        System.out.println("\n==========================================");
        System.out.println(" SECCION 6 - Clases Abstractas e Interfaces");
        System.out.println("==========================================");

        // FiguraGeometrica fig = new FiguraGeometrica("rojo"); // ERROR: no se puede instanciar

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo("azul", 5));
        figuras.add(new Rectangulo("verde", 4, 6));
        figuras.add(new Triangulo("rojo", 3, 4, 5));

        for (FiguraGeometrica fig : figuras) {
            fig.describir();     // TODO #7 (nombre, color, area y perimetro)
            fig.dibujar();       // figura ASCII
            fig.mostrarTipo();   // metodo default de Dibujable
        }

        // ====================================================================
        // SECCION 7 — Resumen de Pilares POO
        // ====================================================================
        System.out.println("\n==========================================");
        System.out.println(" SECCION 7 - Resumen de Pilares POO");
        System.out.println("==========================================");
        System.out.println("  Encapsulacion  -> Persona         (atributos privados + get/set con validacion)");
        System.out.println("  Herencia       -> Estudiante, Profesor  (extends Persona, uso de super())");
        System.out.println("  Polimorfismo   -> Sobreescritura: presentarse() en Estudiante/Profesor");
        System.out.println("                   Sobrecarga:     sumar()/calcularArea() en Calculadora");
        System.out.println("  Abstraccion    -> FiguraGeometrica (clase abstracta) + Calculable, Dibujable (interfaces)");
    }
}
