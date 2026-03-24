package poo.fundamentos;

/**
 * TEMA: Herencia — Constructores — Sobreescritura (@Override)
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:  Estudiante ──▷ Persona
 *
 * INSTRUCCIONES:
 *
 * 1. Indica que Estudiante HEREDA de Persona
 *    (usa la palabra reservada correcta en la declaración de la clase).
 *
 * 2. Declara los siguientes atributos PRIVADOS propios del Estudiante:
 *       codigoEstudiante (String), carrera (String),
 *       promedio (double), semestre (int)
 *
 * 3. Crea el CONSTRUCTOR POR DEFECTO:
 *       - Llama al constructor del padre usando super()
 *       - Inicializa: codigoEstudiante="E000", carrera="Sin carrera",
 *         promedio=0.0, semestre=1
 *
 * 4. Crea el CONSTRUCTOR CON PARÁMETROS:
 *       (String nombre, String apellido, int edad, String identificacion,
 *        String codigoEstudiante, String carrera, int semestre)
 *       - Usa super(nombre, apellido, edad, identificacion) para los datos del padre.
 *       - Asigna los atributos propios. El promedio inicia en 0.0.
 *
 * 5. Crea los GET y SET para los 4 atributos propios.
 *    setPromedio() debe validar que el valor esté entre 0.0 y 5.0.
 *
 * 6. SOBREESCRIBE el método presentarse() usando @Override:
 *       - Primero llama a super.presentarse() para reutilizar el padre.
 *       - Luego imprime:
 *         "  → Soy estudiante de <carrera> | Código: <cod> | Semestre: <sem> | Promedio: <prom>"
 *
 * 7. Crea el método estaAprobado() que retorne true si promedio >= 3.0.
 */
public class Estudiante {

}
