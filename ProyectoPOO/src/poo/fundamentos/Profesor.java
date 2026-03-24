package poo.fundamentos;

/**
 * TEMA: Herencia — Constructores — Sobreescritura (@Override)
 *
 * RELACIÓN EN DIAGRAMA DE CLASES:  Profesor ──▷ Persona
 *
 * INSTRUCCIONES:
 *
 * 1. Indica que Profesor HEREDA de Persona.
 *
 * 2. Declara los siguientes atributos PRIVADOS propios del Profesor:
 *       codigoProfesor (String), departamento (String),
 *       titulo (String), salario (double)
 *
 * 3. Crea el CONSTRUCTOR POR DEFECTO:
 *       - Llama a super()
 *       - Inicializa: codigoProfesor="P000", departamento="Sin departamento",
 *         titulo="Licenciado", salario=0.0
 *
 * 4. Crea el CONSTRUCTOR CON PARÁMETROS:
 *       (String nombre, String apellido, int edad, String identificacion,
 *        String codigoProfesor, String departamento, String titulo, double salario)
 *       - Usa super() para los datos del padre.
 *       - Asigna los atributos propios.
 *
 * 5. Crea los GET y SET para los 4 atributos propios.
 *    setSalario() debe validar que el valor sea >= 0.
 *
 * 6. SOBREESCRIBE presentarse() usando @Override:
 *       - Llama a super.presentarse()
 *       - Luego imprime:
 *         "  → Soy profesor | Código: <cod> | Departamento: <depto> | Título: <titulo>"
 *
 * 7. Crea el método calcularSalarioAnual() que retorne salario * 12.
 */
public class Profesor {

}
