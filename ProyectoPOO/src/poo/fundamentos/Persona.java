package poo.fundamentos;

/**
 * TEMA: Encapsulación — Constructores — Get/Set
 */
public class Persona {

    // Atributos privados (Encapsulación)
    private String nombre;
    private String apellido;
    private int    edad;
    private String identificacion;

    // ── Constructor por defecto ──────────────────────────────────────────────
    public Persona() {
        this.nombre         = "Sin nombre";
        this.apellido       = "Sin apellido";
        this.edad           = 0;
        this.identificacion = "000";
    }

    // ── Constructor con parámetros ───────────────────────────────────────────
    public Persona(String nombre, String apellido, int edad, String identificacion) {
        this.nombre         = nombre;
        this.apellido       = apellido;
        this.edad           = edad;
        this.identificacion = identificacion;
    }

    // ── Getters ──────────────────────────────────────────────────────────────
    public String getNombre()         { return nombre; }
    public String getApellido()       { return apellido; }
    public int    getEdad()           { return edad; }
    public String getIdentificacion() { return identificacion; }

    // ── Setters ──────────────────────────────────────────────────────────────
    public void setNombre(String nombre)               { this.nombre = nombre; }
    public void setApellido(String apellido)           { this.apellido = apellido; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    /**
     * TODO #1 — setEdad con validación - HECHO
     *
     * Completa este setter:
     *   - Si la edad está entre 0 y 120 (inclusive), asígnala a this.edad.
     *   - Si NO es válida, imprime: "Edad inválida: <valor>"
     */
    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad invalida: " + edad);
        }
        this.edad = edad;
    }

    // ── Métodos ──────────────────────────────────────────────────────────────
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    /**
     * TODO #2 — presentarse() - HECHO
     *
     * Completa este método. Debe imprimir exactamente:
     *   "Hola, soy <nombreCompleto> | ID: <identificacion> | Edad: <edad>"
     *
     * Pista: usa getNombreCompleto() para obtener el nombre completo.
     * NOTA: las subclases sobreescribirán este método (polimorfismo).
     */
    public void presentarse() {
        System.out.println("Hola, soy " + getNombreCompleto() + " | " + "ID: " + identificacion + " | " + "Edad: " + edad);
    }
}
