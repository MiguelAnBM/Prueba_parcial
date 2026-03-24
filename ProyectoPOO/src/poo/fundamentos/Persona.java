package poo.fundamentos;

/**
 * TEMA: Estructura POO — Encapsulación — Constructores — Get/Set
 *
 * INSTRUCCIONES:
 *
 * 1. Declara 4 atributos PRIVADOS (encapsulación):
 *       nombre (String), apellido (String), edad (int), identificacion (String)
 *
 * 2. Crea un CONSTRUCTOR POR DEFECTO que inicialice:
 *       nombre="Sin nombre", apellido="Sin apellido", edad=0, identificacion="000"
 *
 * 3. Crea un CONSTRUCTOR CON PARÁMETROS para los 4 atributos.
 *
 * 4. Crea los 4 métodos GET (uno por atributo).
 *
 * 5. Crea los 4 métodos SET:
 *       - setNombre, setApellido, setIdentificacion → asignación directa
 *       - setEdad → con VALIDACIÓN: solo asignar si está entre 0 y 120,
 *         si no, imprimir "Edad inválida: <valor>"
 *
 * 6. Crea el método getNombreCompleto() que retorne nombre + " " + apellido.
 *
 * 7. Crea el método presentarse() que imprima:
 *       "Hola, soy <nombreCompleto> | ID: <id> | Edad: <edad>"
 *    NOTA: este método será sobreescrito en las subclases (polimorfismo).
 */
public class Persona {

}
