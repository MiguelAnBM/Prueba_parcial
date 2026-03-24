package poo.fundamentos;

/**
 * TEMA: Herencia — Constructores — Sobreescritura (@Override)
 *
 * Diagrama:  Profesor ──▷ Persona
 */
public class Profesor extends Persona {

    // Atributos propios del Profesor
    private String codigoProfesor;
    private String departamento;
    private String titulo;
    private double salario;

    // ── Constructor por defecto ──────────────────────────────────────────────
    public Profesor() {
        super();
        this.codigoProfesor = "P000";
        this.departamento   = "Sin departamento";
        this.titulo         = "Licenciado";
        this.salario        = 0.0;
    }

    // ── Constructor con parámetros ───────────────────────────────────────────
    public Profesor(String nombre, String apellido, int edad, String identificacion,
                    String codigoProfesor, String departamento, String titulo, double salario) {
        super(nombre, apellido, edad, identificacion);
        this.codigoProfesor = codigoProfesor;
        this.departamento   = departamento;
        this.titulo         = titulo;
        this.salario        = salario;
    }

    // ── Getters ──────────────────────────────────────────────────────────────
    public String getCodigoProfesor() { return codigoProfesor; }
    public String getDepartamento()   { return departamento; }
    public String getTitulo()         { return titulo; }
    public double getSalario()        { return salario; }

    // ── Setters ──────────────────────────────────────────────────────────────
    public void setCodigoProfesor(String codigoProfesor) { this.codigoProfesor = codigoProfesor; }
    public void setDepartamento(String departamento)     { this.departamento = departamento; }
    public void setTitulo(String titulo)                 { this.titulo = titulo; }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario inválido: " + salario);
        }
    }

    // ── Sobreescritura (Polimorfismo en tiempo de ejecución) ─────────────────
    @Override
    public void presentarse() {
        super.presentarse();   // reutiliza la presentación del padre
        System.out.println("  → Soy profesor | Código: " + codigoProfesor
                + " | Departamento: " + departamento
                + " | Título: "       + titulo);
    }

    /**
     * TODO #5 — calcularSalarioAnual()
     *
     * Completa este método:
     *   - Retorna el salario mensual multiplicado por 12.
     */
    public double calcularSalarioAnual() {
        // ── ESCRIBE TU CÓDIGO AQUÍ ──────────────────────────────────────────
        return 0;   // ← reemplaza esta línea con el cálculo correcto
    }
}
