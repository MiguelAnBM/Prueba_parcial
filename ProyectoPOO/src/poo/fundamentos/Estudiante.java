package poo.fundamentos;

/**
 * TEMA: Herencia — Constructores — Sobreescritura (@Override)
 *
 * Diagrama:  Estudiante ──▷ Persona
 */
public class Estudiante extends Persona {

    // Atributos propios del Estudiante
    private String codigoEstudiante;
    private String carrera;
    private double promedio;
    private int    semestre;

    // ── Constructor por defecto ──────────────────────────────────────────────
    public Estudiante() {
        super();
        this.codigoEstudiante = "E000";
        this.carrera          = "Sin carrera";
        this.promedio         = 0.0;
        this.semestre         = 1;
    }

    // ── Constructor con parámetros ───────────────────────────────────────────
    public Estudiante(String nombre, String apellido, int edad, String identificacion,
                      String codigoEstudiante, String carrera, int semestre) {
        super(nombre, apellido, edad, identificacion);
        this.codigoEstudiante = codigoEstudiante;
        this.carrera          = carrera;
        this.semestre         = semestre;
        this.promedio         = 0.0;   // el promedio siempre inicia en 0
    }

    // ── Getters ──────────────────────────────────────────────────────────────
    public String getCodigoEstudiante() { return codigoEstudiante; }
    public String getCarrera()          { return carrera; }
    public double getPromedio()         { return promedio; }
    public int    getSemestre()         { return semestre; }

    // ── Setters ──────────────────────────────────────────────────────────────
    public void setCodigoEstudiante(String codigoEstudiante) { this.codigoEstudiante = codigoEstudiante; }
    public void setCarrera(String carrera)                   { this.carrera = carrera; }
    public void setSemestre(int semestre)                    { this.semestre = semestre; }

    /**
     * TODO #3 — setPromedio con validación
     *
     * Completa este setter:
     *   - Si el promedio está entre 0.0 y 5.0 (inclusive), asígnalo a this.promedio.
     *   - Si NO es válido, imprime: "Promedio inválido: <valor>"
     */
    public void setPromedio(double promedio) {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────

    }

    // ── Sobreescritura (Polimorfismo en tiempo de ejecución) ─────────────────
    @Override
    public void presentarse() {
        super.presentarse();   // reutiliza la presentación del padre
        System.out.println("  → Soy estudiante de " + carrera
                + " | Código: "   + codigoEstudiante
                + " | Semestre: " + semestre
                + " | Promedio: " + promedio);
    }

    /**
     * TODO #4 — estaAprobado()
     *
     * Completa este método:
     *   - Retorna true  si el promedio es mayor o igual a 3.0.
     *   - Retorna false en caso contrario.
     */
    public boolean estaAprobado() {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────
        return false;   // ← reemplaza esta línea con la condición correcta
    }
}
